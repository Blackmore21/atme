package elab.emulator.atm.transmission.message;


public class GroupNdc_TransactionReplyCommand extends InboundMessage {

    private int nextStateID;

    private int transactionSerialNumber;

    private char functionIdentifier;

    private String screenNumber;

    private String screenDisplayUpdateData;

    private char messageCoordinationNumber;

    private char cardFlag;

    private char printerFlag;

    private String printerData;

    //buffer identifier(4)
    private char bufferIdentifier;

    private String track3Data;

    // track 1 buffer identifier (K)
    private char track1BufferIdentifier;

    private String track1Data;

    // track 2 buffer identifier (L)
    private char track2BufferIdentifier;

    private String track2Data;

    private byte[] macData;
}
