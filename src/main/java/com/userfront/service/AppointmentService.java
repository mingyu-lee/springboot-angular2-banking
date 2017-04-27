package com.userfront.service;

import com.userfront.domain.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by 이민규 on 2017-04-27.
 */
public interface AppointmentService {

    Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);

}
