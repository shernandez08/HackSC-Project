package com.example.myapplication;

public class Envelope {

    private String name = "";
    private Double current_amount = 0.0;
    private Double goal = 0.0;
    private String image = "";
    private Integer percentage = 0;

    public Envelope(){
        goal = 0.0;
        name = "";
        current_amount = 0.0;
        percentage = 0;
        image = "";
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setCurrentAmount(Double c){
        current_amount = c;
    }

    public Double getCurrentAmount(){
        return current_amount;
    }

    public int setPercentage(Integer p){

        // returns 0 if the percentage is invalid, meaning the percentage has not been changed
        // returns 1 if the percentage has changed successfully

        if(p > 100 || p < 0){
            return -1;
        }
        else{
            percentage = p;
            return 1;
        }
    }

    public Integer getPercentage(){
        return percentage;
    }

    public void addAmount (Double a){
        current_amount += a;
    }

    public int subtractAmount (Double a){

        //returns -1 if unsuccessful, 1 if successful

        if (current_amount < a){
            return -1;
        }
        else{
            current_amount -= a;
            return 1;
        }
    }

    public void setGoal(Double g){
        goal = g;
    }

    public void allocateIncome (Double income){
        Double for_env = income * (percentage/100);
        for_env = Math.round(for_env * 100.0) / 100.0;
        current_amount += for_env;
    }

    public void setIcon (String iconname){
        image = iconname;
    }
}
