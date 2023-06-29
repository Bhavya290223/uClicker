package com.example.uclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuestionSummaryActivity extends AppCompatActivity {

    Button confirmButton;
    Button newQuestionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_summary);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String q1 = bundle.getString("question1");
        String a1 = bundle.getString("a1");
        String b1 = bundle.getString("b1");
        String c1 = bundle.getString("c1");
        String d1 = bundle.getString("d1");
        String e1 = bundle.getString("e1");
        String correctAns = bundle.getString("correctAns");

        TextView textView20 = (TextView)findViewById(R.id.textView20); //question
        TextView textView = (TextView)findViewById(R.id.textView); //option A
        TextView textView16 = (TextView)findViewById(R.id.textView16); //option B
        TextView textView17 = (TextView)findViewById(R.id.textView17); //option C
        TextView textView18 = (TextView)findViewById(R.id.textView18); //option D
        TextView textView19 = (TextView)findViewById(R.id.textView19); //option E
        TextView textView24 = (TextView)findViewById(R.id.textView24); //correct answer

        textView20.setText(q1); //set summary text to Question String from bundle
        textView.setText(a1); //set summary text to a1 String from bundle
        textView16.setText(b1); //set summary text to b1 Question String from bundle
        textView17.setText(c1); //set summary text to c1 Question String from bundle
        textView18.setText(d1); //set summary text to d1 Question String from bundle
        textView19.setText(e1); //set summary text to e1 Question String from bundle
        textView24.setText(correctAns); //set summary text to e1 Question String from bundle

        confirmButton = findViewById(R.id.button3);
        confirmButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {

                Intent intent2 = new Intent(QuestionSummaryActivity.this, MainActivity.class);
                startActivity(intent2);
            }
        });

        newQuestionButton = findViewById(R.id.button);
        newQuestionButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {

                Intent intent3 = new Intent(QuestionSummaryActivity.this, CreateQuestionActivity.class);
                startActivity(intent3);
            }
        });
    }
}