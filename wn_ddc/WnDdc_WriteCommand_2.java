package elab.emulator.atm.transmission.message.wn_ddc;

import elab.emulator.atm.transmission.message.GroupDdc_WriteCommandMessage;

import java.util.ArrayList;


/**
 * Сообщение Write Command 2 по протоколу Wincor DDC <br><br>
 * <p>
 * ProCashDDC V1.310 ProConsultDDC V1.110 User Guide 2005.pdf (стр. 278)
 */
public class WnDdc_WriteCommand_2 extends GroupDdc_WriteCommandMessage {

    /**
     * The Class GroupOfFields.
     */
    public class GroupOfFields {

        /**
         * The screen number.
         */
        private String screenNumber;

        /**
         * The language bank number.
         */
        private String languageBankNumber;

        /**
         * The voice prompting commands.
         */
        private String voicePromptingCommands;

        /**
         * The voice keypad feedback commands.
         */
        private String voiceKeypadFeedbackCommands;

        /**
         * The screen data.
         */
        private String screenData;

        public String getScreenNumber() {
            return screenNumber;
        }

        public void setScreenNumber(String screenNumber) {
            this.screenNumber = screenNumber;
        }

        public String getLanguageBankNumber() {
            return languageBankNumber;
        }

        public void setLanguageBankNumber(String languageBankNumber) {
            this.languageBankNumber = languageBankNumber;
        }

        public String getVoicePromptingCommands() {
            return voicePromptingCommands;
        }

        public void setVoicePromptingCommands(String voicePromptingCommands) {
            this.voicePromptingCommands = voicePromptingCommands;
        }

        public String getVoiceKeypadFeedbackCommands() {
            return voiceKeypadFeedbackCommands;
        }

        public void setVoiceKeypadFeedbackCommands(String voiceKeypadFeedbackCommands) {
            this.voiceKeypadFeedbackCommands = voiceKeypadFeedbackCommands;
        }

        public String getScreenData() {
            return screenData;
        }

        public void setScreenData(String screenData) {
            this.screenData = screenData;
        }
    }

    /**
     * The groups of fields.
     */
    private ArrayList<GroupOfFields> groupsOfFields;

    @Override
    public String toString() {

        return "Wincor DDC Write Command 2 Message";
    }

    public ArrayList<GroupOfFields> getGroupsOfFields() {

        return groupsOfFields;
    }

    public void setGroupsOfFields(ArrayList<GroupOfFields> groupsOfFields) {

        this.groupsOfFields = groupsOfFields;
    }
}
