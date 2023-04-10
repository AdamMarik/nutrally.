package com.example.nutrally;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class ingredientsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients_screen);

        Button homeButton;
        Button listButton;


        homeButton = (Button) findViewById(R.id.HomeBtn);
        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(ingredientsScreen.this, homeScreen.class);
            startActivity(intent);

        });

        listButton = (Button) findViewById(R.id.listBtn);
        listButton.setOnClickListener(v -> {
            Intent intent = new Intent(ingredientsScreen.this, itemList.class);
            startActivity(intent);

        });







    }
}