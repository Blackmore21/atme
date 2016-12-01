package elab.emulator.atm.transmission.message.wn_ndc;

import elab.emulator.atm.transmission.message.GroupNdc_TransactionReplyCommand;

public class WnNdc_Transaction_Reply_Command extends GroupNdc_TransactionReplyCommand {

    private static final char TRANSACTION_REPLY_COMMAND_IDENTIFIER = '4';

    private String numberOfBillsToDispense;

    private String numberOfCoinsToDispense;

    // buffer identifier(E)
    private char bufferIdentifierE;

    private String documentDestination;

    // lift front/rear image(s)
    private String liftImage;

    // archive lifted front/rear image(s)
    private String archiveLiftedImage;

    private String liftZonesInImageList;

    private String archiveLiftedImageListZones;

    private String checkMagnetism;

    private String checkZoneVerification;

    // report candidates/identify
    private String reportCandidatesIdentify;

    private String documentEntryRetries;

    // buffer identifier(F)
    private char bufferIdentifierF;

    private String documentEnableCode;

    private String documentName;

}
