package elab.emulator.atm.transmission.message.ddc;

import elab.emulator.atm.transmission.message.GroupDdc_OperationalCommand;

import java.util.ArrayList;


// JDoc: Auto-generated Javadoc

/**
 * Enhanced Supply Counts Operational Command Message
 *
 * @author Dyakov
 */
public class Ddc_Enhanced_SC_OperationalCommand extends GroupDdc_OperationalCommand {

    /**
     * The Constant OPERATIONAL_COMMAND_IDENTIFIER.
     */
    private static final char OPERATIONAL_COMMAND_IDENTIFIER = '1';

    /**
     * The device id DP.
     */
    private DeviceIdDP deviceIdDP;

    /**
     * The device id CR.
     */
    private DeviceIdCR deviceIdCR;

    /**
     * The device id DI.
     */
    private DeviceIdDI deviceIdDI;

    /**
     * The device id CN.
     */
    private DeviceIdCN deviceIdCN;

    /**
     * The device id SD.
     */
    private DeviceIdSD deviceIdSD;

    /**
     * The Enum DeviceID.
     */
    public enum DeviceID {
        DEPOSITORY("DP01"),
        CARD_READER("CR01"),
        BILL_DISPENSER("DI01"),
        COIN_DISPENSER("CN01"),
        ENVELOPE_DISPENSER("SD01");

        /**
         * Code/Type
         */
        private String code;

        DeviceID(String code) {
            this.code = code;
        }

        public String getType() {

            return this.code;
        }
    }

    /**
     * The Class DeviceIdDP.
     */
    // Device ID DP01
    public class DeviceIdDP {

        /**
         * The device ID.
         */
        private DeviceID deviceID;

        /**
         * The clear deposit counts flag.
         */
        private char clearDepositCountsFlag;

        public DeviceID getDeviceID() {
            return deviceID;
        }

        public void setDeviceID(DeviceID deviceID) {
            this.deviceID = deviceID;
        }

        public char getClearDepositCountsFlag() {
            return clearDepositCountsFlag;
        }

        public void setClearDepositCountsFlag(char clearDepositCountsFlag) {
            this.clearDepositCountsFlag = clearDepositCountsFlag;
        }
    }

    /**
     * The Class DeviceIdCR.
     */
    // Device ID CR01
    public class DeviceIdCR {

        /**
         * The device ID.
         */
        private DeviceID deviceID;

        /**
         * The clear card count flag.
         */
        private char clearCardCountFlag;

        public DeviceID getDeviceID() {
            return deviceID;
        }

        public void setDeviceID(DeviceID deviceID) {
            this.deviceID = deviceID;
        }

        public char getClearCardCountFlag() {
            return clearCardCountFlag;
        }

        public void setClearCardCountFlag(char clearCardCountFlag) {
            this.clearCardCountFlag = clearCardCountFlag;
        }
    }

    /**
     * The Class DeviceIdDI.
     */
    // Device ID DI01
    public class DeviceIdDI {

        /**
         * The device ID.
         */
        private DeviceID deviceID;

        /**
         * The loaded count.
         */
        private ArrayList<Integer> loadedCount;

        /**
         * The dispence count.
         */
        private ArrayList<Integer> dispenceCount;

        /**
         * The divert 1 count.
         */
        private ArrayList<Integer> divert1Count;

        /**
         * The divert 2 count.
         */
        private ArrayList<Integer> divert2Count;

        /**
         * The retract count.
         */
        private ArrayList<Integer> retractCount;

        public DeviceID getDeviceID() {
            return deviceID;
        }

        public void setDeviceID(DeviceID deviceID) {
            this.deviceID = deviceID;
        }

        public ArrayList<Integer> getLoadedCount() {

            return loadedCount;
        }

        public void setLoadedCount(ArrayList<Integer> loadedCount) {

            this.loadedCount = loadedCount;
        }

        public ArrayList<Integer> getDispenceCount() {

            return dispenceCount;
        }

