package elab.emulator.atm.transmission.message;

import elab.emulator.atm.transmission.creator.OutboundMessageCreator;
import elab.emulator.settings.StaticSettings;

import java.util.ArrayList;


/**
 * Function Command Message (ID 4)
 * <p>
 * Agilis® 3 91x Terminal Programming Manual 2013.pdf (стр. 305)
 *
 * @author Dyakov
 */
public class GroupDdc_FunctionCommand extends InboundMessage {

    private static final char FUNCTION_COMMAND_IDENTIFIER = '4';

    private int nextStateID;

    private String numberOfBillsToDispense;

    private String numberOfCoinsToDispense;

    private int transactionSerialNumber;

    public class Set1 {

        private char functionIdentifier;

        private String screenNumber;

        private String screenDisplayUpdateData;

        public char getFunctionIdentifier() {
            return functionIdentifier;
        }

        public void setFunctionIdentifier(char functionIdentifier) {
            this.functionIdentifier = functionIdentifier;
        }

        public String getScreenNumber() {
            return screenNumber;
        }

        public void setScreenNumber(String screenNumber) {
            this.screenNumber = screenNumber;
        }

        public String getScreenDisplayUpdateData() {
            return screenDisplayUpdateData;
        }

        public void setScreenDisplayUpdateData(String screenDisplayUpdateData) {
            this.screenDisplayUpdateData = screenDisplayUpdateData;
        }
    }

    private ArrayList<Set1> set1;

    private char messageCoordinationNumber;

    private char cardFlag;

    public class Set2 {

        private char printerFlag;

        private String printerData;

        public char getPrinterFlag() {
            return printerFlag;
        }

        public void setPrinterFlag(char printerFlag) {
            this.printerFlag = printerFlag;
        }

        public String getPrinterData() {
            return printerData;
        }

        public void setPrinterData(String printerData) {
            this.printerData = printerData;
        }
    }

    private ArrayList<Set2> set2;

    private byte[] macData;

    public static char getFunctionCommandIdentifier() {
        return FUNCTION_COMMAND_IDENTIFIER;
    }

    public int getNextStateID() {
        return nextStateID;
    }

    public void setNextStateID(int nextStateID) {
        this.nextStateID = nextStateID;
    }

    public String getNumberOfBillsToDispense() {
        return numberOfBillsToDispense;
    }

    public void setNumberOfBillsToDispense(String numberOfBillsToDispense) {
        this.numberOfBillsToDispense = numberOfBillsToDispense;
    }

    public String getNumberOfCoinsToDispense() {
        return numberOfCoinsToDispense;
    }

    public void setNumberOfCoinsToDispense(String numberOfCoinsToDispense) {
        this.numberOfCoinsToDispense = numberOfCoinsToDispense;
    }

    public int getTransactionSerialNumber() {
        return transactionSerialNumber;
    }

    public void setTransactionSerialNumber(int transactionSerialNumber) {
        this.transactionSerialNumber = transactionSerialNumber;
    }

    public ArrayList<Set1> getSet1() {
        return set1;
    }

    public void setSet1(ArrayList<Set1> set1) {
        this.set1 = set1;
    }

    public char getMessageCoordinationNumber() {
        return messageCoordinationNumber;
    }

    public void setMessageCoordinationNumber(char messageCoordinationNumber) {
        this.messageCoordinationNumber = messageCoordinationNumber;
    }

    public char getCardFlag() {
        return cardFlag;
    }

    public void setCardFlag(char cardFlag) {
        this.cardFlag = cardFlag;
    }

    public ArrayList<Set2> getSet2() {
        return set2;
    }

    public void setSet2(ArrayList<Set2> set2) {
        this.set2 = set2;
    }

    public byte[] getMacData() {
        return macData;
    }

    public void setMacData(byte[] macData) {
        this.macData = macData;
    }

    /**
     * Check MAC.
     *
     * @param message         the message
     * @param recievedMessage the recieved message
     * @return true, if successful
     */
    public static boolean checkMAC(GroupDdc_FunctionCommand message, byte[] recievedMessage) {

        // check used message authentication (MAC)
        if (StaticSettings.getIAtmeSettings().getSecuritySettings().isMacing()) {
            // check field with MAC data
            if (message.getMacData() != null) {
                // check MAC data
                String macedMessage = OutboundMessageCreator.verifyMac(new String(recievedMessage));
                if (macedMessage == null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
