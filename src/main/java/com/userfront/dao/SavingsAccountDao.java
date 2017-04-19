package com.userfront.dao;

import com.userfront.domain.SavingsAccount;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 이민규 on 2017-04-19.
 */
public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber(int accountNumber);

}
