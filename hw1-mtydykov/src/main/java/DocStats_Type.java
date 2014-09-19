/* First created by JCasGen Mon Sep 15 22:12:48 EDT 2014 */

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
public class DocStats_Type extends Annotation_Type {
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
      if (DocStats_Type.this.useExistingInstance) {
        // Return eq fs instance if already created
        FeatureStructure fs = DocStats_Type.this.jcas.getJfsFromCaddr(addr);
        if (null == fs) {
          fs = new DocStats(addr, DocStats_Type.this);
          DocStats_Type.this.jcas.putJfsFromCaddr(addr, fs);
          return fs;
        }
        return fs;
      } else
        return new DocStats(addr, DocStats_Type.this);
    }
  };

  /** @generated */
  @SuppressWarnings("hiding")
  public final static int typeIndexID = DocStats.typeIndexID;

  /**
   * @generated
   * @modifiable
   */
  @SuppressWarnings("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("DocStats");

  /** @generated */
  final Feature casFeat_precision;

  /** @generated */
  final int casFeatCode_precision;

  /**
   * @generated
   * @param addr
   *          low level Feature Structure reference
   * @return the feature value
   */
  public double getPrecision(int addr) {
    if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "DocStats");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_precision);
  }

  /**
   * @generated
   * @param addr
   *          low level Feature Structure reference
   * @param v
   *          value to set
   */
  public void setPrecision(int addr, double v) {
    if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "DocStats");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_precision, v);
  }

  /** @generated */
  final Feature casFeat_recall;

  /** @generated */
  final int casFeatCode_recall;

  /**
   * @generated
   * @param addr
   *          low level Feature Structure reference
   * @return the feature value
   */
  public double getRecall(int addr) {
    if (featOkTst && casFeat_recall == null)
      jcas.throwFeatMissing("recall", "DocStats");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_recall);
  }

  /**
   * @generated
   * @param addr
   *          low level Feature Structure reference
   * @param v
   *          value to set
   */
  public void setRecall(int addr, double v) {
    if (featOkTst && casFeat_recall == null)
      jcas.throwFeatMissing("recall", "DocStats");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_recall, v);
  }

  /** @generated */
  final Feature casFeat_f1Score;

  /** @generated */
  final int casFeatCode_f1Score;

  /**
   * @generated
   * @param addr
   *          low level Feature Structure reference
   * @return the feature value
   */
  public double getF1Score(int addr) {
    if (featOkTst && casFeat_f1Score == null)
      jcas.throwFeatMissing("f1Score", "DocStats");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_f1Score);
  }

  /**
   * @generated
   * @param addr
   *          low level Feature Structure reference
   * @param v
   *          value to set
   */
  public void setF1Score(int addr, double v) {
    if (featOkTst && casFeat_f1Score == null)
      jcas.throwFeatMissing("f1Score", "DocStats");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_f1Score, v);
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
  public DocStats_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());

    casFeat_precision = jcas.getRequiredFeatureDE(casType, "precision", "uima.cas.Double",
            featOkTst);
    casFeatCode_precision = (null == casFeat_precision) ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_precision).getCode();

    casFeat_recall = jcas.getRequiredFeatureDE(casType, "recall", "uima.cas.Double", featOkTst);
    casFeatCode_recall = (null == casFeat_recall) ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_recall).getCode();

    casFeat_f1Score = jcas.getRequiredFeatureDE(casType, "f1Score", "uima.cas.Double", featOkTst);
    casFeatCode_f1Score = (null == casFeat_f1Score) ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_f1Score).getCode();

  }
}
