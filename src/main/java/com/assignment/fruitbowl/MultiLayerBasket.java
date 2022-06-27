package com.assignment.fruitbowl;

import com.beust.ah.A;

import java.util.ArrayList;
import java.util.List;

public class MultiLayerBasket {

    private List<Fruits> bowls;

     MultiLayerBasket(){
        this.bowls=bowls;
    }

    public MultiLayerBasket(int bowlsNo){
        this.bowls=new ArrayList<>(bowlsNo);
    }

    public int getNoOfMultiBowls(){
        return bowls.size();
    }

    //adding fruit to Bowl based on Name
    public void addFruitsBasedOnName(Fruits fruit){
         bowls.add(fruit);
    }

    public void addFruitsBasedOnTasteType(Fruits fruit){
         bowls.add(fruit);
    }

    public void addFruitsBasedOnColour(Fruits fruit){
         bowls.add(fruit);
    }

    public void addFruitsBasedOnSize(Fruits fruit){
         bowls.add(fruit);
    }

    @Override
    public String toString(){
        return "sizeOfBowls="+this.bowls.size();
    }

}
