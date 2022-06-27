package com.assignment.fruitbowl;

public class Fruits {
    private String colour;
    private String name;
    private String size;
    private String tasteType;

    public Fruits(String colour,String name,String size,String tasteType){
          this.colour=colour;
          this.name=name;
          this.size=size;
          this.tasteType=tasteType;
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getTasteType() {
        return tasteType;
    }

    @Override
    public String toString(){
        return "{"+name+" "+colour+" "+size+" "+tasteType+"}";
    }
}
