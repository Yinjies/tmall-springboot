package com.kirb.dao;

import com.kirb.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: TMAll_springboot
 * @description:分类表:  dao层接口
 * CategoryDAO 类集成了 JpaRepository，就提供了CRUD和分页 的各种常见功能。 这就是采用 JPA 方便的地方~
 * @author: Yin jie
 * @create: 2020-04-08 22:03
 **/
public interface CategoryDAO extends JpaRepository<Category,Integer> {

}
