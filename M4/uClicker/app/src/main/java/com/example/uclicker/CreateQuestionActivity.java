package com.example.uclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Locale;

public class CreateQuestionActivity extends AppCompatActivity {

    Button confirmButton;
    Intent intent1;

    String q1 = "";
    String a1 = "";
    String b1 = "";
    String c1 = "";
    String d1 = "";
    String e1 = "";
    String correctAns = "";


    EditText answer6; //question
    EditText answer1; //A
    EditText answer2; //B
    EditText answer3; //C
    EditText answer4; //D
    EditText answer5; //E
    EditText correct; //correct pick


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_question);

        //initialize button and textField objects
        confirmButton = findViewById(R.id.button3);
        answer6 = (EditText) (findViewById(R.id.answer6));
        answer1 = (EditText) (findViewById(R.id.answer1));
        answer2 = (EditText) (findViewById(R.id.answer2));
        answer3 = (EditText) (findViewById(R.id.answer3));
        answer4 = (EditText) (findViewById(R.id.answer4));
        answer5 = (EditText) (findViewById(R.id.answer5));
        correct = (EditText) (findViewById(R.id.answer));

        confirmButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                //get text answer from fields and set values to string variables
                q1 = answer6.getText().toString();
                a1 = answer1.getText().toString();
                b1 = answer2.getText().toString();
                c1 = answer3.getText().toString();
                d1 = answer4.getText().toString();
                e1 = answer5.getText().toString();
                correctAns = correct.getText().toString().toUpperCase();

                if(!q1.isEmpty() && !a1.isEmpty() && !b1.isEmpty() && !c1.isEmpty() && !d1.isEmpty() && !e1.isEmpty() && !correctAns.isEmpty())
                {
                    if(correctAns.equals("A") || correctAns.equals("B") || correctAns.equals("C") || correctAns.equals("D") || correctAns.equals("E")) {
                        intent1 = new Intent(CreateQuestionActivity.this, QuestionSummaryActivity.class);

                        //initialize a new bundle object and bundle String for Question Summary Activity
                        Bundle bundle = new Bundle();
                        bundle.putString("question1", q1);
                        bundle.putString("a1", a1);
                        bundle.putString("b1", b1);
                        bundle.putString("c1", c1);
                        bundle.putString("d1", d1);
                        bundle.putString("e1", e1);
                        bundle.putString("correctAns", correctAns);

                        //store strings to database (basic textfile) so that it can be read from student view

                        try {
                            OutputStreamWriter writer = new OutputStreamWriter(openFileOutput("output.txt",
                                    Context.MODE_APPEND));
                            writer.append(q1 + "\n");
                            writer.append(a1 + "\n");
                            writer.append(b1 + "\n");
                            writer.append(c1 + "\n");
                            writer.append(d1 + "\n");
                            writer.append(e1 + "\n");
                            writer.append(correctAns + "\n");
                            writer.close();
                        } catch (Exception e) {
                            System.err.println("Error writing to file: " + e);
                        }

                        intent1.putExtras(bundle);
                        startActivity(intent1);
                    }
                    else Toast.makeText(getApplicationContext(), "Please enter a valid answer", Toast.LENGTH_LONG).show();
                }
                else Toast.makeText(getApplicationContext(), "Please fill out all text fields", Toast.LENGTH_LONG).show();
            }
        });
    }
}