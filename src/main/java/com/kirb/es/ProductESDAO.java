package com.kirb.es;

import com.kirb.pojo.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @program: tmall_springboot
 * @description:
 * @author: Yin jie
 * @create: 2020-04-20 20:37
 **/
public interface ProductESDAO extends ElasticsearchRepository<Product,Integer> {

}
