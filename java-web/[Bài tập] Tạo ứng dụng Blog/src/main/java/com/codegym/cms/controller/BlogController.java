package com.codegym.cms.controller;

import com.codegym.cms.model.Blogs;
import com.codegym.cms.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/blog")
    public ModelAndView listBlog(){
        System.out.println("oke");
        List<Blogs> blogs = blogService.findAll();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }
    @GetMapping("/create-blog")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("blog", new Blogs());
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public ModelAndView saveCustomer(@ModelAttribute("blog") Blogs blogs){
        blogService.save(blogs);
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("blog", new Blogs());
        modelAndView.addObject("message", "New blog created successfully");
        return modelAndView;
    }
    @GetMapping("/edit-blog/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Blogs blogs = blogService.findById(id);
        if(blogs != null) {
            ModelAndView modelAndView = new ModelAndView("edit");
            modelAndView.addObject("blog", blogs);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("error404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-customer")
    public ModelAndView updateCustomer(@ModelAttribute("blog") Blogs blogs){
        blogService.save(blogs);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("blog", blogs);
        modelAndView.addObject("message", "Customer updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-blog/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Blogs blogs = blogService.findById(id);
        if(blogs != null) {
            ModelAndView modelAndView = new ModelAndView("delete");
            modelAndView.addObject("blog", blogs);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("error404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-blog")
    public String deleteCustomer(@ModelAttribute("blog") Blogs blogs){
        blogService.remove(blogs.getId());
        return "redirect:blog";
    }
}
