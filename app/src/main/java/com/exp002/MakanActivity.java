package com.exp002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MakanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makan);
        Button a = (Button) findViewById(R.id.a);
        Button b = (Button) findViewById(R.id.b);
        Button c = (Button) findViewById(R.id.c);
        Button d = (Button) findViewById(R.id.d);
        Button e = (Button) findViewById(R.id.e);

       a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MakanActivity.this, AaActivity.class);
                MakanActivity.this.startActivity(intent);
            }
        });

       b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MakanActivity.this, AbActivity.class);
                MakanActivity.this.startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MakanActivity.this, AcActivity.class);
                MakanActivity.this.startActivity(intent);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MakanActivity.this, AdActivity.class);
                MakanActivity.this.startActivity(intent);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MakanActivity.this, AeActivity.class);
                MakanActivity.this.startActivity(intent);
            }
        });

    }
}
