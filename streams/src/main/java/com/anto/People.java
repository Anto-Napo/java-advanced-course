package com.anto;

public class People {
    private String name;
    private int billions;

    public People(String name, int billions) {
        setName(name);
        setBillions(billions);
    }

    void setName(String name){
        this.name = name;
    }
    String getName() {
        return this.name;
    }

    void setBillions(int billions) {
        this.billions = billions;
    }
    int getBillions() {
        return this.billions;
    }
}