        public void setDispenceCount(ArrayList<Integer> dispenceCount) {

            this.dispenceCount = dispenceCount;
        }

        public ArrayList<Integer> getDivert1Count() {

            return divert1Count;
        }

        public void setDivert1Count(ArrayList<Integer> divert1Count) {

            this.divert1Count = divert1Count;
        }

        public ArrayList<Integer> getDivert2Count() {

            return divert2Count;
        }

        public void setDivert2Count(ArrayList<Integer> divert2Count) {

            this.divert2Count = divert2Count;
        }

        public ArrayList<Integer> getRetractCount() {

            return retractCount;
        }

        public void setRetractCount(ArrayList<Integer> retractCount) {

            this.retractCount = retractCount;
        }
    }

    /**
     * The Class DeviceIdCN.
     */
    // Device ID CN01
    public class DeviceIdCN {

        /**
         * The device ID.
         */
        private DeviceID deviceID;

        /**
         * The loaded count.
         */
        private ArrayList<Integer> loadedCount;

        /**
         * The dispense count.
         */
        private ArrayList<Integer> dispenseCount;

        public DeviceID getDeviceID() {
            return deviceID;
        }

        public void setDeviceID(DeviceID deviceID) {
            this.deviceID = deviceID;
        }

        public ArrayList<Integer> getLoadedCount() {

            return loadedCount;
        }

        public void setLoadedCount(ArrayList<Integer> loadedCount) {

            this.loadedCount = loadedCount;
        }

        public ArrayList<Integer> getDispenseCount() {

            return dispenseCount;
        }

        public void setDispenseCount(ArrayList<Integer> dispenseCount) {

            this.dispenseCount = dispenseCount;
        }
    }

    /**
     * The Class DeviceIdSD.
     */
    // Device ID SD01
    public class DeviceIdSD {

        /**
         * The device ID.
         */
        private DeviceID deviceID;

        /**
         * The loaded count.
         */
        private int loadedCount;

        /**
         * The dispense count.
         */
        private int dispenseCount;

        public DeviceID getDeviceID() {
            return deviceID;
        }

        public void setDeviceID(DeviceID deviceID) {
            this.deviceID = deviceID;
        }

        public int getLoadedCount() {
            return loadedCount;
        }

        public void setLoadedCount(int loadedCount) {
            this.loadedCount = loadedCount;
        }

        public int getDispenseCount() {
            return dispenseCount;
        }

        public void setDispenseCount(int dispenseCount) {
            this.dispenseCount = dispenseCount;
        }
    }

    @Override
    public String toString() {

        return "Diebold 912 Enhanced Supply Counts Operational Command Message";
    }

    public DeviceIdDP getDeviceIdDP() {
        return deviceIdDP;
    }

    public void setDeviceIdDP(DeviceIdDP deviceIdDP) {
        this.deviceIdDP = deviceIdDP;
    }

    public DeviceIdCR getDeviceIdCR() {
        return deviceIdCR;
    }

    public void setDeviceIdCR(DeviceIdCR deviceIdCR) {
        this.deviceIdCR = deviceIdCR;
    }

    public DeviceIdDI getDeviceIdDI() {
        return deviceIdDI;
    }

    public void setDeviceIdDI(DeviceIdDI deviceIdDI) {
        this.deviceIdDI = deviceIdDI;
    }

    public DeviceIdCN getDeviceIdCN() {
        return deviceIdCN;
    }

    public void setDeviceIdCN(DeviceIdCN deviceIdCN) {
        this.deviceIdCN = deviceIdCN;
    }

    public DeviceIdSD getDeviceIdSD() {
        return deviceIdSD;
    }

    public void setDeviceIdSD(DeviceIdSD deviceIdSD) {
        this.deviceIdSD = deviceIdSD;
    }

    public static char getOperationalCommandIdentifier() {
        return OPERATIONAL_COMMAND_IDENTIFIER;
    }
}
