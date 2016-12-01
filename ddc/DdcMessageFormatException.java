/*
 *
 */
package elab.emulator.atm.transmission.message.ddc;

import elab.emulator.atm.transmission.message.MessageFormatException;


// JDoc: Auto-generated Javadoc

/**
 * The Class DdcMessageFormatException.
 */
public class DdcMessageFormatException extends MessageFormatException {
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new ddc message format exception.
     *
     * @param message       the message
     * @param reasonDiebold the reason diebold
     * @param reasonWnDDC   the reason wn DDC
     */
    public DdcMessageFormatException(String message, Reason reasonDiebold, Reason reasonWnDDC) {
        super(message);
        this.errorNDC = Error.Error00;
        this.errorWnNDC = Error.Error00;
        this.reasonDiebold = reasonDiebold;
        this.reasonWnDDC = reasonWnDDC;
    }

    /**
     * Instantiates a new ddc message format exception.
     *
     * @param message       the message
     * @param cause         the cause
     * @param reasonDiebold the reason diebold
     * @param reasonWnDDC   the reason wn DDC
     */
    public DdcMessageFormatException(String message, Throwable cause, Reason reasonDiebold, Reason reasonWnDDC) {
        super(message, cause);
        this.errorNDC = Error.Error00;
        this.errorWnNDC = Error.Error00;
        this.reasonDiebold = reasonDiebold;
        this.reasonWnDDC = reasonWnDDC;
    }
}
