package com.example.phplearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Introduction_PHP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_php);
    }

    public void toIntroPhp(View view)
    {
        Intent intent = new Intent(Introduction_PHP.this, Introduction_PHP.class);
        startActivity(intent);
    }

}