package com.example.simplecrud.Service;

import com.example.simplecrud.Demo.demo;
import com.example.simplecrud.Repo.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service {
    @Autowired
    private static repo repo1;
    public List<demo> listAll() {
        return repo1.findAll();
    }

    public void save(demo std) {
        repo1.save(std);
    }

    public static demo get() {
        long id = 0;
        return repo1.findById(id).get();
    }

    public void delete(long id) {
        repo1.deleteById(id);
    }

}
