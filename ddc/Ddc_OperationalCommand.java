package elab.emulator.atm.transmission.message.ddc;

import elab.emulator.atm.transmission.message.GroupDdc_OperationalCommand;

import java.util.ArrayList;


// JDoc: Auto-generated Javadoc

/**
 * Operational Command Message<br><br>
 * <p>
 * <b>Agilis® 3 91x Terminal Programming Manual 2013.pdf (стр. 366)
 * Operational Command Identifier 1
 *
 * @author Dyakov
 */
public class Ddc_OperationalCommand extends GroupDdc_OperationalCommand {

    /**
     * Operational Command Identifier 1
     */
    private static final char OPERATIONAL_COMMAND_IDENTIFIER = '1';

    /**
     * Data.
     */
    private char data;

    /**
     * The Class StatusFlagAndDeviceNames.
     */
    public class StatusFlagAndDeviceNames {

        /**
         * The status flag.
         */
        private char statusFlag;

        /**
         * The device names.
         */
        private ArrayList<DeviceName> deviceNames;

        public char getStatusFlag() {
            return statusFlag;
        }

        public void setStatusFlag(char statusFlag) {
            this.statusFlag = statusFlag;
        }

        public ArrayList<DeviceName> getDeviceNames() {

            return deviceNames;
        }

        public void setDeviceNames(ArrayList<DeviceName> deviceNames) {

            this.deviceNames = deviceNames;
        }
    }

    /**
     * The status flag and device names.
     */
    private StatusFlagAndDeviceNames statusFlagAndDeviceNames;

    /**
     * The Enum DeviceName.
     */
    public enum DeviceName {
        /**
         * The bill dispenser.
         */
        BILL_DISPENSER("DI01"),
        /**
         * The depository.
         */
        DEPOSITORY("DP01"),
        /**
         * The presenter.
         */
        PRESENTER("DR01"),
        /**
         * The passbook printer.
         */
        PASSBOOK_PRINTER("PB01"),
        /**
         * The receipt printer.
         */
        RECEIPT_PRINTER("PR01"),
        /**
         * The journal printer.
         */
        JOURNAL_PRINTER("PR02"),
        /**
         * The edc.
         */
        EDC("PR03"),
        /**
         * The envelope dispenser.
         */
        ENVELOPE_DISPENSER("SD01"),
        /**
         * The statement printer.
         */
        STATEMENT_PRINTER("SP01"),
        /**
         * The coin dispenser.
         */
        COIN_DISPENSER("CN01"),
        /**
         * The card reader.
         */
        CARD_READER("CR01");

        /**
         * The code.
         */
        private String code;// тип устройства

        /**
         * Instantiates a new device name.
         *
         * @param code the code
         */
        private DeviceName(String code) {
            this.code = code;
        }

        public String getCode() {

            return this.code;
        }
    }

    @Override
    public String toString() {

        return "Diebold 912 Operational Command Message";
    }

    //********************GETTERS AND SETTERS************************
    public static char getOperationalCommandIdentifier() {
        return OPERATIONAL_COMMAND_IDENTIFIER;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public StatusFlagAndDeviceNames getStatusFlagAndDeviceNames() {
        return statusFlagAndDeviceNames;
    }

    public void setStatusFlagAndDeviceNames(StatusFlagAndDeviceNames statusFlagAndDeviceNames) {
        this.statusFlagAndDeviceNames = statusFlagAndDeviceNames;
    }
}
