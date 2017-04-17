package com.userfront.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by 이민규 on 2017-04-17.
 */
@Entity
public class SavingsAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int accountNumber;
    private BigDecimal accountBalacne;

    @OneToMany(mappedBy = "savingsAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<SavingsTransaction> pSavingsTransactionList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalacne() {
        return accountBalacne;
    }

    public void setAccountBalacne(BigDecimal accountBalacne) {
        this.accountBalacne = accountBalacne;
    }

    public List<SavingsTransaction> getpSavingsTransactionList() {
        return pSavingsTransactionList;
    }

    public void setpSavingsTransactionList(List<SavingsTransaction> pSavingsTransactionList) {
        this.pSavingsTransactionList = pSavingsTransactionList;
    }
}
