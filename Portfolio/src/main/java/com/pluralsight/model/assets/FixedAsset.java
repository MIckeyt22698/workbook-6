package com.pluralsight.model.assets;

import com.pluralsight.model.Valuable;

public abstract class FixedAsset implements Valuable {
    protected String name;
    protected double marketValue;

    public FixedAsset(String name, double value) {
        this.name = name;
        this.marketValue = value;
    }

    @Override
    public double getValue() {
        return marketValue;
    }
}
