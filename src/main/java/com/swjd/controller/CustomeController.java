package com.swjd.controller;

import com.swjd.bean.Customer;
import com.swjd.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/customeController")
public class CustomeController {
    @Autowired
    CustomerService customerService;

    //要能够跳转到主页面，并且带数据
    @RequestMapping("/toMain")
    public String toMain(Model model){
        //准备数据
        List<Customer> list=new ArrayList<>();
        list=customerService.getList();
        model.addAttribute("list",list);
        Customer customer=new Customer();
        model.addAttribute("customer",customer);
        return "main";
    }
}
