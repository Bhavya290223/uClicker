package com.example.uclicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AnswerQuestionActivity extends AppCompatActivity {

    Button confirmButton;

    Intent intent1;
    Intent intent3;

    String q1 = "";
    String a1 = "";
    String b1 = "";
    String c1 = "";
    String d1 = "";
    String e1 = "";
    String userAns = "";
    String correctAns = "";

    TextView answer6; //question
    TextView answer1; //A
    TextView answer2; //B
    TextView answer3; //C
    TextView answer4; //D
    TextView answer5; //E
    TextView question; //E

    int questionNum = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_question);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null) {
            questionNum = bundle.getInt("questionNum");
            score = bundle.getInt("score");
        }
        //initialize button and textField objects
        confirmButton = findViewById(R.id.button4);

        //read from file
        try {
            InputStream inputStream = openFileInput("output.txt");
            if (inputStream != null) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String temp = "";
                for(int i = 0; i < questionNum * 7; i++)
                    bufferedReader.readLine();
                if((temp = bufferedReader.readLine().trim()) != null)
                {
                    q1 = temp;
                }
                if((temp = bufferedReader.readLine().trim()) != null)
                {
                    a1 = temp;
                }
                if((temp = bufferedReader.readLine().trim()) != null)
                {
                    b1 = temp;
                }
                if((temp = bufferedReader.readLine().trim()) != null)
                {
                    c1 = temp;
                }
                if((temp = bufferedReader.readLine().trim()) != null)
                {
                    d1 = temp;
                }
                if((temp = bufferedReader.readLine().trim()) != null)
                {
                    e1 = temp;
                }
                if((temp = bufferedReader.readLine().trim()) != null)
                {
                    correctAns = temp;
                }
                inputStream.close();
            }
        }
        catch(Exception e)
        {
            //reached end of file
            GoToResults();
        }

        TextView textView5 = (TextView)findViewById(R.id.textView5); //question
        TextView textView11 = (TextView)findViewById(R.id.textView11); //option A
        TextView textView12 = (TextView)findViewById(R.id.textView12); //option B
        TextView textView13 = (TextView)findViewById(R.id.textView13); //option C
        TextView textView14 = (TextView)findViewById(R.id.textView14); //option D
        TextView textView15 = (TextView)findViewById(R.id.textView15); //option E
        TextView question = (TextView)findViewById(R.id.textView3);

        textView5.setText(q1); //set summary text to Question String from file
        textView11.setText("A: " +a1); //set summary text to a1 String from file
        textView12.setText("B: " +b1); //set summary text to b1 Question String from file
        textView13.setText("C: " +c1); //set summary text to c1 Question String from file
        textView14.setText("D: " +d1); //set summary text to d1 Question String from file
        textView15.setText("E: " +e1); //set summary text to e1 Question String from file
        question.setText("Question " +(questionNum + 1));
        confirmButton = findViewById(R.id.button4);

        confirmButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
                if(rg.getCheckedRadioButtonId() != -1) {
                    userAns = ((RadioButton)findViewById(rg.getCheckedRadioButtonId())).getText().toString();
                    intent1 = new Intent(AnswerQuestionActivity.this, QuestionResultsActivity.class);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("question1", q1);
                    bundle2.putString("a1", a1);
                    bundle2.putString("b1", b1);
                    bundle2.putString("c1", c1);
                    bundle2.putString("d1", d1);
                    bundle2.putString("e1", e1);
                    bundle2.putString("userAns", userAns);
                    bundle2.putString("correctAns", correctAns);
                    bundle2.putInt("questionNum", questionNum);
                    bundle2.putInt("score", score);

                    intent1.putExtras(bundle2);
                    startActivity(intent1);
                }
                else Toast.makeText(getApplicationContext(), "Please select an answer", Toast.LENGTH_LONG).show();
            }
        });
    }

    void GoToResults()
    {
        intent3 = new Intent(AnswerQuestionActivity.this, FinalResultsActivity.class);
        Bundle bundle3 = new Bundle();
        bundle3.putInt("questionNum", questionNum);
        bundle3.putInt("score", score);

        intent3.putExtras(bundle3);
        startActivity(intent3);
    }
}