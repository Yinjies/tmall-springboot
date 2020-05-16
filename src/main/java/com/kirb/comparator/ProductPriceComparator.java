package com.kirb.comparator;

import com.kirb.pojo.Product;

import java.util.Comparator;

/**
 * @program: TMAll_springboot
 * @description:价格比较器
 * 把 价格低的放前面
 * @author: Yin jie
 * @create: 2020-04-11 13:54
 **/
public class ProductPriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return (int) (p1.getPromotePrice()-p2.getPromotePrice());
    }

}
