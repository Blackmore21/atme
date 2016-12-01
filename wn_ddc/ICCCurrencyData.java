/*
 *
 */
package elab.emulator.atm.transmission.message.wn_ddc;

import java.util.ArrayList;


// JDoc: Auto-generated Javadoc

/**
 * ICC Currency Data Objects.
 *
 * @author Dyakov
 */
public class ICCCurrencyData extends EMVConfigurationData {

    /**
     * The number of currency type mapping entries.
     */
    private String numberOfCurrencyTypeMappingEntries;

    /**
     * The Class Currency.
     */
    public class Currency {

        /**
         * The currency type.
         */
        private String currencyType;

        /**
         * The data objects.
         */
        private String dataObjects;

        public String getCurrencyType() {
            return currencyType;
        }

        public void setCurrencyType(String currencyType) {
            this.currencyType = currencyType;
        }

        public String getDataObjects() {
            return dataObjects;
        }

        public void setDataObjects(String dataObjects) {
            this.dataObjects = dataObjects;
        }
    }

    /**
     * The currencies.
     */
    private ArrayList<Currency> currencies;

    public String getNumberOfCurrencyTypeMappingEntries() {
        return numberOfCurrencyTypeMappingEntries;
    }

    public void setNumberOfCurrencyTypeMappingEntries(String numberOfCurrencyTypeMappingEntries) {
        this.numberOfCurrencyTypeMappingEntries = numberOfCurrencyTypeMappingEntries;
    }

    public ArrayList<Currency> getCurrencies() {

        return currencies;
    }

    public void setCurrencies(ArrayList<Currency> currencies) {

        this.currencies = currencies;
    }
}
