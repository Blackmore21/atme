package elab.emulator.atm.transmission.message.wn_ddc;

import elab.emulator.atm.transmission.message.GroupDdc_FunctionCommand;


// JDoc: Auto-generated Javadoc

/**
 * Function Command Message<br><br>
 * <p>
 * <b>ProCashDDC V1.310 ProConsultDDC V1.110 User Guide 2005.pdf (стр. 255)
 * Function Command Identifier 4
 *
 * @author Dyakov
 */
public class WnDdc_FunctionCommand extends GroupDdc_FunctionCommand {

    /**
     * The Class Track3.
     */
    public class Track3 {

        /**
         * The buffer identifier.
         */
        // buffer identifier (4)
        private char bufferIdentifier;

        /**
         * The track 3 data.
         */
        private String track3Data;

        public char getBufferIdentifier() {
            return bufferIdentifier;
        }

        public void setBufferIdentifier(char bufferIdentifier) {
            this.bufferIdentifier = bufferIdentifier;
        }

        public String getTrack3Data() {
            return track3Data;
        }

        public void setTrack3Data(String track3Data) {
            this.track3Data = track3Data;
        }
    }

    /**
     * The track 3.
     */
    private Track3 track3;

    /**
     * The Class DepositorySettings.
     */
    public class DepositorySettings {

        /**
         * The buffer identifier.
         */
        // buffer identifier (6)
        private char bufferIdentifier;

        /**
         * The network deposit printer data.
         */
        private String networkDepositPrinterData;

        /**
         * The deposit bin ID.
         */
        private String depositBinID;

        /**
         * The image capture.
         */
        private String imageCapture;

        /**
         * The check accepted screen number.
         */
        private String checkAcceptedScreenNumber;

        /**
         * The check handling delay screen.
         */
        private String checkHandlingDelayScreen;

        /**
         * The check handling delay time.
         */
        private String checkHandlingDelayTime;

        /**
         * The override MICRDIT settings.
         */
        private String overrideMICRDITSettings;

        public char getBufferIdentifier() {
            return bufferIdentifier;
        }

        public void setBufferIdentifier(char bufferIdentifier) {
            this.bufferIdentifier = bufferIdentifier;
        }

        public String getNetworkDepositPrinterData() {
            return networkDepositPrinterData;
        }

        public void setNetworkDepositPrinterData(String networkDepositPrinterData) {
            this.networkDepositPrinterData = networkDepositPrinterData;
        }

        public String getDepositBinID() {
            return depositBinID;
        }

        public void setDepositBinID(String depositBinID) {
            this.depositBinID = depositBinID;
        }

        public String getImageCapture() {
            return imageCapture;
        }

        public void setImageCapture(String imageCapture) {
            this.imageCapture = imageCapture;
        }

        public String getCheckAcceptedScreenNumber() {
            return checkAcceptedScreenNumber;
        }

        public void setCheckAcceptedScreenNumber(String checkAcceptedScreenNumber) {
            this.checkAcceptedScreenNumber = checkAcceptedScreenNumber;
        }

        public String getCheckHandlingDelayScreen() {
            return checkHandlingDelayScreen;
        }

        public void setCheckHandlingDelayScreen(String checkHandlingDelayScreen) {
            this.checkHandlingDelayScreen = checkHandlingDelayScreen;
        }

        public String getCheckHandlingDelayTime() {
            return checkHandlingDelayTime;
        }

        public void setCheckHandlingDelayTime(String checkHandlingDelayTime) {
            this.checkHandlingDelayTime = checkHandlingDelayTime;
        }

        public String getOverrideMICRDITSettings() {
            return overrideMICRDITSettings;
        }

        public void setOverrideMICRDITSettings(String overrideMICRDITSettings) {
            this.overrideMICRDITSettings = overrideMICRDITSettings;
        }
    }

    /**
     * The depository settings.
     */
    private DepositorySettings depositorySettings;

    /**
     * The Class CoinField.
     */
    public class CoinField {

        /**
         * The buffer identifier.
         */
        // buffer identifier (8)
        private char bufferIdentifier;

        /**
         * The reserved.
         */
        private String reserved;

        /**
         * The amount of coin.
         */
        private String amountOfCoin;

        public char getBufferIdentifier() {
            return bufferIdentifier;
        }

        public void setBufferIdentifier(char bufferIdentifier) {
            this.bufferIdentifier = bufferIdentifier;
        }

        public String getReserved() {
            return reserved;
        }

        public void setReserved(String reserved) {
            this.reserved = reserved;
        }

        public String getAmountOfCoin() {
            return amountOfCoin;
        }

        public void setAmountOfCoin(String amountOfCoin) {
            this.amountOfCoin = amountOfCoin;
        }
    }

    /**
     * The coin field.
     */
    private CoinField coinField;

    /**
     * The Class Track1.
     */
    public class Track1 {

        /**
         * The buffer identifier.
         */
        // buffer identifier (9)
        private char bufferIdentifier;

        /**
         * The track 1 data.
         */
        private String track1Data;

        public char getBufferIdentifier() {
            return bufferIdentifier;
        }

        public void setBufferIdentifier(char bufferIdentifier) {
            this.bufferIdentifier = bufferIdentifier;
        }

        public String getTrack1Data() {
            return track1Data;
        }

        public void setTrack1Data(String track1Data) {
            this.track1Data = track1Data;
        }
    }

    /**
     * The track 1.
     */
    private Track1 track1;

    /**
     * The Class Track2.
     */
    public class Track2 {

        /**
         * The buffer identifier.
         */
        // buffer identifier (:)
        private char bufferIdentifier;

        /**
         * The track 2 data.
         */
        private String track2Data;

        public char getBufferIdentifier() {
            return bufferIdentifier;
        }

        public void setBufferIdentifier(char bufferIdentifier) {
            this.bufferIdentifier = bufferIdentifier;
        }

        public String getTrack2Data() {
            return track2Data;
        }

        public void setTrack2Data(String track2Data) {
            this.track2Data = track2Data;
        }
    }

    /**
     * The track 2.
     */
    private Track2 track2;

    /**
     * The Class EMVDataBuffer.
     */
    // see specification Wincor Nixdorf NDC_DDC message format extension for EMV
    public class EMVDataBuffer {

        /**
         * The emv data buffer ID.
         */
        // EMV Data Buffer ID
        private char emvDataBufferID;

        /**
         * The emv indicator.
         */
        // EMV approved or denied indicator
        private char emvIndicator;

        /**
         * The emv data.
         */
        private String emvData;

        public char getEmvDataBufferID() {
            return emvDataBufferID;
        }

        public void setEmvDataBufferID(char emvDataBufferID) {
            this.emvDataBufferID = emvDataBufferID;
        }

        public char getEmvIndicator() {
            return emvIndicator;
        }

        public void setEmvIndicator(char emvIndicator) {
            this.emvIndicator = emvIndicator;
        }

        public String getEmvData() {
            return emvData;
        }

        public void setEmvData(String emvData) {
            this.emvData = emvData;
        }
    }

    /**
     * The emv data buffer.
     */
    private EMVDataBuffer emvDataBuffer;

    @Override
    public String toString() {

        return "Wincor DDC Function Command Message (912 Mode)";
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

    public EMVDataBuffer getEmvDataBuffer() {
        return emvDataBuffer;
    }

    public void setEmvDataBuffer(EMVDataBuffer emvDataBuffer) {
        this.emvDataBuffer = emvDataBuffer;
    }
}
