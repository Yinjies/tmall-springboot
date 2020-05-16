package com.kirb.dao;

import com.kirb.pojo.Product;
import com.kirb.pojo.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: TMAll_springboot
 * @description: 评论表的  dao层接口
 * @author: Yin jie
 * @create: 2020-04-11 12:10
 **/
public interface ReviewDAO extends JpaRepository<Review,Integer> {

    List<Review> findByProductOrderByIdDesc(Product product);
    int countByProduct(Product product);

}
