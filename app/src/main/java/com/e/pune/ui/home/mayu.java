package com.e.pune.ui.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.e.pune.R;

public class mayu extends AppCompatActivity {
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mayu);

    }
    public void bscpdf (View view) {
        Intent intent = new Intent(this , Bscpdf.class);
        startActivity(intent);
    }
}
