package com.kirb.dao;

import com.kirb.pojo.Order;
import com.kirb.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: TMAll_springboot
 * @description: 订单表 dao层接口
 * @author: Yin jie
 * @create: 2020-04-10 11:42
 **/
public interface OrderDAO extends JpaRepository<Order,Integer> {
    /**
     * 用来获取那些某个用户的订单，但是状态又不是 "delete" 的订单。 "delete" 是作为状态调用的时候传进来的
     * @param user
     * @param status
     * @return
     */
    public List<Order> findByUserAndStatusNotOrderByIdDesc(User user, String status);

}
