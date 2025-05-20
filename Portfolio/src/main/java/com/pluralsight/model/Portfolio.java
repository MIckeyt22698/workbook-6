package com.pluralsight.model;

import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(Valuable asset) {
        assets.add(asset);
    }

    public double getTotalValue() {
        double total = 0;
        for (Valuable v : assets) {
            total += v.getValue();
        }
        return total;
    }
    public void printAssets() {
        for (Valuable asset : assets) {
            System.out.println(asset.toString());
        }
    }
}
