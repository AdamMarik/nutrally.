package com.example.nutrally;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class userProfile extends AppCompatActivity {

    public Button homeButton;
    public Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);


        /*
         * @Author With Sam
         * @reference https://www.youtube.com/watch?v=dm-jan0YORg
         * @ Uploaded 7th April 2019
         */


        homeButton=(Button) findViewById(R.id.homeBtn);
        homeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(userProfile.this,homeScreen.class);
                startActivity(intent);

            }
        });


        saveButton=(Button) findViewById(R.id.saveBtn);
        saveButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               //button saves details

            }
        });



    }
}