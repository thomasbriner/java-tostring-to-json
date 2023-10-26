package plus.lixiang.javatostringtojson.service;

import junit.framework.TestCase;

import java.text.ParseException;

public class ToStringUtilsTest extends TestCase {

    public void testEinfach() throws ParseException {
        String jsonString = ToStringUtils.toJSONString("ScoreDTO(super=AbstractDataTransferObject(), modelName=Unsupervised Model, optionsDescription=without stacking, score=-4.650954534709764942590481950901448726654052734375, threshold=-4.5)");
        System.out.println(jsonString);

    }

    public void testKomplex() throws ParseException {
        String jsonString = ToStringUtils.toJSONString("ExtendedCheckResultDTO(super=AbstractDataTransferObject(), fraud=true, score=-4.650954534709764942590481950901448726654052734375, threshold=-4.5, modelName=Unsupervised Model, blacklistMatch=null, blockTransaction=true, ruleSystemEvaluationResult=RuleSystemEvaluationResultDTO(super=AbstractDataTransferObject(), overallSuggestedAction=NEUTRAL, flaggedBeneficiaryListRule=FlaggedBeneficiaryListEvaluationResultDTO(super=AbstractDataTransferObject(), suggestedAction=NEUTRAL, flaggedBeneficiaryListMatch=null), amountFilter=AmountFilterEvaluationResultDTO(super=AbstractDataTransferObject(), suggestedAction=NEUTRAL, relevantAmount=111, appliedThresholdValue=2500, amountBelowThreshold=false), highAmountRule=HighAmountRuleEvaluationResultDTO(super=AbstractDataTransferObject(), suggestedAction=NEUTRAL, relevantAmount=1227460, appliedThresholdValue=null, numberOfPaymentsAboveThreshold=null), newConfirmationDeviceRule=NewConfirmationDeviceRuleEvaluationResultDTO(super=AbstractDataTransferObject(), suggestedAction=NEUTRAL, ruleActive=true, confirmationWindowInDays=null, confirmationDeviceId=null, beneficiaryKnownToDebitBp=null, trustedDevice=null)), fraudModelEvaluationResult=FraudModelEvaluationResultDTO(super=AbstractDataTransferObject(), mostRelevantResult=CheckResultDTO(super=AbstractDataTransferObject(), fraud=true, score=-4.650954534709764942590481950901448726654052734375, threshold=-4.5, modelName=Unsupervised Model), checkResults=[ScoreDTO(super=AbstractDataTransferObject(), modelName=Supervised Model, optionsDescription=without stacking, score=0.0013177394866943359375, threshold=0.01), ScoreDTO(super=AbstractDataTransferObject(), modelName=Unsupervised Model, optionsDescription=without stacking, score=-4.650954534709764942590481950901448726654052734375, threshold=-4.5)]), additionalInformation=CheckResultAdditionalInformationDTO(super=AbstractDataTransferObject(), checkResults=[ScoreDTO(super=AbstractDataTransferObject(), modelName=Supervised Model, optionsDescription=without stacking, score=0.0013177394866943359375, threshold=0.01), ScoreDTO(super=AbstractDataTransferObject(), modelName=Unsupervised Model, optionsDescription=without stacking, score=-4.650954534709764942590481950901448726654052734375, threshold=-4.5)], stacking=null, amountChf=111), errorMessage=null)");

        System.out.println(jsonString);



    }
}