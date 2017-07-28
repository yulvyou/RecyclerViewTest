package com.example.recyclerviewtest.bean;

/**
 * Created by Administrator on 2017/7/27 0027.
 */

public class FruitBean {
    
    private String name;
    
    private int imageId;
    
    public FruitBean(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }
    
    public String getName() {
        return name;
    }
    
    public int getImageId() {
        return imageId;
    }
}
