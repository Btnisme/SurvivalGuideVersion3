package com.example.vulan.survivalguideversion3.entity;

/**
 * Created by VULAN on 10/1/2015.
 */
public class ListTopic {
    private String listName;


    public ListTopic(String listName){
       this.setListName(listName);

    }
    public ListTopic(){


    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }
}
