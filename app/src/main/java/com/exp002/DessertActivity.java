package com.exp002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class DessertActivity extends AppCompatActivity {
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);
        Button f = (Button) findViewById(R.id.f);
        Button g = (Button) findViewById(R.id.g);
        Button h = (Button) findViewById(R.id.h);
        Button i = (Button) findViewById(R.id.i);
        Button j = (Button) findViewById(R.id.j);

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DessertActivity.this, DaActivity.class);
                DessertActivity.this.startActivity(intent);
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DessertActivity.this, DbActivity.class);
                DessertActivity.this.startActivity(intent);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DessertActivity.this, DcActivity.class);
                DessertActivity.this.startActivity(intent);
            }
        });

       i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DessertActivity.this, DdActivity.class);
                DessertActivity.this.startActivity(intent);
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DessertActivity.this, DeActivity.class);
                DessertActivity.this.startActivity(intent);
            }
        });

    }
}
