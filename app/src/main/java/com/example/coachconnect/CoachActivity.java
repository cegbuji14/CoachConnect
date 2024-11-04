package com.example.coachconnect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CoachActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coach);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button buttonCoachSearch = findViewById(R.id.coachsearchbutton);
        buttonCoachSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Setting up the Intent
                Intent intent = new Intent(view.getContext(), SearchActivity.class);
                view.getContext().startActivity(intent);
            }
        });
        Button coachSaved = findViewById(R.id.coachsavebutton);
        coachSaved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Setting up the Intent
                Intent intent = new Intent(view.getContext(), CoachSavedActivity.class);
                view.getContext().startActivity(intent);
            }
        });


    }
}