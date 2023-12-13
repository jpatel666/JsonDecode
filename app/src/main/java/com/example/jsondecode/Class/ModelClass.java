package com.example.jsondecode.Class;

public class ModelClass {

    String value1;
    String onclick1;

    public ModelClass(String value1, String onclick1) {    //Fn+Alt+Insert...Select Constructor...Ctrl+A...Enter(Okay)
        this.value1 = value1;
        this.onclick1 = onclick1;
    }

    public String getValue1() {  //Fn+Alt+Insert... Select Getter and Setter...Ctrl+A...Enter(Okay)
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getOnclick1() {
        return onclick1;
    }

    public void setOnclick1(String onclick1) {
        this.onclick1 = onclick1;
    }

    @Override
    public String toString() {  //ArrayList...//Fn+Alt+Insert...Select toString()...Ctrl+A...Enter(Okay)
        return "ModelClass{" +
                "value1='" + value1 + '\'' +
                ", onclick1='" + onclick1 + '\'' +
                '}';
    }
}
