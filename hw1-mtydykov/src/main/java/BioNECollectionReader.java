import java.io.File;
import java.io.IOException;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.util.FileUtils;
import org.apache.uima.util.Progress;
/**
 * 
 * This is a collection reader that takes an input file to be processed as a parameter.
 * @author mtydykov
 *
 */

public class BioNECollectionReader extends CollectionReader_ImplBase {

  private File myFile;
  private int myCurrentIndex;
  public static final String PARAM_INPUTDIR = "InputDirectory";
  
  public void initialize(){
    myFile = new File(((String) getConfigParameterValue(PARAM_INPUTDIR)).trim());
    myCurrentIndex = 0;
  }
  
  @Override
  public void getNext(CAS arg0) throws IOException, CollectionException {
    myCurrentIndex++;
    JCas myCas = null;
    try {
      myCas = arg0.getJCas();
    } catch (CASException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    String text = FileUtils.file2String(myFile);
    myCas.setDocumentText(text);
    String[] sentences = text.split("\n");
    for(String sent: sentences){
      SentenceData data = new SentenceData(myCas);
      String id = sent.substring(0, sent.indexOf(" "));
      String sentText = sent.substring(sent.indexOf(" "));
      data.setSentenceText(sentText.trim());
      data.setSentenceId(id);
      data.addToIndexes();
    }
  }

  @Override
  public void close() throws IOException {
    // TODO Auto-generated method stub

  }

  @Override
  public Progress[] getProgress() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean hasNext() throws IOException, CollectionException {
    return myCurrentIndex < 1;
  }

}
