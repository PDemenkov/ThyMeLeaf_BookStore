package com.example.springbookstore.controller;

import com.example.springbookstore.service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyBookListController {
    @Autowired
    private MyBookListService myBookListService;

    @RequestMapping("/delete/{id}")
    public String deleteMyList(@PathVariable("id") int id) {
        myBookListService.DeleteById(id);
        return "redirect:/my_books";
    }
}
