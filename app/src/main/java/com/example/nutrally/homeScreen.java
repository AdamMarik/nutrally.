package com.example.nutrally;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class homeScreen extends AppCompatActivity {

    Button scanScreenButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);






        Button profileButton;
        Button optionsButton;
        Button logoutButton;


        scanScreenButton = (Button) findViewById((R.id.scanBtn));
        scanScreenButton.setOnClickListener(view -> {
            Intent intent = new Intent(homeScreen.this, scanMenu.class);
            startActivity(intent);
        });

        profileButton = (Button) findViewById((R.id.profileBtn));
        profileButton.setOnClickListener(view -> {
            Intent intent = new Intent(homeScreen.this, userProfile.class);
            startActivity(intent);
        });

        optionsButton = (Button) findViewById((R.id.optionsBtn));
        optionsButton.setOnClickListener(view -> {
            Intent intent = new Intent(homeScreen.this, optionsScreen.class);
            startActivity(intent);
        });

        logoutButton = (Button) findViewById((R.id.logoutBtn));
        logoutButton.setOnClickListener(view -> {
            Intent intent = new Intent(homeScreen.this, logInScreen.class);
            startActivity(intent);
//            moveTaskToBack(true);
//            android.os.Process.killProcess(android.os.Process.myPid());
//            System.exit(0);
        });

    }
}