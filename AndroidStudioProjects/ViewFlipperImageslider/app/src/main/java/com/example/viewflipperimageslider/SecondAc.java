package com.example.viewflipperimageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondAc extends AppCompatActivity {

    TextView t1;
    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        t1=findViewById(R.id.secondTv);
        i1=findViewById(R.id.secongImg);

    }
}