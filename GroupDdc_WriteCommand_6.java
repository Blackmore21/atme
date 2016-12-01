/*
 *
 */
package elab.emulator.atm.transmission.message;

import elab.emulator.atm.core.Protocol;

import java.util.ArrayList;


// JDoc: Auto-generated Javadoc

/**
 * The Class WriteCommand6Message.
 *
 * @author Dyakov
 */
public class GroupDdc_WriteCommand_6 extends GroupDdc_WriteCommandMessage {

    /**
     * The Class FIT.
     */
    public class FIT {

        /**
         * The fit number.
         */
        private String fitNumber;

        /**
         * The fit data.
         */
        private String fitData;

        public String getFitNumber() {
            return fitNumber;
        }

        public void setFitNumber(String fitNumber) {
            this.fitNumber = fitNumber;
        }

        public String getFitData() {
            return fitData;
        }

        public void setFitData(String fitData) {
            this.fitData = fitData;
        }
    }

    /**
     * Данные по финансовым институтам (FIT)
     */
    private ArrayList<FIT> fits;

    @Override
    public String toString() {

        return Protocol.getProtocolName(Protocol.getProtocol()) + " Write Command 6 Message";
    }

    // ************************************** GETTERS AND SETTERS**************************************
    public ArrayList<FIT> getFits() {

        return fits;
    }

    public void setFits(ArrayList<FIT> fits) {

        this.fits = fits;
    }
}
