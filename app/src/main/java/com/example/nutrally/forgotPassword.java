package com.example.nutrally;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
public class forgotPassword extends AppCompatActivity {
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        /*
         * @ Author With Sam
         * @ reference https://www.youtube.com/watch?v=dm-jan0YORg
         * @ Uploaded 7th April 2019
         */


        button=(Button) findViewById(R.id.returnToLogBtn);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(forgotPassword.this,logInScreen.class);
                startActivity(intent);

            }
        });
    }
}