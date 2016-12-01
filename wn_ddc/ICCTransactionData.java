package elab.emulator.atm.transmission.message.wn_ddc;

import java.util.ArrayList;


// JDoc: Auto-generated Javadoc

/**
 * The Class ICCTransactionData.
 */
public class ICCTransactionData extends EMVConfigurationData {

    private String numberOfTransactionTypeMappingEntries;

    public class Transaction {

        private String transactionType;

        private String dataObjects;

        public String getTransactionType() {
            return transactionType;
        }

        public void setTransactionType(String transactionType) {
            this.transactionType = transactionType;
        }

        public String getDataObjects() {
            return dataObjects;
        }

        public void setDataObjects(String dataObjects) {
            this.dataObjects = dataObjects;
        }
    }

    private ArrayList<Transaction> transactions;

    public String getNumberOfTransactionTypeMappingEntries() {

        return numberOfTransactionTypeMappingEntries;
    }

    public void setNumberOfTransactionTypeMappingEntries(String numberOfTransactionTypeMappingEntries) {

        this.numberOfTransactionTypeMappingEntries = numberOfTransactionTypeMappingEntries;
    }

    public ArrayList<Transaction> getTransactions() {

        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {

        this.transactions = transactions;
    }
}
