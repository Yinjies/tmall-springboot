package com.kirb.dao;

import com.kirb.pojo.Order;
import com.kirb.pojo.OrderItem;
import com.kirb.pojo.Product;
import com.kirb.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: TMAll_springboot
 * @description: 订单项表的 dao层接口
 * @author: Yin jie
 * @create: 2020-04-10 11:41
 **/
public interface OrderItemDAO extends JpaRepository<OrderItem,Integer> {
    /**
     *
     * @param order
     * @return
     */
    List<OrderItem> findByOrderOrderByIdDesc(Order order);

    /**
     * 根据产品获取OrderItem的方法
     * @param product
     * @return
     */
    List<OrderItem> findByProduct(Product product);

    /**
     * 按用户查找并且订单为空
     * @param user
     * @return
     */
    List<OrderItem> findByUserAndOrderIsNull(User user);
}
