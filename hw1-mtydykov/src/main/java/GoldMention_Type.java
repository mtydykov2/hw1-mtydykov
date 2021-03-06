/* First created by JCasGen Mon Sep 15 22:08:06 EDT 2014 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/**
 * Updated by JCasGen Wed Sep 17 14:20:01 EDT 2014
 * 
 * @generated
 */
public class GoldMention_Type extends Annotation_Type {
  /**
   * @generated
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {
    return fsGenerator;
  }

  /** @generated */
  private final FSGenerator fsGenerator = new FSGenerator() {
    public FeatureStructure createFS(int addr, CASImpl cas) {
      if (GoldMention_Type.this.useExistingInstance) {
        // Return eq fs instance if already created
        FeatureStructure fs = GoldMention_Type.this.jcas.getJfsFromCaddr(addr);
        if (null == fs) {
          fs = new GoldMention(addr, GoldMention_Type.this);
          GoldMention_Type.this.jcas.putJfsFromCaddr(addr, fs);
          return fs;
        }
        return fs;
      } else
        return new GoldMention(addr, GoldMention_Type.this);
    }
  };

  /** @generated */
  @SuppressWarnings("hiding")
  public final static int typeIndexID = GoldMention.typeIndexID;

  /**
   * @generated
   * @modifiable
   */
  @SuppressWarnings("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("GoldMention");

  /** @generated */
  final Feature casFeat_sentenceId;

  /** @generated */
  final int casFeatCode_sentenceId;

  /**
   * @generated
   * @param addr
   *          low level Feature Structure reference
   * @return the feature value
   */
  public String getSentenceId(int addr) {
    if (featOkTst && casFeat_sentenceId == null)
      jcas.throwFeatMissing("sentenceId", "GoldMention");
    return ll_cas.ll_getStringValue(addr, casFeatCode_sentenceId);
  }

  /**
   * @generated
   * @param addr
   *          low level Feature Structure reference
   * @param v
   *          value to set
   */
  public void setSentenceId(int addr, String v) {
    if (featOkTst && casFeat_sentenceId == null)
      jcas.throwFeatMissing("sentenceId", "GoldMention");
    ll_cas.ll_setStringValue(addr, casFeatCode_sentenceId, v);
  }

  /** @generated */
  final Feature casFeat_mentionBegin;

  /** @generated */
  final int casFeatCode_mentionBegin;

  /**
   * @generated
   * @param addr
   *          low level Feature Structure reference
   * @return the feature value
   */
  public int getMentionBegin(int addr) {
    if (featOkTst && casFeat_mentionBegin == null)
      jcas.throwFeatMissing("mentionBegin", "GoldMention");
    return ll_cas.ll_getIntValue(addr, casFeatCode_mentionBegin);
  }

  /**
   * @generated
   * @param addr
   *          low level Feature Structure reference
   * @param v
   *          value to set
   */
  public void setMentionBegin(int addr, int v) {
    if (featOkTst && casFeat_mentionBegin == null)
      jcas.throwFeatMissing("mentionBegin", "GoldMention");
    ll_cas.ll_setIntValue(addr, casFeatCode_mentionBegin, v);
  }

  /** @generated */
  final Feature casFeat_mentionEnd;

  /** @generated */
  final int casFeatCode_mentionEnd;

  /**
   * @generated
   * @param addr
   *          low level Feature Structure reference
   * @return the feature value
   */
  public int getMentionEnd(int addr) {
    if (featOkTst && casFeat_mentionEnd == null)
      jcas.throwFeatMissing("mentionEnd", "GoldMention");
    return ll_cas.ll_getIntValue(addr, casFeatCode_mentionEnd);
  }

  /**
   * @generated
   * @param addr
   *          low level Feature Structure reference
   * @param v
   *          value to set
   */
  public void setMentionEnd(int addr, int v) {
    if (featOkTst && casFeat_mentionEnd == null)
      jcas.throwFeatMissing("mentionEnd", "GoldMention");
    ll_cas.ll_setIntValue(addr, casFeatCode_mentionEnd, v);
  }

  /** @generated */
  final Feature casFeat_mentionText;

  /** @generated */
  final int casFeatCode_mentionText;

  /**
   * @generated
   * @param addr
   *          low level Feature Structure reference
   * @return the feature value
   */
  public String getMentionText(int addr) {
    if (featOkTst && casFeat_mentionText == null)
      jcas.throwFeatMissing("mentionText", "GoldMention");
    return ll_cas.ll_getStringValue(addr, casFeatCode_mentionText);
  }

  /**
   * @generated
   * @param addr
   *          low level Feature Structure reference
   * @param v
   *          value to set
   */
  public void setMentionText(int addr, String v) {
    if (featOkTst && casFeat_mentionText == null)
      jcas.throwFeatMissing("mentionText", "GoldMention");
    ll_cas.ll_setStringValue(addr, casFeatCode_mentionText, v);
  }

  /**
   * initialize variables to correspond with Cas Type and Features
   * 
   * @generated
   * @param jcas
   *          JCas
   * @param casType
   *          Type
   */
  public GoldMention_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());

    casFeat_sentenceId = jcas.getRequiredFeatureDE(casType, "sentenceId", "uima.cas.String",
            featOkTst);
    casFeatCode_sentenceId = (null == casFeat_sentenceId) ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_sentenceId).getCode();

    casFeat_mentionBegin = jcas.getRequiredFeatureDE(casType, "mentionBegin", "uima.cas.Integer",
            featOkTst);
    casFeatCode_mentionBegin = (null == casFeat_mentionBegin) ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_mentionBegin).getCode();

    casFeat_mentionEnd = jcas.getRequiredFeatureDE(casType, "mentionEnd", "uima.cas.Integer",
            featOkTst);
    casFeatCode_mentionEnd = (null == casFeat_mentionEnd) ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_mentionEnd).getCode();

    casFeat_mentionText = jcas.getRequiredFeatureDE(casType, "mentionText", "uima.cas.String",
            featOkTst);
    casFeatCode_mentionText = (null == casFeat_mentionText) ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_mentionText).getCode();

  }
}
