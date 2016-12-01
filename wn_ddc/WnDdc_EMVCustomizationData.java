package elab.emulator.atm.transmission.message.wn_ddc;

import elab.emulator.atm.transmission.message.GroupDdc_WriteCommandMessage;

import java.util.ArrayList;


// JDoc: Auto-generated Javadoc

/**
 * Message class. See Wincor Nixdorf NDC_DDC message format extension for EMV.
 *
 * @author Dyakov
 */
public class WnDdc_EMVCustomizationData extends GroupDdc_WriteCommandMessage {

    /**
     * The Class ApplicationIdentifier.
     */
    public class ApplicationID {

        /**
         * The application id number.
         */
        private int applicationIdNumber;

        /**
         * The application identifier.
         */
        private String applicationIdentifier;

        /**
         * The lowest version number.
         */
        private String lowestVersionNumber;

        /**
         * The highest version number.
         */
        private String highestVersionNumber;

        /**
         * The terminal action code.
         */
        private String terminalActionCode;

        /**
         * Data Objects list (TAG list) to send in Transaction request message
         */
        private String tagListTRM;

        /**
         * Data Objects list (TAG list) to be used in Solicited Status Message extention, Last Transaction Status Extension and Logical EMV errors
         */
        private String tagListSLL;

        /**
         * AID Options: Partial/Exact selection
         */
        private String AIDOptionSelection;

        /**
         * AID Options: Perform
         */
        private String AIDOptionPerform;

        /**
         * The AID default label.
         */
        private String AIDDefaultLabel;

        //********************************GETTERS AND SETTERS*********************************
        public int getApplicationIdNumber() {
            return applicationIdNumber;
        }

        public void setApplicationIdNumber(int applicationIdNumber) {
            this.applicationIdNumber = applicationIdNumber;
        }

        public String getApplicationIdentifier() {
            return applicationIdentifier;
        }

        public void setApplicationIdentifier(String applicationIdentifier) {
            this.applicationIdentifier = applicationIdentifier;
        }

        public String getLowestVersionNumber() {
            return lowestVersionNumber;
        }

        public void setLowestVersionNumber(String lowestVersionNumber) {
            this.lowestVersionNumber = lowestVersionNumber;
        }

        public String getHighestVersionNumber() {
            return highestVersionNumber;
        }

        public void setHighestVersionNumber(String highestVersionNumber) {
            this.highestVersionNumber = highestVersionNumber;
        }

        public String getTerminalActionCode() {
            return terminalActionCode;
        }

        public void setTerminalActionCode(String terminalActionCode) {
            this.terminalActionCode = terminalActionCode;
        }

        public String getTagListTRM() {
            return tagListTRM;
        }

        public void setTagListTRM(String tagListTRM) {
            this.tagListTRM = tagListTRM;
        }

        public String getTagListSLL() {
            return tagListSLL;
        }

        public void setTagListSLL(String tagListSLL) {
            this.tagListSLL = tagListSLL;
        }

        public String getAIDOptionSelection() {
            return AIDOptionSelection;
        }

        public void setAIDOptionSelection(String aIDOptionSelection) {

            AIDOptionSelection = aIDOptionSelection;
        }

        public String getAIDOptionPerform() {
            return AIDOptionPerform;
        }

        public void setAIDOptionPerform(String aIDOptionPerform) {

            AIDOptionPerform = aIDOptionPerform;
        }

        public String getAIDDefaultLabel() {
            return AIDDefaultLabel;
        }

        public void setAIDDefaultLabel(String aIDDefaultLabel) {

            AIDDefaultLabel = aIDDefaultLabel;
        }
    }


    /**
     * The application identifiers.
     */
    private ArrayList<ApplicationID> applicationIdentifiers;

    @Override
    public String toString() {

        return "EMV Customization Data";
    }

    public ArrayList<ApplicationID> getApplicationIdentifiers() {

        return applicationIdentifiers;
    }

    public void setApplicationIdentifiers(ArrayList<ApplicationID> applicationIdentifiers) {

        this.applicationIdentifiers = applicationIdentifiers;
    }
}
