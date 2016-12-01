package elab.emulator.atm.transmission.message.ddc;

import elab.emulator.atm.transmission.message.InboundMessage;

import java.util.ArrayList;


// JDoc: Auto-generated Javadoc

/**
 * Enhanced Function Command<br><br>
 * <p>
 * <b>Agilis® 3 91x Terminal Programming Manual 2013.pdf (стр. 320)
 * Enhanced Function Command Identifier 7
 *
 * @author Dyakov
 */
public class Ddc_EnhancedFunctionCommand extends InboundMessage {

    /**
     * Enhanced Function Command Identifier 7
     */
    private static final char ENHANCED_FUNCTION_COMMAND = '7';

    /**
     * The message coordination number.
     */
    private char messageCoordinationNumber;

    /**
     * The transaction serial number.
     */
    private int transactionSerialNumber;

    /**
     * The good operation next state.
     */
    private String goodOperationNextState;

    /**
     * The Class UpdateConfiguration.
     */
    public class UpdateConfiguration {

        /**
         * Field ID (Update Configuration ID)
         */
        private String updConfId;

        /**
         * The conf id data.
         */
        private int confIdData;

        public String getUpdConfId() {
            return updConfId;
        }

        public void setUpdConfId(String updConfId) {
            this.updConfId = updConfId;
        }

        public int getConfIdData() {
            return confIdData;
        }

        public void setConfIdData(int confIdData) {
            this.confIdData = confIdData;
        }
    }

    /**
     * The upd conf.
     */
    private UpdateConfiguration updConf;

    /**
     * The Class UpdateSpecialKeys.
     */
    public class UpdateSpecialKeys {

        /**
         * The field IDUSK.
         */
        // Field ID (Update Special Keys)
        private String fieldIDUSK;

        /**
         * The group Y.
         */
        // Group ID (Yes Key ID)
        private String groupY;

        // Yes Key
        // [ Yes Key ]
        /**
         * The yes keys.
         */
        // [ Yes Key ]
        private ArrayList<String> yesKeys;

        /**
         * The group N.
         */
        // Group ID (No Key ID)
        private String groupN;

        // No Key
        // [ No Key ]
        /**
         * The no keys.
         */
        // [ No Key ]
        private ArrayList<String> noKeys;

        /**
         * The group CS.
         */
        // Group ID (Cancel/Stop Key ID)
        private String groupCS;

        // Cancel/Stop Key
        // [ Cancel/Stop Key ]
        /**
         * The c S keys.
         */
        // [ Cancel/Stop Key ]
        private ArrayList<String> cSKeys;

        public String getGroupY() {
            return groupY;
        }

        public void setGroupY(String groupY) {
            this.groupY = groupY;
        }

        public String getGroupN() {
            return groupN;
        }

        public void setGroupN(String groupN) {
            this.groupN = groupN;
        }

        public String getGroupCS() {
            return groupCS;
        }

        public void setGroupCS(String groupCS) {
            this.groupCS = groupCS;
        }

        public String getFieldIDUSK() {
            return fieldIDUSK;
        }

        public void setFieldIDUSK(String fieldIDUSK) {
            this.fieldIDUSK = fieldIDUSK;
        }

        public ArrayList<String> getYesKeys() {

            return yesKeys;
        }

        public void setYesKeys(ArrayList<String> yesKeys) {

            this.yesKeys = yesKeys;
        }

        public ArrayList<String> getNoKeys() {

            return noKeys;
        }

        public void setNoKeys(ArrayList<String> noKeys) {

            this.noKeys = noKeys;
        }

        /**
         * Gets the c S keys.
         *
         * @return the c S keys
         */
        public ArrayList<String> getcSKeys() {

            return cSKeys;
        }

        /**
         * Sets the c S keys.
         *
         * @param cSKeys the new c S keys
         */
        public void setcSKeys(ArrayList<String> cSKeys) {

            this.cSKeys = cSKeys;
        }
    }

    /**
     * The upd spec keys.
     */
    private UpdateSpecialKeys updSpecKeys;

    /**
     * The upd conf tim.
     */
    // Field ID (Update Configured Timers)
    private String updConfTim;

