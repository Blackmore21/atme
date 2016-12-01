package elab.emulator.atm.transmission.message.wn_ddc;

import elab.emulator.atm.transmission.message.InboundMessage;

// JDoc: Auto-generated Javadoc

/**
 * See APTRA™ Advance NDC & NDC+ manual. This message is also used in Wincor DDC
 * protocol
 *
 * @author Dyakov
 */
public class WnDdc_EMVConfiguration extends InboundMessage {

    /**
     * The Constant EMV_CONFIGURATION_MESSAGE_CLASS.
     */
    private static final char EMV_CONFIGURATION_MESSAGE_CLASS = '8';

    /**
     * The message sub class.
     */
    private char messageSubClass;

    /**
     * The emv configuration data.
     */
    private EMVConfigurationData emvConfigurationData;

    /**
     * The mac data.
     */
    private String macData;

    @Override
    public String toString() {

        return "EMV Configuration Message";
    }

    public static char getEmvConfigurationMessageClass() {
        return EMV_CONFIGURATION_MESSAGE_CLASS;
    }

    public char getMessageSubClass() {
        return messageSubClass;
    }

    public void setMessageSubClass(char messageSubClass) {
        this.messageSubClass = messageSubClass;
    }

    public EMVConfigurationData getEmvConfigurationData() {
        return emvConfigurationData;
    }

    public void setEmvConfigurationData(EMVConfigurationData emvConfigurationData) {
        this.emvConfigurationData = emvConfigurationData;
    }

    public String getMacData() {
        return macData;
    }

    public void setMacData(String macData) {
        this.macData = macData;
    }
}
