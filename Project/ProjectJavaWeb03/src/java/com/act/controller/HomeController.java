/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.controller;

import com.act.showcase.model.ProductModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Kieu Anh Tuan
 */
public class HomeController {
    
    @RequestMapping("/")
    public String index(Model model) {
        ProductModel productModel = new ProductModel();
        return "index";
    }
}
