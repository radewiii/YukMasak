package com.exp002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class SmothiesActivity extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smothies);
        Button k = (Button) findViewById(R.id.k);
        Button l = (Button) findViewById(R.id.l);
        Button m = (Button) findViewById(R.id.m);
        Button n = (Button) findViewById(R.id.n);
        Button o = (Button) findViewById(R.id.o);

        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SmothiesActivity.this, SaActivity.class);
                SmothiesActivity.this.startActivity(intent);
            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SmothiesActivity.this, SbActivity.class);
                SmothiesActivity.this.startActivity(intent);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SmothiesActivity.this, ScActivity.class);
                SmothiesActivity.this.startActivity(intent);
            }
        });

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SmothiesActivity.this, SdActivity.class);
                SmothiesActivity.this.startActivity(intent);
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SmothiesActivity.this, SeActivity.class);
                SmothiesActivity.this.startActivity(intent);
            }
        });
    }
}
