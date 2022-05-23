package com.example.phplearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Introduction_PHP_QUIZ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_php_quiz);
    }

    public void submitQuiz(View view)
    {
        RadioButton q1_1 = findViewById(R.id.Q1_1);
        RadioButton q1_2 = findViewById(R.id.Q1_2);
        RadioButton q1_3 = findViewById(R.id.Q1_3);

        RadioButton q2_1 = findViewById(R.id.Q2_1);
        RadioButton q2_2 = findViewById(R.id.Q2_2);
        RadioButton q2_3 = findViewById(R.id.Q2_3);

        RadioButton q3_1 = findViewById(R.id.Q3_1);
        RadioButton q3_2 = findViewById(R.id.Q3_2);
        RadioButton q3_3 = findViewById(R.id.Q3_3);

        AlertDialog.Builder builder = new AlertDialog.Builder(Introduction_PHP_QUIZ.this);
        if(q1_2.isChecked() && q2_1.isChecked() && q3_1.isChecked())
        {
            builder.setMessage("Q1, Q2 and Q3 are Correct!");
        }
        else if (q1_2.isChecked() && q2_1.isChecked())
        {
            builder.setMessage("Q1 and Q2 are Correct!");
        }
        else if(q1_2.isChecked() && q3_1.isChecked())
        {
            builder.setMessage("Q1 and Q3 are Correct!");
        }
        else if(q2_1.isChecked() && q3_1.isChecked())
        {
            builder.setMessage("Q2 and Q3 are Correct!");
        }
        else
        {
            builder.setMessage("Sorry Try Again!");
        }
        builder.setTitle("Result");
        builder.setCancelable(true);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}