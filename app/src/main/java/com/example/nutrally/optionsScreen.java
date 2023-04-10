package com.example.nutrally;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class optionsScreen extends AppCompatActivity {

    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_screen);

        /*
         * @Author With Sam
         * @reference https://www.youtube.com/watch?v=dm-jan0YORg
         * @ Uploaded 7th April 2019
         */


        button=(Button) findViewById(R.id.returnHomeBtn2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(optionsScreen.this,homeScreen.class);
                startActivity(intent);

            }
        });

    }
}