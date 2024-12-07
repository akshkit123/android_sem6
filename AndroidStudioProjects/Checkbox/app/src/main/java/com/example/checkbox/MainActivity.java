package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox c,cpp,java;

    Button submit;

    RadioButton male,female,;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.btnsub);
        c = findViewById(R.id.chkC);
        cpp = findViewById(R.id.chkCpp);
        java = findViewById(R.id.chkjava);
        male = findViewById(R.id.Male);
        female = findViewById(R.id.Female);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amt = 0;
                if (c.isChecked())
                {
                    amt+=5000;
                }
                if (cpp.isChecked())
                {
                    amt+=6000;
                }
                if (java.isChecked())
                {
                    amt+=7000;
                }

                if (female.isChecked())
                {
                    amt= amt-(amt-0.30);
                }
                Toast.makeText(MainActivity.this,"Your Amt is "+amt, Toast.LENGTH_SHORT).show();
            }
        });
        )
    }
}