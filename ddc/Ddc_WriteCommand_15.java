/*
 *
 */
package elab.emulator.atm.transmission.message.ddc;

import elab.emulator.atm.transmission.message.GroupDdc_WriteCommandMessage;

// JDoc: Auto-generated Javadoc

/**
 * The Class WriteCommand15Message.
 *
 * @author Dyakov
 */
public class Ddc_WriteCommand_15 extends GroupDdc_WriteCommandMessage {

    /**
     * The cell data.
     */
    private byte[] cellData;

    @Override
    public String toString() {

        return "Diebold Write Command 15 Message";
    }

    public byte[] getCellData() {

        return cellData;
    }

    public void setCellData(byte[] cellData) {
        this.cellData = cellData;
    }
}
