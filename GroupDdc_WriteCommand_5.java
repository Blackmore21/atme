/*
 *
 */
package elab.emulator.atm.transmission.message;

import elab.emulator.atm.core.Protocol;

// JDoc: Auto-generated Javadoc

/**
 * The Class WriteCommand5Message.
 *
 * @author Dyakov
 */
public class GroupDdc_WriteCommand_5 extends GroupDdc_WriteCommandMessage {

    /**
     * The display flag.
     */
    private char displayFlag;

    /**
     * The format template.
     */
    private String formatTemplate;

    /**
     * The options.
     */
    private String options;

    /**
     * The active keys.
     */
    private String activeKeys;

    /**
     * The screen timer.
     */
    private int screenTimer;

    /**
     * The screen data.
     */
    private String screenData;


    @Override
    public String toString() {

        return Protocol.getProtocolName(Protocol.getProtocol()) + " Write Command 5 Message";
    }

    // ************************************** GETTERS AND SETTERS**************************************
    public char getDisplayFlag() {
        return displayFlag;
    }

    public void setDisplayFlag(char displayFlag) {
        this.displayFlag = displayFlag;
    }

    public String getFormatTemplate() {
        return formatTemplate;
    }

    public void setFormatTemplate(String formatTemplate) {
        this.formatTemplate = formatTemplate;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getActiveKeys() {
        return activeKeys;
    }

    public void setActiveKeys(String activeKeys) {
        this.activeKeys = activeKeys;
    }

    public int getScreenTimer() {
        return screenTimer;
    }

    public void setScreenTimer(int screenTimer) {
        this.screenTimer = screenTimer;
    }

    public String getScreenData() {
        return screenData;
    }

    public void setScreenData(String screenData) {
        this.screenData = screenData;
    }
}
