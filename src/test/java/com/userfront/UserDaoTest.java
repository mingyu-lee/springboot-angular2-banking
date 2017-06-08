package com.userfront;

import com.userfront.dao.UserDao;
import com.userfront.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by 이민규 on 2017-06-07.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    UserDao userDao;

    @Test
    public void addAndGet() throws Exception {
        User testUser = new User();
        UserDao testDao = userDao;

        testUser.setUsername("test2");
        testUser.setPassword("11114445");
        testUser.setEmail("test2@tset.com");

        testDao.save(testUser);

        User user2 = testDao.findByUsername("test");

        assertThat(user2.getUsername(), is(testUser.getUsername()));
        assertThat(user2.getPassword(), is(testUser.getPassword()));
    }

}
