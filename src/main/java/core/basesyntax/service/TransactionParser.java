package core.basesyntax.service;

import core.basesyntax.model.Transaction;
import java.util.List;

public interface TransactionParser {
    List<Transaction> getTransactions(List<String> dataFromFile);
}
