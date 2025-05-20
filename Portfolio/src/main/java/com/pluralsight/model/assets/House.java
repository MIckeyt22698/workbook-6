package com.pluralsight.model.assets;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, int yearBuilt, int squareFeet, int bedrooms, double value) {
        super(name, value);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return marketValue;
    }
    @Override
    public String toString() {
        return "House - " + name + " | Year: " + yearBuilt + " | Size: " + squareFeet + " sq ft | Bedrooms: " + bedrooms + " | Value: $" + marketValue;
    }
}
