
/* First created by JCasGen Mon Sep 15 22:12:48 EDT 2014 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;

/**
 * Updated by JCasGen Wed Sep 17 14:20:01 EDT 2014 XML source:
 * /root/git/hw1-mtydykov/hw1-mtydykov/src/main/resources/typeSystemDescriptor.xml
 * 
 * @generated
 */
public class DocStats extends Annotation {
  /**
   * @generated
   * @ordered
   */
  @SuppressWarnings("hiding")
  public final static int typeIndexID = JCasRegistry.register(DocStats.class);

  /**
   * @generated
   * @ordered
   */
  @SuppressWarnings("hiding")
  public final static int type = typeIndexID;

  /**
   * @generated
   * @return index of the type
   */
  @Override
  public int getTypeIndexID() {
    return typeIndexID;
  }

  /**
   * Never called. Disable default constructor
   * 
   * @generated
   */
  protected DocStats() {/* intentionally empty block */
  }

  /**
   * Internal - constructor used by generator
   * 
   * @generated
   * @param addr
   *          low level Feature Structure reference
   * @param type
   *          the type of this Feature Structure
   */
  public DocStats(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }

  /**
   * @generated
   * @param jcas
   *          JCas to which this Feature Structure belongs
   */
  public DocStats(JCas jcas) {
    super(jcas);
    readObject();
  }

  /**
   * @generated
   * @param jcas
   *          JCas to which this Feature Structure belongs
   * @param begin
   *          offset to the begin spot in the SofA
   * @param end
   *          offset to the end spot in the SofA
   */
  public DocStats(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }

  /**
   * <!-- begin-user-doc --> Write your own initialization here <!-- end-user-doc -->
   * 
   * @generated modifiable
   */
  private void readObject() {/* default - does nothing empty block */
  }

  // *--------------*
  // * Feature: precision

  /**
   * getter for precision - gets
   * 
   * @generated
   * @return value of the feature
   */
  public double getPrecision() {
    if (DocStats_Type.featOkTst && ((DocStats_Type) jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "DocStats");
    return jcasType.ll_cas
            .ll_getDoubleValue(addr, ((DocStats_Type) jcasType).casFeatCode_precision);
  }

  /**
   * setter for precision - sets
   * 
   * @generated
   * @param v
   *          value to set into the feature
   */
  public void setPrecision(double v) {
    if (DocStats_Type.featOkTst && ((DocStats_Type) jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "DocStats");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((DocStats_Type) jcasType).casFeatCode_precision, v);
  }

  // *--------------*
  // * Feature: recall

  /**
   * getter for recall - gets
   * 
   * @generated
   * @return value of the feature
   */
  public double getRecall() {
    if (DocStats_Type.featOkTst && ((DocStats_Type) jcasType).casFeat_recall == null)
      jcasType.jcas.throwFeatMissing("recall", "DocStats");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((DocStats_Type) jcasType).casFeatCode_recall);
  }

  /**
   * setter for recall - sets
   * 
   * @generated
   * @param v
   *          value to set into the feature
   */
  public void setRecall(double v) {
    if (DocStats_Type.featOkTst && ((DocStats_Type) jcasType).casFeat_recall == null)
      jcasType.jcas.throwFeatMissing("recall", "DocStats");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((DocStats_Type) jcasType).casFeatCode_recall, v);
  }

  // *--------------*
  // * Feature: f1Score

  /**
   * getter for f1Score - gets
   * 
   * @generated
   * @return value of the feature
   */
  public double getF1Score() {
    if (DocStats_Type.featOkTst && ((DocStats_Type) jcasType).casFeat_f1Score == null)
      jcasType.jcas.throwFeatMissing("f1Score", "DocStats");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((DocStats_Type) jcasType).casFeatCode_f1Score);
  }

  /**
   * setter for f1Score - sets
   * 
   * @generated
   * @param v
   *          value to set into the feature
   */
  public void setF1Score(double v) {
    if (DocStats_Type.featOkTst && ((DocStats_Type) jcasType).casFeat_f1Score == null)
      jcasType.jcas.throwFeatMissing("f1Score", "DocStats");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((DocStats_Type) jcasType).casFeatCode_f1Score, v);
  }
}
