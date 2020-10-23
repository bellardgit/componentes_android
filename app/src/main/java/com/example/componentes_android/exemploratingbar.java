package com.example.componentes_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class exemploratingbar extends AppCompatActivity {
    Button btnEnviar;
    RatingBar rbAvaliar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemploratingbar);
        setTitle("Exemplo RatingBar");
        rbAvaliar=(RatingBar)findViewById(R.id.ratingBarAvaliacao);
        btnEnviar=(Button)findViewById(R.id.cmdEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //int rating = Integer.parseInt(String.valueOf(rbAvaliar.getRating()));
                Toast.makeText(exemploratingbar.this, String.valueOf(rbAvaliar.getRating()), Toast.LENGTH_SHORT).show();
            }
        });
    }
}