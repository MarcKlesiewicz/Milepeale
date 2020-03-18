package com.example.android.milepeale.model;

import java.util.Observable;

public class Model extends Observable {

    private String data = "Hello World!";

    public String getData(){
        return data; }

    public void setData(String data){
        this.data = data;

        super.setChanged();
        super.notifyObservers();

    }
}
