package com.kirb.dao;

import com.kirb.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: TMAll_springboot
 * @description: 用户表 dao 层接口
 * @author: Yin jie
 * @create: 2020-04-10 11:30
 **/
public interface UserDAO extends JpaRepository<User,Integer> {
    /**
     * findByName(String name)方法
     * @param name
     * @return
     */
    User findByName(String name);

    /**
     * get(String name, String password)方法
     * @param name
     * @param password
     * @return
     */
    User getByNameAndPassword(String name, String password);
}
