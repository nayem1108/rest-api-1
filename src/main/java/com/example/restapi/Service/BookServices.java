package com.example.restapi.Service;

import java.util.*;

import org.springframework.stereotype.Component;

import com.example.restapi.Model.Blog;


@Component
public class BookServices {
    private static List<Blog> blogs = new ArrayList<>();

    static{
        blogs.add(new Blog(1, "ABC", "ashdnkaj aksdjhnajls", "fui"));
        blogs.add(new Blog(2, "AKJKABC", "oigfjfdk aksdjhnajls", "fui"));
        blogs.add(new Blog(3, "doismdf", "dspofkop aksdjhnajls", "fui"));
        blogs.add(new Blog(4, "ewims", "dsfjnsk aksdjhnajls", "fui"));
        blogs.add(new Blog(5, "dkfskd", "drpefldk[s] aksdjhnajls", "fui"));
    }

    public List<Blog> getAllBlogs(){
        return blogs;
    }

    public Blog getBookByID(int id){
        Blog blog = null;
        blog = blogs.stream().filter(e->e.getId() == id).findFirst().get();
        return blog;

    }
}
