package elab.emulator.atm.transmission.message.nds;

import elab.emulator.atm.transmission.message.GroupNdc_TransactionReplyCommand;

public class Ndc_Transaction_Reply_Command extends GroupNdc_TransactionReplyCommand {

    private static final char MESSAGE_CLASS = '4';

    private String numberOfType1NotesToDispense;

    private String numberOfType2NotesToDispense;

    private String numberOfType3NotesToDispense;

    private String numberOfType4NotesToDispense;

    private String numberOfType5NotesToDispense;

    private String numberOfType6NotesToDispense;

    private String numberOfType7NotesToDispense;

    private String numberOfHopperType1CoinsToDispense;

    private String numberOfHopperType2CoinsToDispense;

    private String numberOfHopperType3CoinsToDispense;

    private String numberOfHopperType4CoinsToDispense;

    private String numberOfHopperType5CoinsToDispense;

    private char vcData;

    private char vcDataIdM;

    private char vcDataIdO;

    private char vcDataIdP;

    private char vcDataIdQ;

    // buffer identifier(S)
    private char bufferIdentifierS;

    private int CashHandlerNumber;

    private char vcDataIdR;

    private String firstCassetteTypeInSpecifiedCashHandler;

    private String numberOfBillsToDispenseFromFirstType;

    private String secondCassetteTypeInSpecifiedCashHandler;

    private String numberOfBillsToDispenseFromSecondType;

    private String thirdCassetteTypeInSpecifiedCashHandler;

    private String numberOfBillsToDispenseFromThirdType;

    private String fourthCassetteTypeInSpecifiedCashHandler;

    private String numberOfBillsToDispenseFromFourthType;

    private String lastCassetteTypeInSpecifiedCashHandler;

    private String numberOfBillsToDispenseFromLastType;

    private int smartCardDataId5;

    private String smartCardData;

    // buffer identifier(A) (Cheque(s) Destination Data)
    private char bufferIdentifierA;

    private char ChequeDestinationData;

    //buffer identifier(B)(Process Multiple Cheques) 
    private char bufferIdentifierB;

    private String chequeIdentifier;

    private String chequeDestination;

    private char chequeStamp;

    private String chequeEndorseText;

    //???
    private char emvDynamicCurrency;

    //buffer identifier(D)
    private char bufferIdentifierD;

    private String customerDataElementIdentifier;

    private String customerDataElementBuffer;

    private String trailerProtocolDependent;

}
