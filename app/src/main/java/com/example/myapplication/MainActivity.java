package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button Next_Button_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Next_Button_btn = findViewById(R.id.Next_button);

        Next_Button_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switchActivity();

    }

    public void switchActivity(){
        Intent switchActivityIntent = new Intent(this, com.example.myapplication.ActivityDos.class);
        startActivity(switchActivityIntent);

    }

}
