package com.pluralsight.model.assets;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double karat, double value) {
        super(name, value);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return marketValue;
    }
    @Override
    public String toString() {
        return "Jewelry - " + name + " | Karat: " + karat + " | Value: $" + marketValue;
    }
}
