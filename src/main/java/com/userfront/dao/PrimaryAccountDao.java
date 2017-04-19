package com.userfront.dao;

import com.userfront.domain.PrimaryAccount;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 이민규 on 2017-04-19.
 */
public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount, Long> {

    PrimaryAccount findByAccountNumber(int accountNumber);

}
