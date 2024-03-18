package com.example.myrecipebook;

public class Ingredients {
    private String measurementType;
    private int measurement;
    private String ingredient;

    public Ingredients(String measurementType, int measurement, String ingredient) {
        this.measurementType = measurementType;
        this.measurement = measurement;
        this.ingredient = ingredient;
    }

    public String getMeasurementType() {
        return measurementType;
    }

    public void setMeasurementType(String measurementType) {
        this.measurementType = measurementType;
    }

    public int getMeasurement() {
        return measurement;
    }

    public void setMeasurement(int measurement) {
        this.measurement = measurement;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
}
