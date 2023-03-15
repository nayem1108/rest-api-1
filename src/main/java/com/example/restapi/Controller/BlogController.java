package com.example.restapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.Model.Blog;
import com.example.restapi.Service.BookServices;

import java.util.List;
// normal api
// @Controller 

// Rest-API
@RestController
public class BlogController {
    

    // normal api
    // @RequestMapping(value="/normal-blogs", method = RequestMethod.GET)
    // @ResponseBody  

    // rest-api

    // generate auto object
    @Autowired
    private BookServices bookService;

    @GetMapping("/blogs")
    public List<Blog> getBlogs(){
        return this.bookService.getAllBlogs();
        
        // Blog blog = new Blog(1, "Java Guides", "IAHndija woiefjnsid wuie fhsid wuefh sdiufsheu", "nothing");
        // return blogs;
        // return "This is testing blogs";
    }

    @GetMapping("/blogs/{id}")
    public Blog getSingleBook(@PathVariable("id") int id){
        Blog blog = null;
        blog = bookService.getBookByID(id);
        return blog;
    }
}
