package elab.emulator.atm.transmission.message;

// JDoc: Auto-generated Javadoc

/**
 * The Class MessageFormatException.
 */
public class MessageFormatException extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * The Enum Error.
     */
    // see "Specific Command Reject" in Wincor NDC or NCR User Guide
    public enum Error {
        /**
         * The Error 00.
         */
        Error00, // no error code
        /**
         * The Error A 01.
         */
        ErrorA01,
        /**
         * The Error A 02.
         */
        ErrorA02,
        /**
         * The Error A 03.
         */
        ErrorA03,
        /**
         * The Error A 04.
         */
        ErrorA04,
        /**
         * The Error A 06.
         */
        ErrorA06,
        /**
         * The Error A 07.
         */
        ErrorA07,
        /**
         * The Error A 08.
         */
        ErrorA08,
        /**
         * The Error A 09.
         */
        ErrorA09,
        /**
         * The Error B 01.
         */
        ErrorB01,
        /**
         * The Error B 02.
         */
        ErrorB02,
        /**
         * The Error B 03.
         */
        ErrorB03,
        /**
         * The Error B 04.
         */
        ErrorB04,
        /**
         * The Error B 06.
         */
        ErrorB06,
        /**
         * The Error B 07.
         */
        ErrorB07,
        /**
         * The Error B 08.
         */
        ErrorB08,
        /**
         * The Error B 09.
         */
        ErrorB09,
        /**
         * The Error B 10.
         */
        ErrorB10,
        /**
         * The Error B 11.
         */
        ErrorB11,
        /**
         * The Error B 12.
         */
        ErrorB12,
        /**
         * The Error B 13.
         */
        ErrorB13,
        /**
         * The Error B 14.
         */
        ErrorB14,
        /**
         * The Error B 15.
         */
        ErrorB15,
        /**
         * The Error B 16.
         */
        ErrorB16,
        /**
         * The Error B 17.
         */
        ErrorB17,
        /**
         * The Error B 18.
         */
        ErrorB18,
        /**
         * The Error B 19.
         */
        ErrorB19,
        /**
         * The Error B 20.
         */
        ErrorB20,
        /**
         * The Error B 21.
         */
        ErrorB21,
        /**
         * The Error B 22.
         */
        ErrorB22,
        /**
         * The Error B 23.
         */
        ErrorB23,
        /**
         * The Error B 24.
         */
        ErrorB24,
        /**
         * The Error B 25.
         */
        ErrorB25,
        /**
         * The Error B 26.
         */
        ErrorB26,
        /**
         * The Error B 27.
         */
        ErrorB27,
        /**
         * The Error B 28.
         */
        ErrorB28,
        /**
         * The Error B 29.
         */
        ErrorB29,
        /**
         * The Error B 33.
         */
        ErrorB33,
        /**
         * The Error B 34.
         */
        ErrorB34,
        /**
         * The Error B 35.
         */
        ErrorB35,
        /**
         * The Error B 91.
         */
        ErrorB91,
        /**
         * The Error B 92.
         */
        ErrorB92,
        /**
         * The Error B 93.
         */
        ErrorB93,
        /**
         * The Error B 94.
         */
        ErrorB94,
        /**
         * The Error B 95.
         */
        ErrorB95,
        /**
         * The Error B 96.
         */
        ErrorB96,
        /**
         * The Error B 97.
         */
        ErrorB97,
        /**
         * The Error B 98.
         */
        ErrorB98,
        /**
         * The Error B 99.
         */
        ErrorB99,
        /**
         * The Error wxx.
         */
        ErrorWxx,
        /**
         * The Error C 01.
         */
        ErrorC01,
        /**
         * The Error C 02.
         */
        ErrorC02,
        /**
         * The Error C 03.
         */
        ErrorC03,
        /**
         * The Error C 04.
         */
        ErrorC04,
        /**
         * The Error C 06.
         */
        ErrorC06,
        /**
         * The Error C 07.
         */
        ErrorC07,
        /**
         * The Error C 08.
         */
        ErrorC08,
        /**
         * The Error C 09.
         */
        ErrorC09,
        /**
         * The Error C 10.
         */
        ErrorC10,
        /**
         * The Error C 11.
         */
        ErrorC11,
        /**
         * The Error C 12.
         */
        ErrorC12,
        /**
         * The Error C 13.
         */
        ErrorC13,
        /**
         * The Error C 14.
         */
        ErrorC14,
        /**
         * The Error C 15.
         */
        ErrorC15,
        /**
         * The Error C 16.
         */
        ErrorC16,
        /**
         * The Error C 17.
         */
        ErrorC17,
        /**
         * The Error C 18.
         */
        ErrorC18,
        /**
         * The Error D 01.
         */
        ErrorD01,
        /**
         * The Error D 02.
         */
        ErrorD02,
        /**
         * The Error D 03.
         */
        ErrorD03,
        /**
         * The Error D 04.
         */
        ErrorD04,
        /**
         * The Error D 06.
         */
        ErrorD06,
        /**
         * The Error D 07.
         */
        ErrorD07,
        /**
         * The Error D 08.
         */
        ErrorD08,
        /**
         * The Error E 01.
         */
        ErrorE01,
        /**
         * The Error E 02.
         */
        ErrorE02,
        /**
         * The Error E 03.
         */
        ErrorE03,
        /**
         * The Error E 04.
         */
        ErrorE04,
        /**
         * The Error E 06.
         */
        ErrorE06
    }

    /**
     * The Enum Reason.
     */
    // see "Reject reason code" in Wincor DDC or Diebold User Guide
    public enum Reason {
        /**
         * The Reason 00.
         */
        Reason00,
        /**
         * The Reason 01.
         */
        // no error code
        Reason01,
        /**
         * The Reason 02.
         */
        Reason02,
        /**
         * The Reason 03.
         */
        Reason03,
        /**
         * The Reason 04.
         */
        Reason04,
        /**
         * The Reason 05.
         */
        Reason05,
        /**
         * The Reason 06.
         */
        Reason06,
        /**
         * The Reason 07.
         */
        Reason07,
        /**
         * The Reason 08.
         */
        Reason08,
        /**
         * The Reason 09.
         */
        Reason09,
        /**
         * The Reason 10.
         */
        Reason10,
        /**
         * The Reason 11.
         */
        Reason11,
        /**
         * The Reason 12.
         */
        Reason12,
        /**
         * The Reason 13.
         */
        Reason13,
        /**
         * The Reason 14.
         */
        Reason14,
        /**
         * The Reason 15.
         */
        Reason15,
        /**
         * The Reason 16.
         */
        Reason16,
        /**
         * The Reason 17.
         */
        Reason17,
        /**
         * The Reason 18.
         */
        Reason18,
        /**
         * The Reason 19.
         */
        Reason19,
        /**
         * The Reason 20.
         */
        Reason20,
        /**
         * The Reason 21.
         */
        Reason21,
        /**
         * The Reason 22.
         */
        Reason22,
        /**
         * The Reason 23.
         */
        Reason23,
        /**
         * The Reason 24.
         */
        Reason24,
        /**
         * The Reason 25.
         */
        Reason25,
        /**
         * The Reason 26.
         */
        Reason26,
        /**
         * The Reason 27.
         */
        Reason27,
        /**
         * The Reason 28.
         */
        Reason28,
        /**
         * The Reason 29.
         */
        Reason29,
        /**
         * The Reason 30.
         */
        Reason30,
        /**
         * The Reason 31.
         */
        Reason31,
        /**
         * The Reason 32.
         */
        Reason32,
        /**
         * The Reason 33.
         */
        Reason33,
        /**
         * The Reason 34.
         */
        Reason34,
        /**
         * The Reason 35.
         */
        Reason35,
        /**
         * The Reason 36.
         */
        Reason36,
        /**
         * The Reason 37.
         */
        Reason37,
        /**
         * The Reason 38.
         */
        Reason38,
        /**
         * The Reason 39.
         */
        Reason39,
        /**
         * The Reason 40.
         */
        Reason40,
        /**
         * The Reason 41.
         */
        Reason41,
        /**
         * The Reason 42.
         */
        Reason42,
        /**
         * The Reason 43.
         */
        Reason43,
        /**
         * The Reason 44.
         */
        Reason44,
        /**
         * The Reason 45.
         */
        Reason45,
        /**
         * The Reason 46.
         */
        Reason46,
        /**
         * The Reason 47.
         */
        Reason47,
        /**
         * The Reason 48.
         */
        Reason48,
        /**
         * The Reason 49.
         */
        Reason49,
        /**
         * The Reason 50.
         */
        Reason50,
        /**
         * The Reason 51.
         */
        Reason51,
        /**
         * The Reason 52.
         */
        Reason52,
        /**
         * The Reason 53.
         */
        Reason53,
        /**
         * The Reason 54.
         */
        Reason54,
        /**
         * The Reason 55.
         */
        Reason55,
        /**
         * The Reason 56.
         */
        Reason56,
        /**
         * The Reason 57.
         */
        Reason57,
        /**
         * The Reason 58.
         */
        Reason58,
        /**
         * The Reason 59.
         */
        Reason59,
        /**
         * The Reason 60.
         */
        Reason60,
        /**
         * The Reason 61.
         */
        Reason61,
        /**
         * The Reason 62.
         */
        Reason62,
        /**
         * The Reason 63.
         */
        Reason63,
        /**
         * The Reason 64.
         */
        Reason64,
        /**
         * The Reason 65.
         */
        Reason65,
        /**
         * The Reason 66.
         */
        Reason66,
        /**
         * The Reason 67.
         */
        Reason67,
        /**
         * The Reason 68.
         */
        Reason68,
        /**
         * The Reason 69.
         */
        Reason69,
        /**
         * The Reason 70.
         */
        Reason70,
        /**
         * The Reason 71.
         */
        Reason71,
        /**
         * The Reason 72.
         */
        Reason72,
        /**
         * The Reason 73.
         */
        Reason73,
        /**
         * The Reason 74.
         */
        Reason74,
        /**
         * The Reason 75.
         */
        Reason75,
        /**
         * The Reason 76.
         */
        Reason76,
        /**
         * The Reason 77.
         */
        Reason77,
        /**
         * The Reason 78.
         */
        Reason78,
        /**
         * The Reason 79.
         */
        Reason79,
        /**
         * The Reason 80.
         */
        Reason80,
        /**
         * The Reason 81.
         */
        Reason81,
        /**
         * The Reason 82.
         */
        Reason82,
        /**
         * The Reason 83.
         */
        Reason83,
        /**
         * The Reason 84.
         */
        Reason84,
        /**
         * The Reason 85.
         */
        Reason85,
        /**
         * The Reason 86.
         */
        Reason86,
        /**
         * The Reason 87.
         */
        Reason87,
        /**
         * The Reason 88.
         */
        Reason88,
        /**
         * The Reason 89.
         */
        Reason89,
        /**
         * The Reason 90.
         */
        Reason90,
        /**
         * The Reason 91.
         */
        Reason91,
        /**
         * The Reason 92.
         */
        Reason92,
        /**
         * The Reason 93.
         */
        Reason93,
        /**
         * The Reason 94.
         */
        Reason94,
        /**
         * The Reason 95.
         */
        Reason95,
        /**
         * The Reason 96.
         */
        Reason96,
        /**
         * The Reason 97.
         */
        Reason97,
        /**
         * The Reason 98.
         */
        Reason98,
        /**
         * The Reason 99.
         */
        Reason99
    }

    /**
     * The error NDC.
     */
    protected Error errorNDC;

    /**
     * The error wn NDC.
     */
    protected Error errorWnNDC;

    /**
     * The reason diebold.
     */
    protected Reason reasonDiebold;

    /**
     * The reason wn DDC.
     */
    protected Reason reasonWnDDC;

    /**
     * Instantiates a new message format exception.
     */
    public MessageFormatException() {
        super();
    }

    /**
     * Instantiates a new message format exception.
     *
     * @param message the message
     */
    public MessageFormatException(String message) {
        super(message);
    }

    /**
     * Instantiates a new message format exception.
     *
     * @param cause the cause
     */
    public MessageFormatException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new message format exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public MessageFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new message format exception.
     *
     * @param message       the message
     * @param errorNDC      the error NDC
     * @param errorWnNDC    the error wn NDC
     * @param reasonDiebold the reason diebold
     * @param reasonWnDDC   the reason wn DDC
     */
    public MessageFormatException(String message, Error errorNDC, Error errorWnNDC, Reason reasonDiebold, Reason reasonWnDDC) {
        super(message);
        this.errorNDC = errorNDC;
        this.errorWnNDC = errorWnNDC;
        this.reasonDiebold = reasonDiebold;
        this.reasonWnDDC = reasonWnDDC;
    }

    /**
     * Instantiates a new message format exception.
     *
     * @param message       the message
     * @param cause         the cause
     * @param errorNDC      the error NDC
     * @param errorWnNDC    the error wn NDC
     * @param reasonDiebold the reason diebold
     * @param reasonWnDDC   the reason wn DDC
     */
    public MessageFormatException(String message, Throwable cause, Error errorNDC, Error errorWnNDC, Reason reasonDiebold, Reason reasonWnDDC) {
        super(message, cause);
        this.errorNDC = errorNDC;
        this.errorWnNDC = errorWnNDC;
        this.reasonDiebold = reasonDiebold;
        this.reasonWnDDC = reasonWnDDC;
    }

    public Error getErrorNDC() {
        return errorNDC;
    }

    public Error getErrorWnNDC() {
        return errorWnNDC;
    }

    public Reason getReasonDiebold() {
        return reasonDiebold;
    }

    public Reason getReasonWnDDC() {
        return reasonWnDDC;
    }
}
