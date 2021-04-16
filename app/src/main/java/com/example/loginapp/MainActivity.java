package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    // private variables
    private EditText usernameEditText;
    private EditText passwordEditText;
    private final Map<String, String> userDatabase = new HashMap<String, String>();


    @Override
    // create function
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // load database with random values
        userDatabase.put("test", "test");
        userDatabase.put("sfancher", "myPassword");
        userDatabase.put("conquer", "bestStartup");
        userDatabase.put("baseball1231", "1234base");
        userDatabase.put("basketball333", "passSample");
        userDatabase.put("lameCoder456", "aCoolPassword");
        userDatabase.put("username", "password");
        userDatabase.put("fooBar", "barFoo");
        userDatabase.put("fooBars", "barFoos");
        userDatabase.put("funBug122", "passBug");
        userDatabase.put("fooBarCode", "barFooPassword");


        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        Button loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Search the userDatabase and output the relevant message
                 if (usernameEditText.getText().toString().length() == 0 &&
                         passwordEditText.getText().toString().length() == 0) {
                    String toastMessage = "Error: Must enter a Username and Password";
                    Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
                }
                 else if (usernameEditText.getText().toString().length() == 0) {
                     String toastMessage = "Error: Must enter a Username";
                     Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
                 }
                else if (passwordEditText.getText().toString().length() == 0) {
                    String toastMessage = "Error: Must enter a Password";
                    Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
                }
                else if (!userDatabase.containsKey(usernameEditText.getText().toString())) {
                    String toastMessage = "Error: Username does not exist";
                    Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
                }
                else if (userDatabase.containsKey(usernameEditText.getText().toString()) &&
                         !userDatabase.containsValue(passwordEditText.getText().toString())) {
                    String toastMessage = "Error: Wrong Password";
                    Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
                }
                else {
                    String toastMessage = "Success: Welcome, " + usernameEditText.getText().toString() + "!";
                    Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}