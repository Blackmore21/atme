package elab.emulator.atm.transmission.message.wn_ddc;

import elab.emulator.atm.transmission.message.GroupDdc_WriteCommandMessage;

import java.util.ArrayList;


/**
 * Сообщение Write Command 1 по протоколу Wincor DDC <br><br>
 * <p>
 * ProCashDDC V1.310 ProConsultDDC V1.110 User Guide 2005.pdf (стр. 274)
 */
public class WnDdc_WriteCommand_1 extends GroupDdc_WriteCommandMessage {

    public class State {

        private int stateNumber;

        private String stateData;

        public int getStateNumber() {
            return stateNumber;
        }

        public void setStateNumber(int stateNumber) {
            this.stateNumber = stateNumber;
        }

        public String getStateData() {
            return stateData;
        }

        public void setStateData(String stateData) {
            this.stateData = stateData;
        }
    }

    private ArrayList<State> states;

    @Override
    public String toString() {

        return "Wincor DDC Write Command 1 Message";
    }

    public ArrayList<State> getState() {

        return states;
    }

    public void setState(ArrayList<State> states) {

        this.states = states;
    }
}
