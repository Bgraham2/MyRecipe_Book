package com.example.myrecipebook;

public class PantryItem {
    private Ingredient ingredient;
    private String amountType;
    private int amount;

    public PantryItem(Ingredient ingredient, String amountType, int amount) {
        this.ingredient = ingredient;
        this.amountType = amountType;
        this.amount = amount;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public String getAmountType() {
        return amountType;
    }

    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
