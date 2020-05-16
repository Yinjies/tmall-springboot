package com.kirb.dao;

import com.kirb.pojo.Category;
import com.kirb.pojo.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: TMAll_springboot
 * @description: 产品表的dao层
 * @author: Yin jie
 * @create: 2020-04-10 10:03
 **/
public interface ProductDAO extends JpaRepository<Product,Integer> {
    /**
     * 根据分类表查询产品表的数据
     * @param category
     * @param pageable
     * @return
     */
    Page<Product> findByCategory(Category category, Pageable pageable);

    /**
     * 新增一个通过分类查询所有产品的方法，因为这里不需要分页。
     * @param category
     * @return
     */
    List<Product> findByCategoryOrderById(Category category);

    /**
     * 根据名称进行模糊查询的方法
     * @param keyword
     * @param pageable
     * @return
     */
    List<Product> findByNameLike(String keyword, Pageable pageable);

}

