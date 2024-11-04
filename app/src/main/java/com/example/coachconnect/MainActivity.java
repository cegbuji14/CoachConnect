package com.example.coachconnect;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPlayerParent = findViewById(R.id.playerparentbutton);
        buttonPlayerParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Setting up the Intent
                Intent intent = new Intent(view.getContext(), PlayerActivty.class);
                view.getContext().startActivity(intent);
            }
        });
        Button buttonCoach = findViewById(R.id.coachbutton);
        buttonCoach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Setting up the Intent
                Intent intent = new Intent(view.getContext(), CoachActivity.class);
                view.getContext().startActivity(intent);
            }
        });

    }
}