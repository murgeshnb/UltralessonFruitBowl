package com.assignment.fruitbowl;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class FruitsTest {

    @Test
    public void getAllfruitsByName(){
        Fruits apple = new Fruits("yellow", "apple", "medium", "sweet");
        Fruits grapes = new Fruits("green", "grapes", "small", "tart");
        Fruits pomogranate = new Fruits("red", "pomogranate", "medium", "sweet");
        Fruits banana = new Fruits("yellow", "banana", "medium", "tart");

        List<Fruits> noOfFruits = Arrays.asList(apple, grapes, pomogranate, banana);

        //Adding all fruits to Bowl
        Bowl mixedFruitsBowl = new Bowl();
        mixedFruitsBowl.addFruitsToBowl(apple,grapes,pomogranate,banana);

        MultiLayerBasket multibasket = new MultiLayerBasket(noOfFruits.size());

       /*
       Seggregating and adding fruits based on NAME
        */
        Seggregator segreegation = new Seggregator(noOfFruits, mixedFruitsBowl,multibasket);
        segreegation.seggregatingFruitsBasedOnName(noOfFruits,"apple");
        segreegation.seggregatingFruitsBasedOnName(noOfFruits,"pomogranate");
        segreegation.seggregatingFruitsBasedOnName(noOfFruits,"grapes");
        segreegation.seggregatingFruitsBasedOnName(noOfFruits,"banana");

        Assert.assertEquals(noOfFruits.size(),multibasket.getNoOfMultiBowls());
    }

    @Test
    public void getAllFruitsByColour(){
        Fruits apple = new Fruits("yellow", "apple", "medium", "sweet");
        Fruits grapes = new Fruits("green", "grapes", "small", "tart");
        Fruits pomogranate = new Fruits("red", "pomogranate", "medium", "sweet");
        Fruits banana = new Fruits("yellow", "banana", "medium", "tart");

        List<Fruits> noOfFruits = Arrays.asList(apple, grapes, pomogranate, banana);

        //adding Mixedfruits to bowl
        Bowl mixedFruitsBowl = new Bowl();
        mixedFruitsBowl.addFruitsToBowl(apple,grapes,pomogranate,banana);

        MultiLayerBasket multibasket = new MultiLayerBasket(mixedFruitsBowl.getAllColouredFruits(noOfFruits));
      /*
        Seggregating and adding fruits based on Colour
       */
        Seggregator seggregation = new Seggregator(noOfFruits, mixedFruitsBowl, multibasket);
        seggregation.seggregatingFruitsBasedOnColour(noOfFruits, apple.getColour());
        seggregation.seggregatingFruitsBasedOnColour(noOfFruits, banana.getColour());
        seggregation.seggregatingFruitsBasedOnColour(noOfFruits, pomogranate.getColour());
        seggregation.seggregatingFruitsBasedOnColour(noOfFruits, grapes.getColour());

        Assert.assertEquals(noOfFruits.size(),multibasket.getNoOfMultiBowls());
    }

    @Test
    public void getAllFruitsByTaseteType(){
        Fruits apple = new Fruits("yellow", "apple", "medium", "sweet");
        Fruits grapes = new Fruits("green", "grapes", "small", "tart");
        Fruits pomogranate = new Fruits("red", "pomogranate", "medium", "sweet");
        Fruits banana = new Fruits("yellow", "banana", "medium", "tart");

        List<Fruits> noOfFruits = Arrays.asList(apple, grapes, pomogranate, banana);

        //adding Mixedfruits to bowl
        Bowl mixedFruitsBowl = new Bowl();
        mixedFruitsBowl.addFruitsToBowl(apple,grapes,pomogranate,banana);

        MultiLayerBasket multibasket = new MultiLayerBasket(noOfFruits.size());

        /*
        Seggregating and adding fruits based on tasteType
         */
        Seggregator seggregation = new Seggregator(noOfFruits, mixedFruitsBowl, multibasket);
        seggregation.seggregatingFruitsBasedOnTasteType(noOfFruits, apple.getTasteType());
        seggregation.seggregatingFruitsBasedOnTasteType(noOfFruits, banana.getTasteType());
        seggregation.seggregatingFruitsBasedOnTasteType(noOfFruits, grapes.getTasteType());
        seggregation.seggregatingFruitsBasedOnTasteType(noOfFruits, pomogranate.getTasteType());

        Assert.assertEquals(noOfFruits.size(),multibasket.getNoOfMultiBowls());
    }

    @Test
    public void getAllFruitsBySize(){
        Fruits apple = new Fruits("yellow", "apple", "medium", "sweet");
        Fruits greenGrapes = new Fruits("green", "grapes", "small", "tart");
        Fruits pomogranate = new Fruits("red", "pomogranate", "medium", "sweet");
        Fruits banana = new Fruits("yellow", "banana", "medium", "tart");

        List<Fruits> noOfFruits = Arrays.asList(apple, greenGrapes, pomogranate, banana);

        //adding Mixedfruits to bowl
        Bowl mixedFruitsBowl = new Bowl();
        mixedFruitsBowl.addFruitsToBowl(apple,greenGrapes,pomogranate,banana);

        MultiLayerBasket multibasket = new MultiLayerBasket(noOfFruits.size());

        /*
        Seggregating and adding fruits based on size
         */
        Seggregator seggregation = new Seggregator(noOfFruits, mixedFruitsBowl, multibasket);
        seggregation.seggregatingFruitsBasedOnSize(noOfFruits, apple.getSize());
        seggregation.seggregatingFruitsBasedOnSize(noOfFruits, banana.getSize());
        seggregation.seggregatingFruitsBasedOnSize(noOfFruits, greenGrapes.getSize());
        seggregation.seggregatingFruitsBasedOnSize(noOfFruits, pomogranate.getSize());

        Assert.assertEquals(noOfFruits.size(),multibasket.getNoOfMultiBowls());
    }
}
