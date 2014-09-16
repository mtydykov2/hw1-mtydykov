

/* First created by JCasGen Sun Sep 14 12:43:49 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Sep 15 22:12:48 EDT 2014
 * XML source: /root/git/hw1-mtydykov/hw1-mtydykov/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class SentenceData extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SentenceData.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected SentenceData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SentenceData(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SentenceData(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SentenceData(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: sentenceText

  /** getter for sentenceText - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSentenceText() {
    if (SentenceData_Type.featOkTst && ((SentenceData_Type)jcasType).casFeat_sentenceText == null)
      jcasType.jcas.throwFeatMissing("sentenceText", "SentenceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SentenceData_Type)jcasType).casFeatCode_sentenceText);}
    
  /** setter for sentenceText - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceText(String v) {
    if (SentenceData_Type.featOkTst && ((SentenceData_Type)jcasType).casFeat_sentenceText == null)
      jcasType.jcas.throwFeatMissing("sentenceText", "SentenceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SentenceData_Type)jcasType).casFeatCode_sentenceText, v);}    
   
    
  //*--------------*
  //* Feature: sentenceId

  /** getter for sentenceId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSentenceId() {
    if (SentenceData_Type.featOkTst && ((SentenceData_Type)jcasType).casFeat_sentenceId == null)
      jcasType.jcas.throwFeatMissing("sentenceId", "SentenceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SentenceData_Type)jcasType).casFeatCode_sentenceId);}
    
  /** setter for sentenceId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceId(String v) {
    if (SentenceData_Type.featOkTst && ((SentenceData_Type)jcasType).casFeat_sentenceId == null)
      jcasType.jcas.throwFeatMissing("sentenceId", "SentenceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SentenceData_Type)jcasType).casFeatCode_sentenceId, v);}    
  }

    