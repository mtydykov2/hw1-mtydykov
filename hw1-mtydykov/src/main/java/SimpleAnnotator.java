import java.util.Map;
import java.util.Map.Entry;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

/**
 * 
 * This is an annotator that uses Stanford POS tags to exract gene mentions.
 * 
 * @author mtydykov
 * 
 */

public class SimpleAnnotator extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas arg0) throws AnalysisEngineProcessException {

    FSIterator it = arg0.getAnnotationIndex(SentenceData.type).iterator();
    PosTagNamedEntityRecognizer recognizer = null;

    try {
      recognizer = new PosTagNamedEntityRecognizer();
    } catch (ResourceInitializationException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    while (it.hasNext()) {
      SentenceData curr = (SentenceData) it.next();
      Map<Integer, Integer> spanMap = recognizer.getGeneSpans(curr.getSentenceText());
      for (Entry<Integer, Integer> pair : spanMap.entrySet()) {
        int begin = pair.getKey();
        String before = curr.getSentenceText().substring(0, begin);
        before = before.replaceAll("\\s+", "");
        int end = pair.getValue();
        String after = curr.getSentenceText().substring(0, end);
        after = after.replaceAll("\\s+", "");
        GeneMention mention = new GeneMention(arg0);
        mention.setMentionBegin(before.length());
        mention.setMentionEnd(after.length() - 1);
        mention.setMentionText(curr.getSentenceText().substring(begin, end));
        mention.setSentenceId(curr.getSentenceId());
        mention.addToIndexes();
      }
    }
  }
}
