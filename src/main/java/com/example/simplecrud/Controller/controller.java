package com.example.simplecrud.Controller;

import org.springframework.ui.Model;
import com.example.simplecrud.Demo.demo;
import com.example.simplecrud.Service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class controller {
    @Autowired
    private service service1;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<demo> listdemo = service1.listAll();
        model.addAttribute("listdemo", listdemo);
        System.out.print("Get / ");
        return "index";
    }

    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("demo", new demo());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("demo") demo std) {
        service1.save(std);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        demo std = service.get();
        mav.addObject("student", std);
        return mav;

    }
    @RequestMapping("/delete/{id}")
    public String deletestudent(@PathVariable(name = "id") int id) {
        service1.delete(id);
        return "redirect:/";
    }
}
