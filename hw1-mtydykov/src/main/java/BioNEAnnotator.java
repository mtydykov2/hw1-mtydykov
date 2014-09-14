import java.util.Map;
import java.util.Map.Entry;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.ResourceProcessException;

public class BioNEAnnotator extends JCasAnnotator_ImplBase {

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
    while(it.hasNext()){
      SentenceData curr = (SentenceData)it.next();
      Map<Integer, Integer> spanMap = 
              recognizer.getGeneSpans(curr.getSentenceText());
      for(Entry<Integer, Integer> pair: spanMap.entrySet()){
        GeneMention mention = new GeneMention(arg0);
        mention.setMentionBegin(pair.getKey());
        mention.setMentionEnd(pair.getValue());
        mention.setMentionText(curr.getSentenceText().substring(mention.getMentionBegin(), mention.getMentionEnd()));
        mention.setSentenceId(curr.getSentenceId());
        mention.addToIndexes();
      }
    }

  }

}