    /**
     * The Class Set1.
     */
    public class Set1 {

        /**
         * The group CT.
         */
        // [ Group ID (Configured Timer Number) ]
        private int groupCT;

        /**
         * The sielent time.
         */
        // [ Silent Time ]
        private int sielentTime;

        /**
         * The beeper rate.
         */
        // [ Beeper Rate ]
        private int beeperRate;

        /**
         * The beeping time.
         */
        // [ Beeping Time ]
        private int beepingTime;

        public int getGroupCT() {
            return groupCT;
        }

        public void setGroupCT(int groupCT) {
            this.groupCT = groupCT;
        }

        public int getSielentTime() {
            return sielentTime;
        }

        public void setSielentTime(int sielentTime) {
            this.sielentTime = sielentTime;
        }

        public int getBeeperRate() {
            return beeperRate;
        }

        public void setBeeperRate(int beeperRate) {
            this.beeperRate = beeperRate;
        }

        public int getBeepingTime() {
            return beepingTime;
        }

        public void setBeepingTime(int beepingTime) {
            this.beepingTime = beepingTime;
        }
    }

    /**
     * The set 1.
     */
    private ArrayList<Set1> set1;

    /**
     * The Class UpdateSpecialScreens.
     */
    public class UpdateSpecialScreens {

        /**
         * The field IDUSS.
         */
        // Field ID (Update Special Screens)
        private String fieldIDUSS;

        /**
         * The group MT.
         */
        // Group ID (More Time Screen)
        private int groupMT;

        /**
         * The screen number 1.
         */
        // Screen Number
        private String screenNumber1;

        /**
         * The silent time.
         */
        private int silentTime;

        /**
         * The beeper rate.
         */
        private int beeperRate;

        /**
         * The beeping time.
         */
        private int beepingTime;

        /**
         * The group LS.
         */
        // Group ID (Off Line Screen)
        private int groupLS;

        /**
         * The screen number 2.
         */
        // Screen Number
        private String screenNumber2;

        /**
         * The group SS.
         */
        // Group ID (Out of Service Screen)
        private int groupSS;

        /**
         * The screen number 3.
         */
        // Screen Number
        private String screenNumber3;

        public String getFieldIDUSS() {
            return fieldIDUSS;
        }

        public void setFieldIDUSS(String fieldIDUSS) {
            this.fieldIDUSS = fieldIDUSS;
        }

        public int getGroupMT() {
            return groupMT;
        }

        public void setGroupMT(int groupMT) {
            this.groupMT = groupMT;
        }

        public String getScreenNumber1() {
            return screenNumber1;
        }

        public void setScreenNumber1(String screenNumber1) {
            this.screenNumber1 = screenNumber1;
        }

        public int getSilentTime() {
            return silentTime;
        }

        public void setSilentTime(int silentTime) {
            this.silentTime = silentTime;
        }

        public int getBeeperRate() {
            return beeperRate;
        }

        public void setBeeperRate(int beeperRate) {
            this.beeperRate = beeperRate;
        }

        public int getBeepingTime() {
            return beepingTime;
        }

        public void setBeepingTime(int beepingTime) {
            this.beepingTime = beepingTime;
        }

        public int getGroupLS() {
            return groupLS;
        }

        public void setGroupLS(int groupLS) {
            this.groupLS = groupLS;
        }

        public String getScreenNumber2() {
            return screenNumber2;
        }

        public void setScreenNumber2(String screenNumber2) {
            this.screenNumber2 = screenNumber2;
        }

        public int getGroupSS() {
            return groupSS;
        }

        public void setGroupSS(int groupSS) {
            this.groupSS = groupSS;
        }

        public String getScreenNumber3() {
            return screenNumber3;
        }

        public void setScreenNumber3(String screenNumber3) {
            this.screenNumber3 = screenNumber3;
        }
    }

    /**
     * The upd spec scr.
     */
    private UpdateSpecialScreens updSpecScr;

    /**
     * The upd states.
     */
    // Field ID (Update States)
    private String updStates;

    /**
     * The Class Set2.
     */
    public class Set2 {

        /**
         * The group SN.
         */
        // Group ID (State Number)
        private String groupSN;

