package com.example.nutrally;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

public class scanMenu extends AppCompatActivity {
    Button homeButton;
    private SurfaceView mCameraPreview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_menu);

       ;

        mCameraPreview = (SurfaceView) findViewById(R.id.camera_preview);

        Button scanButton = (Button) findViewById(R.id.scanBtn);

        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start scanning
            }
        });


        Button btnHome = (Button) findViewById((R.id.homeBtn));
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(scanMenu.this, homeScreen.class);
                startActivity(intent);
            }
        });




    }
}