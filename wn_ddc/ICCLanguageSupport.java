/*
 *
 */
package elab.emulator.atm.transmission.message.wn_ddc;

import java.util.ArrayList;


// JDoc: Auto-generated Javadoc

/**
 * ICC Language Support.
 *
 * @author Dyakov
 */
public class ICCLanguageSupport extends EMVConfigurationData {

    /**
     * The number of language mapping entries.
     */
    private String numberOfLanguageMappingEntries;

    /**
     * The Class Languadge.
     */
    public class Languadge {

        /**
         * The language code.
         */
        private String languageCode;

        /**
         * The screen base.
         */
        private int screenBase;

        /**
         * The audio base.
         */
        private int audioBase;

        /**
         * The opcode buffer positions.
         */
        private String opcodeBufferPositions;

        /**
         * The opcode buffer values.
         */
        private String opcodeBufferValues;

        public String getLanguageCode() {
            return languageCode;
        }

        public void setLanguageCode(String languageCode) {
            this.languageCode = languageCode;
        }

        public int getScreenBase() {
            return screenBase;
        }

        public void setScreenBase(int screenBase) {
            this.screenBase = screenBase;
        }

        public int getAudioBase() {
            return audioBase;
        }

        public void setAudioBase(int audioBase) {
            this.audioBase = audioBase;
        }

        public String getOpcodeBufferPositions() {
            return opcodeBufferPositions;
        }

        public void setOpcodeBufferPositions(String opcodeBufferPositions) {
            this.opcodeBufferPositions = opcodeBufferPositions;
        }

        public String getOpcodeBufferValues() {
            return opcodeBufferValues;
        }

        public void setOpcodeBufferValues(String opcodeBufferValues) {
            this.opcodeBufferValues = opcodeBufferValues;
        }
    }

    /**
     * The languadges.
     */
    private ArrayList<Languadge> languadges;

    public String getNumberOfLanguageMappingEntries() {
        return numberOfLanguageMappingEntries;
    }

    public void setNumberOfLanguageMappingEntries(String numberOfLanguageMappingEntries) {
        this.numberOfLanguageMappingEntries = numberOfLanguageMappingEntries;
    }

    public ArrayList<Languadge> getLanguadges() {

        return languadges;
    }

    public void setLanguadges(ArrayList<Languadge> languadges) {

        this.languadges = languadges;
    }
}
