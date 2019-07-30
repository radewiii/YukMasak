package com.exp002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DcActivity extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dc);
        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Dorayaki.pdf")
                .enableSwipe(true)
                .load();
    }
}
