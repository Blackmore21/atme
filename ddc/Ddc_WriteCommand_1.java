/*
 *
 */
package elab.emulator.atm.transmission.message.ddc;

import elab.emulator.atm.transmission.message.GroupDdc_WriteCommandMessage;

import java.util.ArrayList;


// JDoc: Auto-generated Javadoc

/**
 * The Class WriteCommand1Message.
 *
 * @author Dyakov
 */
public class Ddc_WriteCommand_1 extends GroupDdc_WriteCommandMessage {

    /**
     * The states data.
     */
    private ArrayList<String> statesData;

    @Override
    public String toString() {

        return "Diebold Write Command 1 Message";
    }

    public ArrayList<String> getStatesData() {

        return statesData;
    }

    public void setStatesData(ArrayList<String> statesData) {

        this.statesData = statesData;
    }
}
