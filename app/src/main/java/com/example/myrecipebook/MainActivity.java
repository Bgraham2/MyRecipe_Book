package com.example.myrecipebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mealPlan = findViewById(R.id.buttonMealPlan);
        mealPlan.setOnClickListener(view -> {
            Log.d(TAG, "Meal plan clicked");
            //TODO add opening meal plan activity
        });

        Button recipes = findViewById(R.id.buttonRecipes);
        recipes.setOnClickListener(view -> {
            Log.d(TAG, "Recipes clicked");
            //TODO add opening recipe activity
        });

        Button pantry = findViewById(R.id.buttonPantry);
        pantry.setOnClickListener(view -> {
            Log.d(TAG, "PantryItem clicked");
            //TODO add opening pantry activity
        });
    }
}