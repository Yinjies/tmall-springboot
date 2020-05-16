package com.kirb.comparator;

import com.kirb.pojo.Product;

import java.util.Comparator;

/**
 * @program: TMAll_springboot
 * @description:销量比较器
 * 把 销量高的放前面
 * @author: Yin jie
 * @create: 2020-04-11 13:54
 **/
public class ProductSaleCountComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p2.getSaleCount()-p1.getSaleCount();
    }

}
