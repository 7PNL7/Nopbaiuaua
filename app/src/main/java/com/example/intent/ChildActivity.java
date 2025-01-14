package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChildActivity extends AppCompatActivity {
    TextView txtChild;
    Button btnChild;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ativity_child);
        Button btnChild = (Button) findViewById(R.id.btnChild);
        TextView txtChild = (TextView) findViewById(R.id.txtChild);
        btnChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent childIntent = new Intent(ChildActivity.this,MainActivity.class);
                startActivity(childIntent);
            }
        });
    }
}