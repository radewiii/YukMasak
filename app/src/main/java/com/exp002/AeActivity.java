package com.exp002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class AeActivity extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ae);
        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Spanish chickpea and spinach stew.pdf")
                .enableSwipe(true)
                .load();
    }
}
