package com.userfront.dao;

import com.userfront.domain.SavingsTransaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Mingyu on 2017-04-26.
 */
public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();

}

