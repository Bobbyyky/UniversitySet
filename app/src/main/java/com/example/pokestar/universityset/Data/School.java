package com.example.pokestar.universityset.Data;

/**
 * Created by Shinelon on 2018/6/7.
 */

public class School {
    private String title;
    private String content;
    private int imageId;

    public School(String title,String content,int imageId){
        this.title = title;
        this.content = content;
        this.imageId = imageId;
    }

    public String getTitle(){
        return title;
    }

    public String getContent(){
        return content;
    }

    public int getImageId(){
        return imageId;
    }
}

