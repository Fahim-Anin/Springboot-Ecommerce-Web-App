package com.example.deshdeal.controller;

import com.example.deshdeal.global.GlobalData;
import com.example.deshdeal.service.CategoryService;
import com.example.deshdeal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;

    @GetMapping({"/", "/home"})
    public String home(Model model){
        model.addAttribute("cart", GlobalData.cart);
        return "index";
    }

    @GetMapping("/shop")
    public String shopByCategory(Model model){
        model.addAttribute("categories", categoryService.getAllCategory());
        model.addAttribute("products", productService.getAllProduct());
        model.addAttribute("cart", GlobalData.cart);
        return "shop";
    }

    @GetMapping("/shop/category/{id}")
    public String shop(Model model, @PathVariable int id){
        model.addAttribute("categories", categoryService.getAllCategory());
        model.addAttribute("products", productService.getAllProductsByCategoryId(id));
        model.addAttribute("cart", GlobalData.cart);

        return "shop";
    }

    @GetMapping("/shop/viewproduct/{id}")
    public String viewProduct(Model model, @PathVariable long id){
        model.addAttribute("product", productService.getProductById(id).get());
        model.addAttribute("cart", GlobalData.cart);

        return "viewProduct";
    }

}
