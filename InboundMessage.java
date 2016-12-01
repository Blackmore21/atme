package elab.emulator.atm.transmission.message;


/**
 * Класс входящего сообщения по протоколам группы DDC.
 * Имеет структуру состоящую из уже раcпарсенных полей.
 *
 * @author Dyakov
 */
public abstract class InboundMessage {

    /**
     * Response Flag
     */
    private char responseFlag;

    /**
     * Logical Unit Number (LUNO)
     */
    private String luno;

    /**
     * Message Sequence Number.
     */
    private String messageSequenceNumber;

    //**********************GETTERS AND SETTERS*********************
    public char getResponseFlag() {
        return responseFlag;
    }

    public void setResponseFlag(char responseFlag) {
        this.responseFlag = responseFlag;
    }

    public String getLuno() {
        return luno;
    }

    public void setLuno(String luno) {
        this.luno = luno;
    }

    public String getMessageSequenceNumber() {
        return messageSequenceNumber;
    }

    public void setMessageSequenceNumber(String messageSequenceNumber) {
        this.messageSequenceNumber = messageSequenceNumber;
    }
}
