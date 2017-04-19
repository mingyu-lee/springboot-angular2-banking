package com.userfront.dao;

import com.userfront.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 이민규 on 2017-04-19.
 */
public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
