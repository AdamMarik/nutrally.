package com.example.nutrally;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

import com.google.android.material.textfield.TextInputEditText;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class logInScreen extends AppCompatActivity {
    public Button button;
    TextInputEditText textInputEditTextPassword, textInputEditTextEmail;
    Button buttonLogIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_screen);

        Button registerButton;
        Button forgotPasswordButton;
        textInputEditTextEmail = findViewById(R.id.EmailTf2);
        textInputEditTextPassword = findViewById(R.id.passwordTf2);

        buttonLogIn= findViewById(R.id.loginBtn);

        buttonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email, password;
                email = String.valueOf(textInputEditTextEmail.getText());
                password = String.valueOf(textInputEditTextPassword.getText());

                if(!email.equals("") && !password.equals("")) {

                    Handler handler = new Handler(Looper.getMainLooper());
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            //Starting Write and Read data with URL
                            //Creating array for parameters
                            String[] field = new String[2];
                            field[0] = "email";
                            field[1] = "password";
                            //Creating array for data
                            String[] data = new String[2];
                            data[0] = email;
                            data[1] = password;
                            PutData putData = new PutData("http://192.168.100.173/LoginRegister/login.php", "POST", field, data);
                            if (putData.startPut()) {
                                if (putData.onComplete()) {
                                    String result = putData.getResult();
                                    if(result.equals("Login Success")){
                                        Intent intent = new Intent(getApplicationContext(), homeScreen.class);
                                        startActivity(intent);
                                        finish();

                                    }else{
                                        Toast.makeText(getApplicationContext(),result, Toast.LENGTH_SHORT).show();
                                    }
                                }
                            }
                            //End Write and Read data with URL
                        }
                    });
                }
                else{
                    Toast.makeText(getApplicationContext(), "All fields are Required", Toast.LENGTH_SHORT).show();
                }
            }
        });

        registerButton = (Button)  findViewById((R.id.registerBtn));
        registerButton.setOnClickListener(view -> {
            Intent intent = new Intent(logInScreen.this, signUp.class);
            startActivity(intent);
        });

        forgotPasswordButton = (Button)  findViewById((R.id.forgotPasswordBtn));
        forgotPasswordButton.setOnClickListener(view -> {
            Intent intent = new Intent(logInScreen.this, forgotPassword.class);
            startActivity(intent);
        });






    }
}