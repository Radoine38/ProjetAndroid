package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ConnexionActivity extends AppCompatActivity {

    public static final String CONNEXION_KEY = "connexion_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);
        Button validButton = findViewById(R.id.validButton);

        validButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText name = findViewById(R.id.name);
                String nameResult = name.getText().toString();

                EditText firstName = findViewById(R.id.firstname);
                String fnResult = firstName.getText().toString();

                Intent intent = new Intent(ConnexionActivity.this, MainActivity.class);
                intent.putExtra(MainActivity.NAME_KEY,nameResult);
                intent.putExtra(MainActivity.NAME_KEY,fnResult);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

}