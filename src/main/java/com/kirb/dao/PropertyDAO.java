package com.kirb.dao;

import com.kirb.pojo.Category;
import com.kirb.pojo.Property;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: TMAll_springboot
 * @description: 属性表  dao层接口
 * @author: Yin jie
 * @create: 2020-04-10 09:10
 **/
public interface PropertyDAO extends JpaRepository<Property,Integer> {
    /**
     * 根据分类表查询属性表的数据:
     * @param category
     * @param pageable
     * @return
     */
    Page<Property> findByCategory(Category category, Pageable pageable);

    /**
     * 增加通过分类获取所有属性集合的方法
     * @param category
     * @return
     */
    List<Property> findByCategory(Category category);

}
