package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_game);

        Button maths = findViewById(R.id.maths);
        Button culture = findViewById(R.id.culture);

        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectGameActivity.this, SelectMathsGameActivity.class);
                startActivity(intent);
            }
        });

        culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectGameActivity.this, SelectMathsGameActivity.class);
                startActivity(intent);
            }
        });
    }
}