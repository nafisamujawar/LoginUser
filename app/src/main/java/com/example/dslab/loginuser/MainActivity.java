package com.example.dslab.loginuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static EditText username;
    private static EditText password;
    private static Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username =(EditText)findViewById(R.id.editText);
        password=(EditText)findViewById(R.id.editText2);
        login=(Button) findViewById(R.id.button);
    }

    public void Verify(View view) {
        if (username.getText().toString().equals("Naffu") && password.getText().toString().equals("azzu")) {
            Toast.makeText(getApplicationContext(),"Correct Password...",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Successful.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(),"Wrong Password...",Toast.LENGTH_SHORT).show();
        }
    }

    }

