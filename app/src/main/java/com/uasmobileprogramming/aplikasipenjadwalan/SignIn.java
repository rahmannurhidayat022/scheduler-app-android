package com.uasmobileprogramming.aplikasipenjadwalan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SignIn extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signIn);

        button = (Button) findViewById(R.id.sign_button);
        button.setOnClickListener(new View.OnClickListener() {
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