        /**
         * The state data.
         */
        // State Data
        private byte[] stateData;

        public String getGroupSN() {
            return groupSN;
        }

        public void setGroupSN(String groupSN) {
            this.groupSN = groupSN;
        }

        public byte[] getStateData() {

            return stateData;
        }

        public void setStateData(byte[] stateData) {
            this.stateData = stateData;
        }
    }

    /**
     * The set 2.
     */
    private ArrayList<Set2> set2;

    /**
     * The upd scr.
     */
    // Field ID (Update Screens)
    private String updScr;

    /**
     * The Class Set3.
     */
    public class Set3 {

        /**
         * The screen number.
         */
        // Group ID (Screen Number)
        private String screenNumber;

        /**
         * The screen data.
         */
        private byte[] screenData;

        public String getScreenNumber() {
            return screenNumber;
        }

        public void setScreenNumber(String screenNumber) {
            this.screenNumber = screenNumber;
        }

        public byte[] getScreenData() {

            return screenData;
        }

        public void setScreenData(byte[] screenData) {
            this.screenData = screenData;
        }
    }

    /**
     * The set 3.
     */
    private ArrayList<Set3> set3;

    /**
     * The upd form temp.
     */
    // Field ID (Update Format Templates)
    private String updFormTemp;

    /**
     * The Class Set4.
     */
    public class Set4 {

        /**
         * The format template number.
         */
        // Group ID (Format Template Number)
        private int formatTemplateNumber;

        /**
         * The format template data.
         */
        // Format Template Data
        private String formatTemplateData;

        public int getFormatTemplateNumber() {
            return formatTemplateNumber;
        }

        public void setFormatTemplateNumber(int formatTemplateNumber) {
            this.formatTemplateNumber = formatTemplateNumber;
        }

        public String getFormatTemplateData() {
            return formatTemplateData;
        }

        public void setFormatTemplateData(String formatTemplateData) {
            this.formatTemplateData = formatTemplateData;
        }
    }

    /**
     * The set 4.
     */
    private ArrayList<Set4> set4;

    /**
     * The upd FIT.
     */
    // Field ID (Update FIT)
    private String updFIT;

    /**
     * The Class Set5.
     */
    public class Set5 {

        /**
         * The group FITN.
         */
        // Group ID (FIT Number)
        private int groupFITN;

        /**
         * The fit data.
         */
        // FIT Data
        private String fitData;

        public int getGroupFITN() {
            return groupFITN;
        }

        public void setGroupFITN(int groupFITN) {
            this.groupFITN = groupFITN;
        }

        public String getFitData() {
            return fitData;
        }

        public void setFitData(String fitData) {
            this.fitData = fitData;
        }
    }

    /**
     * The set 5.
     */
    private ArrayList<Set5> set5;

    /**
     * The upd buf.
     */
    // Field ID (Update Buffers)
    private String updBuf;

    /**
     * The Class Set6.
     */
    public class Set6 {

        /**
         * The group BID.
         */
        // Group ID (Buffer ID)
        private String groupBID;

        /**
         * The buffer data.
         */
        // Buffer Data
        private byte[] bufferData;

        public String getGroupBID() {
            return groupBID;
        }

        public void setGroupBID(String groupBID) {
            this.groupBID = groupBID;
        }

        public byte[] getBufferData() {

            return bufferData;
        }

        public void setBufferData(byte[] bufferData) {
            this.bufferData = bufferData;
        }
    }

    /**
     * The set 6.
     */
    private ArrayList<Set6> set6;

    /**
     * The perf fun.
     */
    // Field ID (Perform Function)
    private String perfFun;

    /**
     * The Class Set7.
     */
    public class Set7 {

        /**
         * The group DID.
         */
        // Group ID (Device ID)
        private String groupDID;

        /**
         * The function data.
         */
        private byte[] functionData;

        public String getGroupDID() {
            return groupDID;
        }

        public void setGroupDID(String groupDID) {
            this.groupDID = groupDID;
        }

        public byte[] getFunctionData() {

            return functionData;
        }

        public void setFunctionData(byte[] functionData) {
            this.functionData = functionData;
        }
    }

