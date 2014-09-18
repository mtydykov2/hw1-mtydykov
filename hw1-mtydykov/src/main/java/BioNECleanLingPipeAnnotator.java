import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.ResourceProcessException;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
import com.aliasi.util.AbstractExternalizable;
/**
 * 
 * This is an annotator that uses both LingPipe and rules to extract gene mentions.
 * @author mtydykov
 *
 */
public class BioNECleanLingPipeAnnotator extends JCasAnnotator_ImplBase {

  private File modelFile = null;

  private final static String PARAM_MODEL_FILE = "ModelFileName";

  private final static String[] badChars = new String[] { ")", "(" };
  
  @Override
  public void process(JCas arg0) throws AnalysisEngineProcessException {

    FSIterator it = arg0.getAnnotationIndex(SentenceData.type).iterator();
    PosTagNamedEntityRecognizer recognizer = null;
    if (modelFile != null) {
      try {
        Chunker chunker = (Chunker) AbstractExternalizable.readObject(modelFile);
        while (it.hasNext()) {
          SentenceData curr = (SentenceData) it.next();
          Chunking chunking = chunker.chunk(curr.getSentenceText());
          for (Chunk c : chunking.chunkSet()) {
            int begin = c.start();
            String before = curr.getSentenceText().substring(0, begin);
            before = before.replaceAll("\\s+", "");
            int end = c.end();
            String after = curr.getSentenceText().substring(0, end);
            after = after.replaceAll("\\s+", "");
            boolean badMention = false;
            for (String s : badChars) {
              if (curr.getSentenceText().substring(begin, end).contains(s)) {
                badMention = true;
              }
            }
            if (!badMention) {
              GeneMention mention = new GeneMention(arg0);
              mention.setMentionBegin(before.length());
              mention.setMentionEnd(after.length() - 1);
              mention.setMentionText(curr.getSentenceText().substring(begin, end));
              mention.setSentenceId(curr.getSentenceId());
              mention.addToIndexes();
            }
          }
        }
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

  public void initialize(UimaContext aContext) {
    this.modelFile = new File((String) aContext.getConfigParameterValue(PARAM_MODEL_FILE));
  }
}
