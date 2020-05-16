package com.kirb.dao;

import com.kirb.pojo.Product;
import com.kirb.pojo.Property;
import com.kirb.pojo.PropertyValue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: TMAll_springboot
 * @description: 属性值表  dao层接口  属性值表 service层 的实现类
 * @author: Yin jie
 * @create: 2020-04-10 10:56
 **/
public interface PropertyValueDAO extends JpaRepository<PropertyValue,Integer> {
    /**
     * 提供根据产品查询：
      * @param product
     * @return
     */
    List<PropertyValue> findByProductOrderByIdDesc(Product product);

    /**
     * 根据产品和属性获取PropertyValue对象
     * @param property
     * @param product
     * @return
     */
    PropertyValue getByPropertyAndProduct(Property property, Product product);
}
