package com.example.uclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class FinalResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_results);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        int questionNum = bundle.getInt("questionNum");
        int score = bundle.getInt("score");

        TextView textView = (TextView)findViewById(R.id.textView25);
        textView.setText(score +"/" +questionNum);

        Button confirmButton = findViewById(R.id.button5);

        confirmButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                Intent intent = new Intent(FinalResultsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}