package com.uasmobileprogramming.aplikasipenjadwalan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {
    private Button btnSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        btnSplash = (Button) findViewById(R.id.btnSplash);
        btnSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nextPage();
            }
        });
    }

    public void nextPage() {
        Intent i = new Intent(getApplicationContext(), SignIn.class);
        startActivity(i);
    }

}