package com.userfront.service;

import com.userfront.domain.PrimaryTransaction;
import com.userfront.domain.SavingsTransaction;

import java.util.List;

/**
 * Created by Mingyu on 2017-04-26.
 */
public interface TransactionService {

    List<PrimaryTransaction> findPrimaryTransactionList(String username);

    List<SavingsTransaction> findSavingsTransactionList(String username);

    void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction);

    void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction);

}
