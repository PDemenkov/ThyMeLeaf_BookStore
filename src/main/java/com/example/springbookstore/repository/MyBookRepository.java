package com.example.springbookstore.repository;

import com.example.springbookstore.entity.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBookRepository extends JpaRepository <MyBookList,Integer> {
}
