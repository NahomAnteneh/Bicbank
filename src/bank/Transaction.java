package bank;

import java.util.UUID;
import java.util.Date;

public class Transaction {
    private String transactionID;
    private int fromAccountNo;
    private int toAccountNo;
    private double amount;
    private String timestamp;
    private String description;

    public Transaction(int fromAccountNo, int toAccountNo, double amount, String description) {
        Date time = new Date();
        transactionID = generateTransactionId();
        this.fromAccountNo = fromAccountNo;
        this.toAccountNo = toAccountNo;
        this.amount = amount;
        this.description = description;
        this.timestamp = time.toString();
    }

    private String generateTransactionId() {
        String prefix = "TXN";
        
        long timestamp = System.currentTimeMillis();
        String randomPart = UUID.randomUUID().toString().substring(0, 2);
        String transactionId = String.format("%s-%d-%s", prefix, timestamp, randomPart);

        return transactionId;
    }

    public String getTransactionId() {
        return transactionID;
    }

    public int getFromAccountNo() {
        return fromAccountNo;
    }

    public int getToAccountNo() {
        return toAccountNo;
    }

    public double getAmount() {
        return amount;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getDescription() {
        return description;
    }
}