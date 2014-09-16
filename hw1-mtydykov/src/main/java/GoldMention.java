

/* First created by JCasGen Mon Sep 15 22:08:06 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Sep 15 22:12:48 EDT 2014
 * XML source: /root/git/hw1-mtydykov/hw1-mtydykov/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class GoldMention extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GoldMention.class);
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
  protected GoldMention() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public GoldMention(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public GoldMention(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public GoldMention(JCas jcas, int begin, int end) {
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
  //* Feature: sentenceId

  /** getter for sentenceId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSentenceId() {
    if (GoldMention_Type.featOkTst && ((GoldMention_Type)jcasType).casFeat_sentenceId == null)
      jcasType.jcas.throwFeatMissing("sentenceId", "GoldMention");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GoldMention_Type)jcasType).casFeatCode_sentenceId);}
    
  /** setter for sentenceId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceId(String v) {
    if (GoldMention_Type.featOkTst && ((GoldMention_Type)jcasType).casFeat_sentenceId == null)
      jcasType.jcas.throwFeatMissing("sentenceId", "GoldMention");
    jcasType.ll_cas.ll_setStringValue(addr, ((GoldMention_Type)jcasType).casFeatCode_sentenceId, v);}    
   
    
  //*--------------*
  //* Feature: mentionBegin

  /** getter for mentionBegin - gets 
   * @generated
   * @return value of the feature 
   */
  public int getMentionBegin() {
    if (GoldMention_Type.featOkTst && ((GoldMention_Type)jcasType).casFeat_mentionBegin == null)
      jcasType.jcas.throwFeatMissing("mentionBegin", "GoldMention");
    return jcasType.ll_cas.ll_getIntValue(addr, ((GoldMention_Type)jcasType).casFeatCode_mentionBegin);}
    
  /** setter for mentionBegin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMentionBegin(int v) {
    if (GoldMention_Type.featOkTst && ((GoldMention_Type)jcasType).casFeat_mentionBegin == null)
      jcasType.jcas.throwFeatMissing("mentionBegin", "GoldMention");
    jcasType.ll_cas.ll_setIntValue(addr, ((GoldMention_Type)jcasType).casFeatCode_mentionBegin, v);}    
   
    
  //*--------------*
  //* Feature: mentionEnd

  /** getter for mentionEnd - gets 
   * @generated
   * @return value of the feature 
   */
  public int getMentionEnd() {
    if (GoldMention_Type.featOkTst && ((GoldMention_Type)jcasType).casFeat_mentionEnd == null)
      jcasType.jcas.throwFeatMissing("mentionEnd", "GoldMention");
    return jcasType.ll_cas.ll_getIntValue(addr, ((GoldMention_Type)jcasType).casFeatCode_mentionEnd);}
    
  /** setter for mentionEnd - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMentionEnd(int v) {
    if (GoldMention_Type.featOkTst && ((GoldMention_Type)jcasType).casFeat_mentionEnd == null)
      jcasType.jcas.throwFeatMissing("mentionEnd", "GoldMention");
    jcasType.ll_cas.ll_setIntValue(addr, ((GoldMention_Type)jcasType).casFeatCode_mentionEnd, v);}    
   
    
  //*--------------*
  //* Feature: mentionText

  /** getter for mentionText - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMentionText() {
    if (GoldMention_Type.featOkTst && ((GoldMention_Type)jcasType).casFeat_mentionText == null)
      jcasType.jcas.throwFeatMissing("mentionText", "GoldMention");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GoldMention_Type)jcasType).casFeatCode_mentionText);}
    
  /** setter for mentionText - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMentionText(String v) {
    if (GoldMention_Type.featOkTst && ((GoldMention_Type)jcasType).casFeat_mentionText == null)
      jcasType.jcas.throwFeatMissing("mentionText", "GoldMention");
    jcasType.ll_cas.ll_setStringValue(addr, ((GoldMention_Type)jcasType).casFeatCode_mentionText, v);}    
  }

    