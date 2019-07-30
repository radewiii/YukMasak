package com.exp002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class SaActivity extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sa);
        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Smoothie Bananaberry.pdf")
                .enableSwipe(true)
                .load();
    }
}
