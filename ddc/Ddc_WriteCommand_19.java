/*
 *
 */
package elab.emulator.atm.transmission.message.ddc;

import elab.emulator.atm.transmission.message.GroupDdc_WriteCommandMessage;

import java.util.ArrayList;


// JDoc: Auto-generated Javadoc

/**
 * The Class WriteCommand19Message.
 *
 * @author Dyakov
 */
public class Ddc_WriteCommand_19 extends GroupDdc_WriteCommandMessage {

    /**
     * The data and data identifier.
     */
    private ArrayList<byte[]> dataAndDataIdentifier;

    @Override
    public String toString() {

        return "Diebold Write Command 19 Message";
    }

    public ArrayList<byte[]> getDataAndDataIdentifier() {

        return dataAndDataIdentifier;
    }

    public void setDataAndDataIdentifier(ArrayList<byte[]> dataAndDataIdentifier) {

        this.dataAndDataIdentifier = dataAndDataIdentifier;
    }
}
