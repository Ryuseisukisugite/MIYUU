package com.example.miyuu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goTos311(View view) {
        Intent tos311 = new Intent(this, S311Activity.class);
        startActivity(tos311);
    }

    public void goTos312(View view) {
        Intent tos312 = new Intent(this, S312Activity.class);
        startActivity(tos312);
    }

    public void goTosagano(View view) {
        Intent tosagano = new Intent(this, SaganoActivity.class);
        startActivity(tosagano);
    }

    public void goTolibrary(View view) {
        Intent tolibrary = new Intent(this, LibraryActivity.class);
        startActivity(tolibrary);
    }
}