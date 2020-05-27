package com.e.pune.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.e.pune.R;

public class Bscpdf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bscpdf);
    }

    public void openpdf(View view) {
        Intent intent = new Intent(this , pdfshow1.class);
        startActivity(intent);
    }

    public void openpdf2(View view) {
        Intent intent = new Intent(this , pdfshow2.class);
        startActivity(intent);

    }

    public void openpdf3(View view) {
        Intent intent = new Intent(this ,pdfshow3.class);
        startActivity(intent);
    }

    public void openpdf4(View view) {
        Intent intent = new Intent (this,pdfshow4.class);
        startActivity(intent);
    }

    public void openpdf5(View view) {
        Intent intent= new Intent(this , pdfshow5.class);
        startActivity(intent);
    }

    public void openpdf6(View view) {
        Intent intent = new Intent(this , pdfshow6.class);
        startActivity(intent);
    }

    public void openpdf7(View view) {
        Intent intent = new Intent(this , pdfshow7.class);
        startActivity(intent);
    }

    public void openpdf8(View view) {
        Intent intent = new Intent(this , pdfshow8.class);
        startActivity(intent);
    }
}
