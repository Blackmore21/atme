package elab.emulator.atm.transmission.message.wn_ddc;

import elab.emulator.atm.transmission.message.GroupDdc_WriteCommandMessage;

import java.util.ArrayList;


/**
 * Сообщение Write Command 3 по протоколу Wincor DDC <br><br>
 * <p>
 * ProCashDDC V1.310 ProConsultDDC V1.110 User Guide 2005.pdf (стр. 281)
 */
public class WnDdc_WriteCommand_3 extends GroupDdc_WriteCommandMessage {

    /**
     * The Class SetForTABS.
     */
    public class SetForTABS {

        /**
         * The camera control.
         */
        private char cameraControl;

        /**
         * The reserved set.
         */
        private ArrayList<String> reservedSet;

        public char getCameraControl() {
            return cameraControl;
        }

        public void setCameraControl(char cameraControl) {
            this.cameraControl = cameraControl;
        }

        public ArrayList<String> getReservedSet() {

            return reservedSet;
        }

        public void setReservedSet(ArrayList<String> reservedSet) {

            this.reservedSet = reservedSet;
        }
    }

    /**
     * The set for TABS.
     */
    private SetForTABS setForTABS;

    /**
     * The miscellaneous features 1.
     */
    private int miscellaneousFeatures1;

    /**
     * The reserved 5.
     */
    private int reserved5;

    /**
     * The miscellaneous features 2.
     */
    private int miscellaneousFeatures2;

    /**
     * The reserved 6.
     */
    private int reserved6;

    /**
     * The reserved 7.
     */
    private int reserved7;

    /**
     * The miscellaneous features 3.
     */
    private int miscellaneousFeatures3;

    /**
     * The luno 1.
     */
    private String luno1;

    /**
     * The Class timeSet.
     */
    public class timeSet {

        /**
         * The timer number.
         */
        private int timerNumber;

        /**
         * The number of ticks.
         */
        private int numberOfTicks;

        public int getTimerNumber() {
            return timerNumber;
        }

        public void setTimerNumber(int timerNumber) {
            this.timerNumber = timerNumber;
        }

        public int getNumberOfTicks() {
            return numberOfTicks;
        }

        public void setNumberOfTicks(int numberOfTicks) {
            this.numberOfTicks = numberOfTicks;
        }
    }

    /**
     * The time sets.
     */
    private ArrayList<timeSet> timeSets;

    @Override
    public String toString() {

        return "Wincor DDC Write Command 3 Message";
    }

    public SetForTABS getSetForTABS() {
        return setForTABS;
    }

    public void setSetForTABS(SetForTABS setForTABS) {
        this.setForTABS = setForTABS;
    }

    public int getMiscellaneousFeatures1() {
        return miscellaneousFeatures1;
    }

    public void setMiscellaneousFeatures1(int miscellaneousFeatures1) {
        this.miscellaneousFeatures1 = miscellaneousFeatures1;
    }

    public int getReserved5() {
        return reserved5;
    }

    public void setReserved5(int reserved5) {
        this.reserved5 = reserved5;
    }

    public int getMiscellaneousFeatures2() {
        return miscellaneousFeatures2;
    }

    public void setMiscellaneousFeatures2(int miscellaneousFeatures2) {
        this.miscellaneousFeatures2 = miscellaneousFeatures2;
    }

    public int getReserved6() {
        return reserved6;
    }

    public void setReserved6(int reserved6) {
        this.reserved6 = reserved6;
    }

    public int getReserved7() {
        return reserved7;
    }

    public void setReserved7(int reserved7) {
        this.reserved7 = reserved7;
    }

    public int getMiscellaneousFeatures3() {
        return miscellaneousFeatures3;
    }

    public void setMiscellaneousFeatures3(int miscellaneousFeatures3) {
        this.miscellaneousFeatures3 = miscellaneousFeatures3;
    }

    public String getLuno1() {
        return luno1;
    }

    public void setLuno1(String luno1) {
        this.luno1 = luno1;
    }

    public ArrayList<timeSet> getTimeSets() {

        return timeSets;
    }

    public void setTimeSets(ArrayList<timeSet> timeSets) {

        this.timeSets = timeSets;
    }
}
