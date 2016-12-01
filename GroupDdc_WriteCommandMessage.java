package elab.emulator.atm.transmission.message;

import elab.emulator.atm.transmission.creator.OutboundMessageCreator;
import elab.emulator.settings.StaticSettings;

/**
 * Базовое сообщение Write Command для протоколов Diebold 912 и Wincor Nixdorf
 *
 * @author Dyakov
 */
public class GroupDdc_WriteCommandMessage extends InboundMessage {

    /**
     * The Constant WRITE_COMMAND_IDENTIFIER.
     */
    private static final char WRITE_COMMAND_IDENTIFIER = '3';

    /**
     * The write identifier.
     */
    private char writeIdentifier;

    /**
     * The modifier.
     */
    private char modifier;

    /**
     * The mac data.
     */
    private String macData;

    /**
     * Check MAC.
     *
     * @param message         the message
     * @param recievedMessage the recieved message
     * @return true, if successful
     */
    public static boolean checkMAC(GroupDdc_WriteCommandMessage message, byte[] recievedMessage) {

        // check used message authentication (MAC)
        if (StaticSettings.getIAtmeSettings().getSecuritySettings().isMacing()) {
            // check field with MAC data
            if (message.getMacData() != null) {
                // check MAC data
                String macedMessage = OutboundMessageCreator.verifyMac(new String(recievedMessage));
                if (macedMessage == null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    // ************************************** GETTERS AND SETTERS**************************************
    public static char getWriteCommandIdentifier() {
        return WRITE_COMMAND_IDENTIFIER;
    }

    public char getWriteIdentifier() {
        return writeIdentifier;
    }

    public void setWriteIdentifier(char writeIdentifier) {
        this.writeIdentifier = writeIdentifier;
    }

    public char getModifier() {
        return modifier;
    }

    public void setModifier(char modifier) {
        this.modifier = modifier;
    }

    public String getMacData() {
        return macData;
    }

    public void setMacData(String macData) {
        this.macData = macData;
    }
}
