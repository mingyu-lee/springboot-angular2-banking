package com.userfront.dao;

import com.userfront.domain.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 이민규 on 2017-04-27.
 */
public interface AppointmentDao extends CrudRepository<Appointment, Long> {
    List<Appointment> findAll();
}
