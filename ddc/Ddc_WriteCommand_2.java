/*
 *
 */
package elab.emulator.atm.transmission.message.ddc;

import elab.emulator.atm.transmission.message.GroupDdc_WriteCommandMessage;

import java.util.ArrayList;


// JDoc: Auto-generated Javadoc

/**
 * The Class WriteCommand2Message.
 *
 * @author Dyakov
 */
public class Ddc_WriteCommand_2 extends GroupDdc_WriteCommandMessage {

    /**
     * The Class SetOfField.
     */
    public class SetOfField {

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
         * The touch template data.
         */
        private String touchTemplateData;

        /**
         * The key mapping data.
         */
        private String keyMappingData;

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

        public String getTouchTemplateData() {
            return touchTemplateData;
        }

        public void setTouchTemplateData(String touchTemplateData) {
            this.touchTemplateData = touchTemplateData;
        }

        public String getKeyMappingData() {
            return keyMappingData;
        }

        public void setKeyMappingData(String keyMappingData) {
            this.keyMappingData = keyMappingData;
        }

        public String getScreenData() {
            return screenData;
        }

        public void setScreenData(String screenData) {
            this.screenData = screenData;
        }
    }

    /**
     * The set of field.
     */
    private ArrayList<SetOfField> setOfField;

    @Override
    public String toString() {

        return "Diebold Write Command 2 Message";
    }

    public ArrayList<SetOfField> getSetOfField() {

        return setOfField;
    }

    public void setSetOfField(ArrayList<SetOfField> setOfField) {

        this.setOfField = setOfField;
    }
}
