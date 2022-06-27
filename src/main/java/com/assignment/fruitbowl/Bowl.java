package com.assignment.fruitbowl;

import java.util.*;

public class Bowl {
    private List<Fruits> fruits;

    private Set<String> colouredFruits;

    public Bowl(){
        this.fruits=new ArrayList<>();
        this.colouredFruits=new HashSet<>();
    }

    //Adding fruits to bowl
    public void addFruitsToBowl(Fruits... fruit){
        for (Fruits eachFruit:fruit) {
            fruits.add(eachFruit);
        }
    }

    //get all different coloured fruits count
    public int getAllColouredFruits(List<Fruits> allFruits){
        for (Fruits singleFruit:allFruits) {
            this.colouredFruits.add(singleFruit.getColour());
        }
        return colouredFruits.size();
    }


    public Set<String> getColouredFruits() {
        return colouredFruits;
    }

    public String getFruitsBasedOnName(Fruits singleFruit){
        return singleFruit.getName();
    }

    public String getFruitsBasedOnColour(Fruits singleFruit){
        return singleFruit.getColour();
    }

    public String getFruitsBasedOnTasteType(Fruits singleFruit){
        return singleFruit.getTasteType();
    }

    public String getFruitsBasedOnSize(Fruits singlefruit){
        return singlefruit.getSize();
    }


}

