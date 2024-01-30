package com.example.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class VotingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting);
        TextView tvName = findViewById(R.id.textViewName);
        Intent intent = getIntent();
        if (intent.hasExtra("name")) {
            String name = intent.getStringExtra("name");
            tvName.setText("Hello " + name + "!");
        }
    }
    public void goToResultactivity(View view) {
        // Get the text from EditText fields
        EditText presidentEditText = findViewById(R.id.textViewPresident);
        EditText vicePresidentEditText = findViewById(R.id.textViewVicePresident);
        String presidentName = presidentEditText.getText().toString();
        String vicePresidentName = vicePresidentEditText.getText().toString();

        // Create Intent to start ResultActivity
        Intent intent = new Intent(this, ResultActivity.class);
        // Put the data in extras
        intent.putExtra("presidentName", presidentName);
        intent.putExtra("vicePresidentName", vicePresidentName);
        // Start ResultActivity
        startActivity(intent);
    }
}
