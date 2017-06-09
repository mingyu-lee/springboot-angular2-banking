package com.userfront;

import com.userfront.dao.UserDao;
import com.userfront.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by 이민규 on 2017-06-07.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserDaoTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserDao userDao;

    @Test
    public void addAndGet() throws Exception {
        User user = new User();

        user.setUsername("test100");
        user.setPassword("1q2w3e4r5t");
        user.setEmail("test100@test.com");

        this.entityManager.persist(user);
        User testUser = this.userDao.findByUsername("test100");

        assertThat(user.getUsername(), is(testUser.getUsername()));
        assertThat(user.getPassword(), is(testUser.getPassword()));
    }

}
