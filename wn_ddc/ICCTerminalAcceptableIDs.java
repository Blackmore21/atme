/*
 *
 */
package elab.emulator.atm.transmission.message.wn_ddc;

import java.util.ArrayList;


// JDoc: Auto-generated Javadoc

/**
 * ICC Terminal Acceptable Application IDs.
 *
 * @author Dyakov
 */
public class ICCTerminalAcceptableIDs extends EMVConfigurationData {

    /**
     * The Class ApplicationID.
     */
    public class ApplicationID {

        /**
         * The entry number.
         */
        private String entryNumber;

        /**
         * The length primary AID value.
         */
        private String lengthPrimaryAIDValue;        // Length of
        // Full/Partial
        // Primary AID
        // Value

        /**
         * The primary AID value.
         */
        private String primaryAIDValue;            // Full/Partial
        // Primary AID
        // Value

        /**
         * The length label.
         */
        private String lengthLabel;                // Length of
        // Default
        // Application
        // Label

        /**
         * The label.
         */
        private String label;                        // Default
        // Application
        // Label

        /**
         * The primary type.
         */
        private String primaryType;                // Primary AID
        // ICC
        // Application
        // Type

        /**
         * The primary lowest version number.
         */
        private String primaryLowestVersionNumber;    // Primary AID
        // Lowest
        // Application
        // Version
        // Number

        /**
         * The primary highest version number.
         */
        private String primaryHighestVersionNumber;// Primary AID
        // Highest
        // Application
        // Version
        // Number

        /**
         * The primary AID terminal.
         */
        private String primaryAIDTerminal;            // Primary AID
        // Terminal
        // Action Code -
        // Denial

        /**
         * The transaction request object num.
         */
        private String transactionRequestObjectNum;// Number of
        // Data
        // Object(s) for
        // Transaction
        // Request

        /**
         * The data objects TR.
         */
        private ArrayList<String> dataObjectsTR;                // Data
        // Object(s) for
        // Transaction
        // Request

        /**
         * The completion data object num.
         */
        private String completionDataObjectNum;    // Number of
        // Data
        // Object(s) for
        // Completion
        // Data

        /**
         * The data objects CD.
         */
        private ArrayList<String> dataObjectsCD;                // Data
        // Object(s) for
        // Completion
        // Data

        /**
         * The secondary AI ds num.
         */
        private String secondaryAIDsNum;            // Number of
        // Secondary
        // AIDs

        /**
         * The Class SecondaryAID.
         */
        public class SecondaryAID {

            /**
             * The length secondary AID value.
             */
            private String lengthSecondaryAIDValue;// Length of Full/Partial
            // Secondary AID Value

            /**
             * The secondary AID value.
             */
            private String secondaryAIDValue;        // Full/Partial Secondary
            // AID Value

            public String getLengthSecondaryAIDValue() {
                return lengthSecondaryAIDValue;
            }

            public void setLengthSecondaryAIDValue(String lengthSecondaryAIDValue) {
                this.lengthSecondaryAIDValue = lengthSecondaryAIDValue;
            }

            public String getSecondaryAIDValue() {
                return secondaryAIDValue;
            }

            public void setSecondaryAIDValue(String secondaryAIDValue) {
                this.secondaryAIDValue = secondaryAIDValue;
            }
        }

        /**
         * The secondary AI ds.
         */
        private ArrayList<SecondaryAID> secondaryAIDs;

        /**
         * The selection indicator.
         */
        private int selectionIndicator = -1;    // Application
        // Selection
        // Indicator

        /**
         * The track 2 data C.
         */
        private int track2DataC = -1;    // Track 2
        // Data for
        // Central

        /**
         * The track 2 data T.
         */
        private int track2DataT = -1;    // Track 2
        // Data To
        // Be Used
        // During
        // ICC
        // Transaction

        /**
         * The length additional track 2 data.
         */
        private String lengthAdditionalTrack2Data;    // Length Of
        // Additional
        // Track 2
        // Data in
        // the
        // following
        // field

        /**
         * The additional track 2 data.
         */
        private String additionalTrack2Data;        // Additional
        // Track 2
        // Data

        public String getEntryNumber() {
            return entryNumber;
        }

        public void setEntryNumber(String entryNumber) {
            this.entryNumber = entryNumber;
        }

        public String getLengthPrimaryAIDValue() {
            return lengthPrimaryAIDValue;
        }

