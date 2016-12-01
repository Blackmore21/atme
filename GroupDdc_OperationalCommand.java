package elab.emulator.atm.transmission.message;


/**
 * Сообщение Operational Command для протоколов группы DDC
 *
 * @author Dyakov
 */
public abstract class GroupDdc_OperationalCommand extends InboundMessage {

    /**
     * Command Code
     */
    private char commandCode;

    //*************************GETTERS AND SETTERS*************************
    public char getCommandCode() {
        return commandCode;
    }

    public void setCommandCode(char commandCode) {
        this.commandCode = commandCode;
    }
}
