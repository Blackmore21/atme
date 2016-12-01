package elab.emulator.atm.transmission.message.wn_ddc;

import elab.emulator.atm.transmission.message.GroupDdc_OperationalCommand;


// JDoc: Auto-generated Javadoc

/**
 * The Class WnDDCOperationalCommandMessage.
 *
 * @author Dyakov
 */
public class WnDdc_OperationalCommand extends GroupDdc_OperationalCommand {

    /**
     * The Constant OPERATIONAL_COMMAND_IDENTIFIER.
     */
    private static final char OPERATIONAL_COMMAND_IDENTIFIER = '1';

    @Override
    public String toString() {

        return "Wincor DDC Operational Command Message";
    }

    public static char getOperationalCommandIdentifier() {
        return OPERATIONAL_COMMAND_IDENTIFIER;
    }
}
