import java.util.ArrayList;
import java.util.HashMap;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;

/**
 * 
 * This is an annotator that scores extraction results based on the gold standard.
 * 
 * @author mtydykov
 * 
 */

public class Scorer extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas arg0) throws AnalysisEngineProcessException {
    FSIterator itGeneMention = arg0.getAnnotationIndex(GeneMention.type).iterator();
    FSIterator itGoldMention = arg0.getAnnotationIndex(GoldMention.type).iterator();
    int totalPresent = 0;
    // store in map to avoid n^2 comparisons
    HashMap<String, ArrayList<GoldMention>> sentIdToGoldMentionMap = new HashMap<String, ArrayList<GoldMention>>();
    while (itGoldMention.hasNext()) {
      GoldMention currentGoldMention = (GoldMention) itGoldMention.next();
      if (!sentIdToGoldMentionMap.containsKey(currentGoldMention.getSentenceId())) {
        sentIdToGoldMentionMap
                .put(currentGoldMention.getSentenceId(), new ArrayList<GoldMention>());
      }
      totalPresent++;
      sentIdToGoldMentionMap.get(currentGoldMention.getSentenceId()).add(currentGoldMention);
    }

    int truePos = 0;
    int totalRecall = 0;
    while (itGeneMention.hasNext()) {
      totalRecall++;
      GeneMention currMention = (GeneMention) itGeneMention.next();
      if (sentIdToGoldMentionMap.containsKey(currMention.getSentenceId())) {
        for (GoldMention goldMention : sentIdToGoldMentionMap.get(currMention.getSentenceId())) {
          if (goldMention.getMentionBegin() == currMention.getMentionBegin()
                  && goldMention.getMentionEnd() == currMention.getMentionEnd()) {
            truePos++;
          }
        }
      }
    }
    DocStats stats = new DocStats(arg0);
    stats.setRecall((double) truePos / (totalPresent));
    stats.setPrecision((double) truePos / totalRecall);
    stats.setF1Score((double) 2 * (stats.getRecall() * stats.getPrecision())
            / (stats.getRecall() + stats.getPrecision()));
    stats.addToIndexes();
    System.out.println("Recall :" + stats.getRecall());
    System.out.println("Precision : " + stats.getPrecision());
    System.out.println("F1-Score : " + stats.getF1Score());
  }

}
