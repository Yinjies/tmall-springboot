package com.kirb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: TMAll_springboot
 * @description:分类表: 后台管理页面跳转专用控制器
 * 因为是做前后端分离，所以数据是通过 RESTFUL 接口来取的，而在业务上，除了 RESTFUL 服务要提供，还要提供页面跳转服务，
 * 所以所有的后台页面跳转都放在 AdminPageController 这个控制器里。
 * 而 RESTFUL 专门放在 Category 对应的控制器 CategoryController.java 里面。 这样代码更清晰
 * @author: Yin jie
 * @create: 2020-04-08 22:09
 **/
@Controller
public class AdminPageController {
    @GetMapping(value="/admin")
    public String admin(){
        return "redirect:admin_category_list";
    }
    @GetMapping(value="/admin_category_list")
    public String listCategory(){
        return "admin/listCategory";
    }

    /**
     * 增加一个对/admin_category_edit的映射，
     * 然后服务端跳转到 editCategory.html 去
     * @return
     */
    @GetMapping(value="/admin_category_edit")
    public String editCategory(){
        return "admin/editCategory";
    }

    @GetMapping(value="/admin_order_list")
    public String listOrder(){
        return "admin/listOrder";

    }

    @GetMapping(value="/admin_product_list")
    public String listProduct(){
        return "admin/listProduct";

    }

    @GetMapping(value="/admin_product_edit")
    public String editProduct(){
        return "admin/editProduct";

    }
    @GetMapping(value="/admin_productImage_list")
    public String listProductImage(){
        return "admin/listProductImage";

    }

    @GetMapping(value="/admin_property_list")
    public String listProperty(){
        return "admin/listProperty";

    }

    @GetMapping(value="/admin_property_edit")
    public String editProperty(){
        return "admin/editProperty";

    }

    @GetMapping(value="/admin_propertyValue_edit")
    public String editPropertyValue(){
        return "admin/editPropertyValue";

    }

    @GetMapping(value="/admin_user_list")
    public String listUser(){
        return "admin/listUser";

    }

}
