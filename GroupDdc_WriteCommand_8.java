package elab.emulator.atm.transmission.message;

import elab.emulator.atm.core.Protocol;

// JDoc: Auto-generated Javadoc

/**
 * The Class WriteCommand8Message.
 *
 * @author Dyakov
 */
public class GroupDdc_WriteCommand_8 extends GroupDdc_WriteCommandMessage {

    /**
     * The configuration ID number.
     */
    private String configurationIDNumber;

    @Override
    public String toString() {

        return Protocol.getProtocolName(Protocol.getProtocol()) + " Write Command 8 Message";
    }

    // ************************************** GETTERS AND SETTERS**************************************
    public String getConfigurationIDNumber() {

        return configurationIDNumber;
    }

    public void setConfigurationIDNumber(String configurationIDNumber) {

        this.configurationIDNumber = configurationIDNumber;
    }
}
