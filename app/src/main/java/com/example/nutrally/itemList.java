package com.example.nutrally;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class itemList extends AppCompatActivity {
    public Button returnButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);


        /*
         * @Author With Sam
         * @reference https://www.youtube.com/watch?v=dm-jan0YORg
         * @ Uploaded 7th April 2019
         */


        returnButton=(Button) findViewById(R.id.returnToHomeBtn);
        returnButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                Intent intent=new Intent(itemList.this,homeScreenActivity.class);
//                startActivity(intent);

            }
        });






    }
}