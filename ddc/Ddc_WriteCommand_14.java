package elab.emulator.atm.transmission.message.ddc;

import elab.emulator.atm.transmission.message.GroupDdc_WriteCommandMessage;

// JDoc: Auto-generated Javadoc

/**
 * The Class WriteCommand14Message.
 *
 * @author Dyakov
 */
public class Ddc_WriteCommand_14 extends GroupDdc_WriteCommandMessage {

    /**
     * The character set definition.
     */
    private byte[] characterSetDefinition;

    @Override
    public String toString() {

        return "Diebold Write Command 14 Message";
    }

    public byte[] getCharacterSetDefinition() {

        return characterSetDefinition;
    }

    public void setCharacterSetDefinition(byte[] characterSetDefinition) {
        this.characterSetDefinition = characterSetDefinition;
    }
}
