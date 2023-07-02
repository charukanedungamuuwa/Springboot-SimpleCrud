package com.example.simplecrud.Repo;

import com.example.simplecrud.Demo.demo;
import com.example.simplecrud.Service.service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface repo extends JpaRepository<demo, Long> {
    List<demo> findAll();

    service findById(long id);
}
