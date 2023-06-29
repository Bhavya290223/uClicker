package com.example.uclicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuestionResultsActivity extends AppCompatActivity {

    Button confirmButton;

    Intent intent1;

    int questionNum = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_results);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String q1 = bundle.getString("question1");
        String a1 = bundle.getString("a1");
        String b1 = bundle.getString("b1");
        String c1 = bundle.getString("c1");
        String d1 = bundle.getString("d1");
        String e1 = bundle.getString("e1");
        String userAns = bundle.getString("userAns");
        String correctAns = bundle.getString("correctAns");
        questionNum = bundle.getInt("questionNum");
        score = bundle.getInt("score");

        TextView textView5 = (TextView)findViewById(R.id.textView5); //question
        TextView textView11 = (TextView)findViewById(R.id.textView11); //option A
        TextView textView12 = (TextView)findViewById(R.id.textView12); //option B
        TextView textView13 = (TextView)findViewById(R.id.textView13); //option C
        TextView textView14 = (TextView)findViewById(R.id.textView14); //option D
        TextView textView15 = (TextView)findViewById(R.id.textView15); //option E
        TextView textView21 = (TextView)findViewById(R.id.textView21); //correct answer
        TextView question = (TextView)findViewById(R.id.textView30);


        textView5.setText(q1); //set summary text to Question String from bundle
        textView11.setText("A: " +a1); //set summary text to a1 String from bundle
        textView12.setText("B: " +b1); //set summary text to b1 Question String from bundle
        textView13.setText("C: " +c1); //set summary text to c1 Question String from bundle
        textView14.setText("D: " +d1); //set summary text to d1 Question String from bundle
        textView15.setText("E: " +e1); //set summary text to e1 Question String from bundle
        question.setText("Question " +(questionNum + 1));

        confirmButton = findViewById(R.id.button4);

        //changes incorrect answer text color to red
        userAns = userAns.trim();
        if (!userAns.equals(correctAns)) {
            if(userAns.equals("A"))
                textView11.setTextColor(this.getResources().getColor(R.color.red));
            if(userAns.equals("B"))
                textView12.setTextColor(this.getResources().getColor(R.color.red));
            if(userAns.equals("C"))
                textView13.setTextColor(this.getResources().getColor(R.color.red));
            if(userAns.equals("D"))
                textView14.setTextColor(this.getResources().getColor(R.color.red));
            if(userAns.equals("E"))
                textView15.setTextColor(this.getResources().getColor(R.color.red));
        }
        else score++;

        //changes correct answer text color to green
        if(correctAns.equals("A"))
            textView11.setTextColor(this.getResources().getColor(R.color.green));
        if(correctAns.equals("B"))
            textView12.setTextColor(this.getResources().getColor(R.color.green));
        if(correctAns.equals("C"))
            textView13.setTextColor(this.getResources().getColor(R.color.green));
        if(correctAns.equals("D"))
            textView14.setTextColor(this.getResources().getColor(R.color.green));
        if(correctAns.equals("E"))
            textView15.setTextColor(this.getResources().getColor(R.color.green));

        textView21.setText("Correct Answer: " +correctAns);

        confirmButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                //intent1 = new Intent(QuestionResultsActivity.this, MainActivity.class);
                questionNum++;
                intent1 = new Intent(QuestionResultsActivity.this, AnswerQuestionActivity.class);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("questionNum", questionNum);
                bundle2.putInt("score", score);
                intent1.putExtras(bundle2);
                startActivity(intent1);
            }
        });
    }
}