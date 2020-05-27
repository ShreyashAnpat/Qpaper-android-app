package com.e.pune.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.e.pune.R;
import com.github.barteksc.pdfviewer.PDFView;

public class pdfshow2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfshow2);
        PDFView pdfView = (PDFView) findViewById(R.id.pdf);
        pdfView.fromAsset("bsc2.pdf").load();
    }
}
