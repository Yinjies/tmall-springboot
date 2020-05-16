package com.kirb.dao;

import com.kirb.pojo.Product;
import com.kirb.pojo.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: TMAll_springboot
 * @description: 产品图片表的 dao 层接口
 * @author: Yin jie
 * @create: 2020-04-10 10:28
 **/
public interface ProductImageDAO  extends JpaRepository<ProductImage,Integer> {
    /**
     * 通过产品表查询产品图片表
     * @param product
     * @param type
     * @return
     */
    public List<ProductImage> findByProductAndTypeOrderByIdDesc(Product product, String type);

}
