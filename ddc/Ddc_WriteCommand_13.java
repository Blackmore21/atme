/*
 *
 */
package elab.emulator.atm.transmission.message.ddc;

import elab.emulator.atm.transmission.message.GroupDdc_WriteCommandMessage;

// JDoc: Auto-generated Javadoc

/**
 * The Class WriteCommand13Message.
 *
 * @author Dyakov
 */
public class Ddc_WriteCommand_13 extends GroupDdc_WriteCommandMessage {

    /**
     * The icon definition.
     */
    private byte[] iconDefinition;

    @Override
    public String toString() {

        return "Diebold Write Command 13 Message";
    }

    public byte[] getIconDefinition() {

        return iconDefinition;
    }

    public void setIconDefinition(byte[] iconDefinition) {
        this.iconDefinition = iconDefinition;
    }
}
