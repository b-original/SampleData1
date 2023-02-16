package com.springLearning.bean;

public class Engine {

    private String engineModel;

    public Engine(){
        System.out.println("Inside default constructor for Engine.");
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public String getEngineModel() {
        return engineModel;
    }
}
