package com.example.springbookstore.service;

import com.example.springbookstore.entity.MyBookList;
import com.example.springbookstore.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {
    @Autowired
    private MyBookRepository myBookRepository;

    public void saveMyBooks(MyBookList bookList) {
        myBookRepository.save(bookList);
    }

    public List<MyBookList> getAllMyBooks() {
        return myBookRepository.findAll();
    }

    public void DeleteById(int id) {
        myBookRepository.deleteById(id);
    }
}
