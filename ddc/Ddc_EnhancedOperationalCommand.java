package elab.emulator.atm.transmission.message.ddc;

import elab.emulator.atm.transmission.message.InboundMessage;

/**
 * Enhanced Operational Command Message
 * <p>
 * <b>Agilis® 3 91x Terminal Programming Manual 2013.pdf (стр. 400)
 * Enhanced Operational Command Identifier 5
 *
 * @author Dyakov
 */
public class Ddc_EnhancedOperationalCommand extends InboundMessage {

    /**
     * Enhanced Operational Command Identifier
     */
    private static final char OPERATIONAL_COMMAND_IDENTIFIER = '5';

    /**
     * Command Code
     */
    private String commandCode;

    /**
     * Data Identifier.
     */
    private String dataIdentifier;

    /**
     * Command Data.
     */
    private String commandData;

    @Override
    public String toString() {

        return "Diebold 912 Enhanced Operational Command Message";
    }

    //********************GETTERS AND SETTERS************************
    public static char getOperationalCommandIdentifier() {
        return OPERATIONAL_COMMAND_IDENTIFIER;
    }

    public String getCommandCode() {
        return commandCode;
    }

    public void setCommandCode(String commandCode) {
        this.commandCode = commandCode;
    }

    public String getDataIdentifier() {
        return dataIdentifier;
    }

    public void setDataIdentifier(String dataIdentifier) {
        this.dataIdentifier = dataIdentifier;
    }

    public String getCommandData() {
        return commandData;
    }

    public void setCommandData(String commandData) {
        this.commandData = commandData;
    }
}
