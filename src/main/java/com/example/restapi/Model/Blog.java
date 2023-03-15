package com.example.restapi.Model;

// import lombok.Data;




// using lombok & no need to create any pojos or getters and setters 
// lombok do it for developers. just use @Data annotation from lombok
// @Data
// public class Blog {
//     private int id;
//     private String title;
//     private String description;
//     private String image;
// }



// using pojo or normal getters and setters
public class Blog {
    private int id;
    private String title;
    private String description;
    private String image;

    public Blog() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public Blog(int id, String title, String description, String image) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
    }
    public Blog(String title, String description, String image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }


}


