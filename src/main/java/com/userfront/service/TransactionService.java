package com.userfront.service;

import com.userfront.domain.*;

import java.security.Principal;
import java.util.List;

/**
 * Created by Mingyu on 2017-04-26.
 */
public interface TransactionService {

    List<PrimaryTransaction> findPrimaryTransactionList(String username);

    List<SavingsTransaction> findSavingsTransactionList(String username);

    void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction);

    void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction);

    void savePrimaryWithdrawTransaction(PrimaryTransaction primaryTransaction);

    void saveSavingsWithdrawTransaction(SavingsTransaction savingsTransaction);

    void betweenAccountsTransfer(String transferFrom, String transferTo, String amount, PrimaryAccount primaryAccount, SavingsAccount savingsAccount) throws Exception;

    Recipient findRecipientByName(String recipientName);

    List<Recipient> findRecipientList(Principal principal);

    void deleteRecipientByName(String recipientName);

    void saveRecipient(Recipient recipient);
}
