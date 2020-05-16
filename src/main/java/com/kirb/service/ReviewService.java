package com.kirb.service;

import com.kirb.dao.ReviewDAO;
import com.kirb.pojo.Product;
import com.kirb.pojo.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: TMAll_springboot
 * @description: 评论表service 层的实现类
 * @author: Yin jie
 * @create: 2020-04-11 12:11
 **/
@Service
@CacheConfig(cacheNames="reviews")
public class ReviewService {

    @Autowired ReviewDAO reviewDAO;
    @Autowired ProductService productService;

    @CacheEvict(allEntries=true)
    public void add(Review review) {
        reviewDAO.save(review);
    }

    @Cacheable(key="'reviews-pid-'+ #p0.id")
    public List<Review> list(Product product){
        List<Review> result =  reviewDAO.findByProductOrderByIdDesc(product);
        return result;
    }

    @Cacheable(key="'reviews-count-pid-'+ #p0.id")
    public int getCount(Product product) {
        return reviewDAO.countByProduct(product);
    }

}
