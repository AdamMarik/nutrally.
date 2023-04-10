package com.example.nutrally;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
//import android.os.StrictMode;
import android.os.Handler;
import android.os.Looper;
//import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
//import android.widget.TextView;
//import android.content.Intent;
import com.google.android.material.textfield.TextInputEditText;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import android.widget.TextView;


public class signUp extends AppCompatActivity {
    public Button button;
    TextInputEditText textInputEditTextFullname, textInputEditTextUsername, textInputEditTextPassword, textInputEditTextEmail;
    Button buttonSignUp;

    // Connection myJDBC;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        textInputEditTextFullname = findViewById(R.id.nameTf);
        textInputEditTextUsername = findViewById(R.id.usernameTF);
        textInputEditTextEmail = findViewById(R.id.emailTf);
        textInputEditTextPassword = findViewById(R.id.passwordTf);

        buttonSignUp = findViewById(R.id.confirmBtn);

        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullname, username, email, password;
                fullname = String.valueOf(textInputEditTextFullname.getText());
                username = String.valueOf(textInputEditTextUsername.getText());
                email = String.valueOf(textInputEditTextEmail.getText());
                password = String.valueOf(textInputEditTextPassword.getText());

                if(!fullname.equals("") && !username.equals("") && !email.equals("") && !password.equals("")) {

                    Handler handler = new Handler(Looper.getMainLooper());
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            //Starting Write and Read data with URL
                            //Creating array for parameters
                            String[] field = new String[4];
                            field[0] = "fullname";
                            field[1] = "username";
                            field[2] = "email";
                            field[3] = "password";
                            //Creating array for data
                            String[] data = new String[4];
                            data[0] = fullname;
                            data[1] = username;
                            data[2] = email;
                            data[3] = password;
                            PutData putData = new PutData("http://192.168.100.173/LoginRegister/signup.php", "POST", field, data);
                            if (putData.startPut()) {
                                if (putData.onComplete()) {
                                    String result = putData.getResult();
                                    if(result.equals("Sign Up Success")){
                                        Intent intent = new Intent(getApplicationContext(), logInScreen.class);
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

        // create connection to DB
       // StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
       // StrictMode.setThreadPolicy(policy);
       // try {
       //     myJDBC = DriverManager.getConnection("jdbc:mysql://localhost:3306/nutrally_customers", "root", "Myprotein_2004");
       // } catch (SQLException ex) {
       //     System.out.println("Error Connecting:" + ex.getMessage());
       // } catch (Exception ex) {
        //    System.out.println(ex);
        //}

        //button = (Button) findViewById(R.id.returnToLogBtn4);
        //button.setOnClickListener(v -> {
         //   Intent intent = new Intent(signUp.this, logInScreen.class);
           // startActivity(intent);
        //});

        //button1 = (Button) findViewById(R.id.confirmBtn);
        //button1.setOnClickListener(v -> {
          //  TextView Email = findViewById(R.id.enterEmailTf2);
           // String email = Email.getText().toString();
          //  TextView Name = findViewById(R.id.enterNameTf);
          //  String name = Name.getText().toString();
         //   TextView Pass = findViewById(R.id.enterPasswordTf);
         //   String pass = Pass.getText().toString();
          //  try {
                //create statement
            //    Statement myStats = myJDBC.createStatement();
                //execute sql update
             //   myStats.executeUpdate("INSERT INTO log_in(Name,Email,Password)" + "VALUES('" + email + "', '" + name + "', '" + pass + "')");
          //  } catch (Exception e) {
           //     e.printStackTrace();
           // }
       // });
    }
}