        public void setLengthPrimaryAIDValue(String lengthPrimaryAIDValue) {
            this.lengthPrimaryAIDValue = lengthPrimaryAIDValue;
        }

        public String getPrimaryAIDValue() {
            return primaryAIDValue;
        }

        public void setPrimaryAIDValue(String primaryAIDValue) {
            this.primaryAIDValue = primaryAIDValue;
        }

        public String getLengthLabel() {
            return lengthLabel;
        }

        public void setLengthLabel(String lengthLabel) {
            this.lengthLabel = lengthLabel;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getPrimaryType() {
            return primaryType;
        }

        public void setPrimaryType(String primaryType) {
            this.primaryType = primaryType;
        }

        public String getPrimaryLowestVersionNumber() {
            return primaryLowestVersionNumber;
        }

        public void setPrimaryLowestVersionNumber(String primaryLowestVersionNumber) {
            this.primaryLowestVersionNumber = primaryLowestVersionNumber;
        }

        public String getPrimaryHighestVersionNumber() {
            return primaryHighestVersionNumber;
        }

        public void setPrimaryHighestVersionNumber(String primaryHighestVersionNumber) {
            this.primaryHighestVersionNumber = primaryHighestVersionNumber;
        }

        public String getPrimaryAIDTerminal() {
            return primaryAIDTerminal;
        }

        public void setPrimaryAIDTerminal(String primaryAIDTerminal) {
            this.primaryAIDTerminal = primaryAIDTerminal;
        }

        public String getTransactionRequestObjectNum() {
            return transactionRequestObjectNum;
        }

        public void setTransactionRequestObjectNum(String transactionRequestObjectNum) {
            this.transactionRequestObjectNum = transactionRequestObjectNum;
        }

        public ArrayList<String> getDataObjectsTR() {

            return dataObjectsTR;
        }

        public void setDataObjectsTR(ArrayList<String> dataObjectsTR) {

            this.dataObjectsTR = dataObjectsTR;
        }

        public int getSelectionIndicator() {
            return selectionIndicator;
        }

        public void setSelectionIndicator(int selectionIndicator) {
            this.selectionIndicator = selectionIndicator;
        }

        public int getTrack2DataC() {
            return track2DataC;
        }

        public void setTrack2DataC(int track2DataC) {
            this.track2DataC = track2DataC;
        }

        public int getTrack2DataT() {
            return track2DataT;
        }

        public void setTrack2DataT(int track2DataT) {
            this.track2DataT = track2DataT;
        }

        public String getLengthAdditionalTrack2Data() {
            return lengthAdditionalTrack2Data;
        }

        public void setLengthAdditionalTrack2Data(String lengthAdditionalTrack2Data) {
            this.lengthAdditionalTrack2Data = lengthAdditionalTrack2Data;
        }

        public String getAdditionalTrack2Data() {
            return additionalTrack2Data;
        }

        public void setAdditionalTrack2Data(String additionalTrack2Data) {
            this.additionalTrack2Data = additionalTrack2Data;
        }

        public String getCompletionDataObjectNum() {
            return completionDataObjectNum;
        }

        public void setCompletionDataObjectNum(String completionDataObjectNum) {
            this.completionDataObjectNum = completionDataObjectNum;
        }

        public ArrayList<String> getDataObjectsCD() {

            return dataObjectsCD;
        }

        public void setDataObjectsCD(ArrayList<String> dataObjectsCD) {

            this.dataObjectsCD = dataObjectsCD;
        }

        public String getSecondaryAIDsNum() {
            return secondaryAIDsNum;
        }

        public void setSecondaryAIDsNum(String secondaryAIDsNum) {
            this.secondaryAIDsNum = secondaryAIDsNum;
        }

        public ArrayList<SecondaryAID> getSecondaryAIDs() {

            return secondaryAIDs;
        }

        public void setSecondaryAIDs(ArrayList<SecondaryAID> secondaryAIDs) {

            this.secondaryAIDs = secondaryAIDs;
        }
    }

    /**
     * The application I ds.
     */
    private ArrayList<ApplicationID> applicationIDs;

    public ArrayList<ApplicationID> getApplicationIDs() {

        return applicationIDs;
    }

    public void setApplicationIDs(ArrayList<ApplicationID> applicationIDs) {

        this.applicationIDs = applicationIDs;
    }
}
