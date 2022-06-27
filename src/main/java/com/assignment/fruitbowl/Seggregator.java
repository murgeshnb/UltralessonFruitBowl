package com.assignment.fruitbowl;

import java.util.List;
import java.util.Set;

public class Seggregator {
    List<Fruits> noOfFruits;
    Bowl mixedFruitsBowl;
    MultiLayerBasket multiBasket;
    public Seggregator(List<Fruits> noOfFruits,Bowl mixedFruitsBowl,MultiLayerBasket multiBasket){
        this.mixedFruitsBowl=mixedFruitsBowl;
        this.noOfFruits=noOfFruits;
        this.multiBasket=multiBasket;
    }

    public void seggregatingFruitsBasedOnName(List<Fruits> noOfFruits, String receivedFruit){
        for (Fruits individualFruit:noOfFruits) {
            if(individualFruit.getName().equalsIgnoreCase(receivedFruit)){
                String fruitname = mixedFruitsBowl.getFruitsBasedOnName(individualFruit);
                System.out.println(fruitname);
                System.out.println();

                //adding seggregated fruit to multiLayerBasket
                multiBasket.addFruitsBasedOnName(individualFruit);
                break;
            }
        }
    }

    public void seggregatingFruitsBasedOnColour(List<Fruits> noOfFruits,String inputColour){
        for (Fruits individualFruit:noOfFruits) {
            if(individualFruit.getColour().equalsIgnoreCase(inputColour)){
                String fruitColour = mixedFruitsBowl.getFruitsBasedOnColour(individualFruit);

                System.out.println(fruitColour);
                System.out.println();

                //adding friuts to multibasket
                multiBasket.addFruitsBasedOnColour(individualFruit);
                break;
            }
        }
    }

        public void seggregatingFruitsBasedOnTasteType(List<Fruits> noOfFruits,String tasteType){
        for (Fruits individualFruit:noOfFruits) {
                if(individualFruit.getTasteType().equalsIgnoreCase(tasteType)){
                    String tastyFruits = mixedFruitsBowl.getFruitsBasedOnTasteType(individualFruit);

                    System.out.println(tasteType);
                    System.out.println();

                    //adding fruits based on tasteType
                    multiBasket.addFruitsBasedOnTasteType(individualFruit);
                    break;
            }
        }
    }

    public void seggregatingFruitsBasedOnSize(List<Fruits> noOfFruits,String receivedSize){
        for (Fruits individualFruit:noOfFruits) {
            if(individualFruit.getSize().equalsIgnoreCase(receivedSize)){
                String sizeFruits = mixedFruitsBowl.getFruitsBasedOnSize(individualFruit);

                System.out.println(sizeFruits);
                System.out.println();

                //adding fruits based on size
                multiBasket.addFruitsBasedOnSize(individualFruit);
                break;
            }
        }
    }
}
