/*
 *
 */
package elab.emulator.atm.transmission.message.wn_ddc;

import elab.emulator.atm.transmission.message.MessageFormatException;
import elab.emulator.atm.transmission.message.ddc.DdcMessageFormatException;


// JDoc: Auto-generated Javadoc

/**
 * The Class WnDdcMessageFormatException.
 */
public class WnDdcMessageFormatException extends DdcMessageFormatException {
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new wn ddc message format exception.
     *
     * @param message     the message
     * @param reasonWnDDC the reason wn DDC
     */
    public WnDdcMessageFormatException(String message, MessageFormatException.Reason reasonWnDDC) {
        super(message, MessageFormatException.Reason.Reason00, reasonWnDDC);
    }

    /**
     * Instantiates a new wn ddc message format exception.
     *
     * @param message     the message
     * @param cause       the cause
     * @param reasonWnDDC the reason wn DDC
     */
    public WnDdcMessageFormatException(String message, Throwable cause, MessageFormatException.Reason reasonWnDDC) {
        super(message, cause, MessageFormatException.Reason.Reason00, reasonWnDDC);
    }
}
