package com.example.coachconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayerActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_activty);
        Button buttonSearch = findViewById(R.id.searchbutton);
        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Setting up the Intent
                Intent intent = new Intent(view.getContext(), SearchActivity.class);
                view.getContext().startActivity(intent);
            }
        });
        Button buttonSaved = findViewById(R.id.savedbutton);
        buttonSaved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Setting up the Intent
                Intent intent = new Intent(view.getContext(), PlayerSavedActivity.class);
                view.getContext().startActivity(intent);
            }
        });


    }
}