package com.codegym.cms.model;

import javax.persistence.*;

@Entity
@Table(name ="blog")
public class Blogs {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String title;
    private String summary;
    public Blogs(){}

    public Blogs(Long id, String name, String title, String summary) {
        id = id;
        this.name = name;
        this.title = title;
        this.summary = summary;
    }
    @Override
    public String toString(){
        return String.format("Blogs[id=%d,name='%s',title='%s',summary='%s']",id, name, title, summary);
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
