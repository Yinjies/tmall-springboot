package com.kirb.comparator;

import com.kirb.pojo.Product;

import java.util.Comparator;

/**
 * @program: TMAll_springboot
 * @description: 人气比较器
 * 把 评价数量多的放前面
 * @author: Yin jie
 * @create: 2020-04-11 13:54
 **/
public class ProductReviewComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p2.getReviewCount()-p1.getReviewCount();
    }

}
