package com.example.sanjeev.cardview;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView c1;
    CardView c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CardView)findViewById(R.id.cardView1_id);
        c2=(CardView)findViewById(R.id.cardView2_id);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Item 1 Selected",Snackbar.LENGTH_LONG).show();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Item 2 Selected",Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
