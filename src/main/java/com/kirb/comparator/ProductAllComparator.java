package com.kirb.comparator;

import com.kirb.pojo.Product;

import java.util.Comparator;

/**
 * @program: TMAll_springboot
 * @description:综合比较器
 * 把 销量x评价 高的放前面
 * @author: Yin jie
 * @create: 2020-04-11 13:53
 **/
public class ProductAllComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p2.getReviewCount()*p2.getSaleCount()-p1.getReviewCount()*p1.getSaleCount();
    }

}
