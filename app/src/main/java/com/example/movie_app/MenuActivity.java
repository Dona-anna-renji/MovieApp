package com.example.movie_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    Button b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        b3=(Button) findViewById(R.id.searchmovie);
        b4=(Button) findViewById(R.id.addmovie);
        b5=(Button) findViewById(R.id.viewmovie);
        b6=(Button) findViewById(R.id.exitmovie);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o3=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(o3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o4 =new Intent(getApplicationContext(), AddMovieActivity.class);
                startActivity(o4);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o5=new Intent(getApplicationContext(),ViewActivity.class);
                startActivity(o5);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o3=new Intent(getApplicationContext(),FacebookActivity.class);
                startActivity(o3);
            }
        });



    }
}