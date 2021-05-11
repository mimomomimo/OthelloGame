package com.example.othello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.View.*;
import static java.lang.Thread.*;
//import static com.example.othello.R.id.othero81;

public class MainActivity extends AppCompatActivity {

    //ImageButton vsCpu;
    //ImageButton vsPeople;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton vsCpu = findViewById(R.id.game1);
        ImageButton vsPeople = findViewById(R.id.game2);
        vsCpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),SubActivity.class);
                startActivity(intent);
            }
        });
        vsPeople.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),SubActivity2.class);
                startActivity(intent);
            }
        });


    }

}
