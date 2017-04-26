package com.userfront.dao;

import com.userfront.domain.Recipient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by 이민규 on 2017-04-26.
 */
public interface RecipientDao extends CrudRepository<Recipient, Long> {

    List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);

}
