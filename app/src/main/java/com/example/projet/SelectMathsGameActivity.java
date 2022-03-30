package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectMathsGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_maths_game);

        Button mult = findViewById(R.id.multiplications);
        Button add = findViewById(R.id.additions);
        Button sub = findViewById(R.id.substractions);
        Button back = findViewById(R.id.back);

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectMathsGameActivity.this, MultiplicationsActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SelectMathsGameActivity.super.finish();
            }
        });
    }
}