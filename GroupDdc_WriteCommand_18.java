package elab.emulator.atm.transmission.message;

import elab.emulator.atm.core.Protocol;

import java.util.ArrayList;


// JDoc: Auto-generated Javadoc

/**
 * The Class WriteCommand18Message.
 *
 * @author Dyakov
 */
public class GroupDdc_WriteCommand_18 extends GroupDdc_WriteCommandMessage {

    /**
     * The Class FormatTemplate.
     */
    public class FormatTemplate {

        /**
         * The format template number.
         */
        private String formatTemplateNumber;

        /**
         * The format template data.
         */
        private String formatTemplateData;

        public String getFormatTemplateNumber() {
            return formatTemplateNumber;
        }

        public void setFormatTemplateNumber(String formatTemplateNumber) {
            this.formatTemplateNumber = formatTemplateNumber;
        }

        public String getFormatTemplateData() {
            return formatTemplateData;
        }

        public void setFormatTemplateData(String formatTemplateData) {
            this.formatTemplateData = formatTemplateData;
        }
    }

    /**
     * The format tempalates.
     */
    private ArrayList<FormatTemplate> formatTempalates;

    @Override
    public String toString() {

        return Protocol.getProtocolName(Protocol.getProtocol()) + " Write Command 18 Message";
    }

    // ************************************** GETTERS AND SETTERS**************************************
    public ArrayList<FormatTemplate> getFormatTempalates() {

        return formatTempalates;
    }

    public void setFormatTempalates(ArrayList<FormatTemplate> formatTempalates) {

        this.formatTempalates = formatTempalates;
    }
}
