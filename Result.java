package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        if (intent.hasExtra("president") && intent.hasExtra("vicePresident")) {
            String president = intent.getStringExtra("president");
            String vicePresident = intent.getStringExtra("vicePresident");
            TextView tvPresident = findViewById(R.id.textViewPresident);
            TextView tvVicePresident = findViewById(R.id.textViewVicePresident);
            tvPresident.setText("President: " + president);
            tvVicePresident.setText("Vice President: " + vicePresident);
        }
    }
}
