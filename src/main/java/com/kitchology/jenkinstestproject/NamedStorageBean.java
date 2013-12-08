package com.kitchology.jenkinstestproject;


import javax.ejb.Singleton;

/**
* Singleton session bean used to store the name parameter for "/helloWorld"
* resource
*
* @author mkuchtiak
*/
@Singleton
public class NamedStorageBean {

    // name field
    private String name = "NetBeans, Hudson, Maven, and WLS";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}