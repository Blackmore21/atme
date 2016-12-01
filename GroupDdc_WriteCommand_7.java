/*
 *
 */
package elab.emulator.atm.transmission.message;

import elab.emulator.atm.core.Protocol;

// JDoc: Auto-generated Javadoc

/**
 * The Class WriteCommand7Message.
 *
 * @author Dyakov
 */
public class GroupDdc_WriteCommand_7 extends GroupDdc_WriteCommandMessage {

    /**
     * The key change.
     */
    private char keyChange;

    /**
     * The new key data.
     */
    private String newKeyData;

    @Override
    public String toString() {

        return Protocol.getProtocolName(Protocol.getProtocol()) + " Write Command 7 Message";
    }

    // ************************************** GETTERS AND SETTERS**************************************
    public char getKeyChange() {
        return keyChange;
    }

    public void setKeyChange(char keyChange) {
        this.keyChange = keyChange;
    }

    public String getNewKeyData() {
        return newKeyData;
    }

    public void setNewKeyData(String newKeyData) {
        this.newKeyData = newKeyData;
    }
}
