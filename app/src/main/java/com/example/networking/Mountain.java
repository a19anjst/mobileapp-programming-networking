package com.example.networking;

public class Mountain {
    private String name;
    private String location;
    private int height;

    public Mountain(String inName,String inLocation, int inHeight){
        name=inName;
        location=inLocation;
        height=inHeight;
    }

    public Mountain(String inName){
        name=inName;
        location="";
        height=1;
    }
}
