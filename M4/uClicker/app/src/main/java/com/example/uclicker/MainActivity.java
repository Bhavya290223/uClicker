package com.example.uclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button signInButton;

    Intent intent1;
    Intent intent2;
    String user = "";
    String pass = "";

    EditText uEntry;
    EditText pEntry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signInButton = findViewById(R.id.button1);
        uEntry = (EditText) (findViewById(R.id.editTextTextEmailAddress));
        pEntry = (EditText) (findViewById(R.id.editTextTextPassword));

        signInButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                user = uEntry.getText().toString();
                pass = pEntry.getText().toString();

                if(user.equals("student") && pass.equals("student")){
                    intent1 = new Intent(MainActivity.this, AnswerQuestionActivity.class);
                    startActivity(intent1);
                }
                else if(user.equals("professor") && pass.equals("professor")){
                    intent2 = new Intent(MainActivity.this, CreateQuestionActivity.class);
                    startActivity(intent2);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid login", Toast.LENGTH_LONG).show();
                }

            }
        });

    }


}