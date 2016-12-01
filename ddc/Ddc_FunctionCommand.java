package elab.emulator.atm.transmission.message.ddc;

import elab.emulator.atm.transmission.message.GroupDdc_FunctionCommand;

import java.util.ArrayList;


/**
 * Function Command Message<br><br>
 * <p>
 * <b>Agilis® 3 91x Terminal Programming Manual 2013.pdf (стр. 305)
 * Function Command Identifier 4
 *
 * @author Dyakov
 */
public class Ddc_FunctionCommand extends GroupDdc_FunctionCommand {

    /**
     * Track 3 data is optional.
     * If the field separator is included in the message,
     * all the fields of the set must be present.
     */
    public class Track3 {

        private char track3FieldID;

        private byte[] track3Data;

        public char getTrack3FieldID() {
            return track3FieldID;
        }

        public void setTrack3FieldID(char track3FieldID) {
            this.track3FieldID = track3FieldID;
        }

        public byte[] getTrack3Data() {
            return track3Data;
        }

        public void setTrack3Data(byte[] track3Data) {
            this.track3Data = track3Data;
        }
    }

    private Track3 track3;

    /**
     * The depository settings data is optional.
     * If the field separator is included in the message,
     * all the fields through the first group separator must be present.
     */
    public class DepositorySettings {

        private char depositorySettingsFieldID;

        private byte[] depositPrinterData;

        private int depositBinID;

        private int imageEnable;

        private String checkAcceptedScreen;

        private String checkHandlingDelayScreen;

        private int checkHandlingDelayTime;

        private ArrayList<Integer> reserved;

        public char getDepositorySettingsFieldID() {
            return depositorySettingsFieldID;
        }

        public void setDepositorySettingsFieldID(char depositorySettingsFieldID) {
            this.depositorySettingsFieldID = depositorySettingsFieldID;
        }

        public byte[] getDepositPrinterData() {
            return depositPrinterData;
        }

        public void setDepositPrinterData(byte[] depositPrinterData) {
            this.depositPrinterData = depositPrinterData;
        }

        public int getDepositBinID() {
            return depositBinID;
        }

        public void setDepositBinID(int depositBinID) {
            this.depositBinID = depositBinID;
        }

        public int getImageEnable() {
            return imageEnable;
        }

        public void setImageEnable(int imageEnable) {
            this.imageEnable = imageEnable;
        }

        public String getCheckAcceptedScreen() {
            return checkAcceptedScreen;
        }

        public void setCheckAcceptedScreen(String checkAcceptedScreen) {
            this.checkAcceptedScreen = checkAcceptedScreen;
        }

        public String getCheckHandlingDelayScreen() {
            return checkHandlingDelayScreen;
        }

        public void setCheckHandlingDelayScreen(String checkHandlingDelayScreen) {
            this.checkHandlingDelayScreen = checkHandlingDelayScreen;
        }

        public int getCheckHandlingDelayTime() {
            return checkHandlingDelayTime;
        }

        public void setCheckHandlingDelayTime(int checkHandlingDelayTime) {
            this.checkHandlingDelayTime = checkHandlingDelayTime;
        }

        public ArrayList<Integer> getReserved() {

            return reserved;
        }

        public void setReserved(ArrayList<Integer> reserved) {

            this.reserved = reserved;
        }
    }

    private DepositorySettings depositorySettings;

    /**
     * This set of fields is optional.
     * The data applies only to coin dispensing operations (U.S. coins only).
     * If the field separator is included in the message,
     * all the fields of the set must be present.
     */
    public class CoinField {

        private char coinFieldID;

        private int reserved;

        private String dollarAmountofCoins;

        public char getCoinFieldID() {
            return coinFieldID;
        }

        public void setCoinFieldID(char coinFieldID) {
            this.coinFieldID = coinFieldID;
        }

        public String getDollarAmountofCoins() {
            return dollarAmountofCoins;
        }

        public void setDollarAmountofCoins(String dollarAmountofCoins) {
            this.dollarAmountofCoins = dollarAmountofCoins;
        }

        public int getReserved() {
            return reserved;
        }

        public void setReserved(int reserved) {
            this.reserved = reserved;
        }
    }

    private CoinField coinField;

    public class Track1 {

        private char track1FieldID;

        private byte[] track1Data;

        public char getTrack1FieldID() {
            return track1FieldID;
        }

        public void setTrack1FieldID(char track1FieldID) {

            this.track1FieldID = track1FieldID;
        }

        public byte[] getTrack1Data() {

            return track1Data;
        }

        public void setTrack1Data(byte[] track1Data) {

            this.track1Data = track1Data;
        }
    }

    private Track1 track1;

    public class Track2 {

        private char track2FieldID;

        private byte[] track2Data;

        public char getTrack2FieldID() {

            return track2FieldID;
        }

        public void setTrack2FieldID(char track2FieldID) {

            this.track2FieldID = track2FieldID;
        }

        public byte[] getTrack2Data() {

            return track2Data;
        }

        public void setTrack2Data(byte[] track2Data) {

            this.track2Data = track2Data;
        }
    }

    private Track2 track2;

    private ArrayList<String> enhancedConfigurationDataSets;

    @Override
    public String toString() {

        return "Function Command Message (912 Mode)";
    }

    public Track3 getTrack3() {

        return track3;
    }

    public void setTrack3(Track3 track3) {

        this.track3 = track3;
    }

    public DepositorySettings getDepositorySettings() {

        return depositorySettings;
    }

    public void setDepositorySettings(DepositorySettings depositorySettings) {

        this.depositorySettings = depositorySettings;
    }

    public CoinField getCoinField() {

        return coinField;
    }

    public void setCoinField(CoinField coinField) {

        this.coinField = coinField;
    }

    public Track1 getTrack1() {

        return track1;
    }

    public void setTrack1(Track1 track1) {

        this.track1 = track1;
    }

    public Track2 getTrack2() {

        return track2;
    }

    public void setTrack2(Track2 track2) {

        this.track2 = track2;
    }

    public ArrayList<String> getEnhancedConfigurationDataSets() {

        return enhancedConfigurationDataSets;
    }

    public void setEnhancedConfigurationDataSets(ArrayList<String> enhancedConfigurationDataSets) {

        this.enhancedConfigurationDataSets = enhancedConfigurationDataSets;
    }
}