    /**
     * The set 7.
     */
    private ArrayList<Set7> set7;

    /**
     * The mac data.
     */
    // MAC Data
    private byte[] macData;

    /* Переопределение метода toString */
    @Override
    public String toString() {

        return "Enhanced Function Command Message";
    }

    /* Геттеры и Сеттеры для переменных, объявленных выше */
    public char getMessageCoordinationNumber() {
        return messageCoordinationNumber;
    }

    public void setMessageCoordinationNumber(char messageCoordinationNumber) {
        this.messageCoordinationNumber = messageCoordinationNumber;
    }

    public int getTransactionSerialNumber() {
        return transactionSerialNumber;
    }

    public void setTransactionSerialNumber(int transactionSerialNumber) {
        this.transactionSerialNumber = transactionSerialNumber;
    }

    public String getUpdConfTim() {
        return updConfTim;
    }

    public void setUpdConfTim(String updConfTim) {
        this.updConfTim = updConfTim;
    }

    public ArrayList<Set1> getSet1() {

        return set1;
    }

    public void setSet1(ArrayList<Set1> set1) {

        this.set1 = set1;
    }

    public String getUpdStates() {
        return updStates;
    }

    public void setUpdStates(String updStates) {
        this.updStates = updStates;
    }

    public ArrayList<Set2> getSet2() {

        return set2;
    }

    public void setSet2(ArrayList<Set2> set2) {

        this.set2 = set2;
    }

    public String getUpdScr() {
        return updScr;
    }

    public void setUpdScr(String updScr) {
        this.updScr = updScr;
    }

    public ArrayList<Set3> getSet3() {

        return set3;
    }

    public void setSet3(ArrayList<Set3> set3) {

        this.set3 = set3;
    }

    public String getUpdFormTemp() {
        return updFormTemp;
    }

    public void setUpdFormTemp(String updFormTemp) {
        this.updFormTemp = updFormTemp;
    }

    public ArrayList<Set4> getSet4() {

        return set4;
    }

    public void setSet4(ArrayList<Set4> set4) {

        this.set4 = set4;
    }

    public String getUpdFIT() {
        return updFIT;
    }

    public void setUpdFIT(String updFIT) {
        this.updFIT = updFIT;
    }

    public ArrayList<Set5> getSet5() {

        return set5;
    }

    public void setSet5(ArrayList<Set5> set5) {

        this.set5 = set5;
    }

    public String getUpdBuf() {
        return updBuf;
    }

    public void setUpdBuf(String updBuf) {
        this.updBuf = updBuf;
    }

    public ArrayList<Set6> getSet6() {

        return set6;
    }

    public void setSet6(ArrayList<Set6> set6) {

        this.set6 = set6;
    }

    public String getPerfFun() {
        return perfFun;
    }

    public void setPerfFun(String perfFun) {
        this.perfFun = perfFun;
    }

    public ArrayList<Set7> getSet7() {

        return set7;
    }

    public void setSet7(ArrayList<Set7> set7) {

        this.set7 = set7;
    }

    public UpdateConfiguration getUpdConf() {
        return updConf;
    }

    public void setUpdConf(UpdateConfiguration updConf) {
        this.updConf = updConf;
    }

    public UpdateSpecialKeys getUpdSpecKeys() {
        return updSpecKeys;
    }

    public void setUpdSpecKeys(UpdateSpecialKeys updSpecKeys) {
        this.updSpecKeys = updSpecKeys;
    }

    public UpdateSpecialScreens getUpdSpecScr() {
        return updSpecScr;
    }

    public void setUpdSpecScr(UpdateSpecialScreens updSpecScr) {
        this.updSpecScr = updSpecScr;
    }

    public byte[] getMacData() {

        return macData;
    }

    public void setMacData(byte[] macData) {
        this.macData = macData;
    }

    public static char getEnhancedFunctionCommand() {
        return ENHANCED_FUNCTION_COMMAND;
    }

    public String getGoodOperationNextState() {
        return goodOperationNextState;
    }

    public void setGoodOperationNextState(String goodOperationNextState) {
        this.goodOperationNextState = goodOperationNextState;
    }
}
