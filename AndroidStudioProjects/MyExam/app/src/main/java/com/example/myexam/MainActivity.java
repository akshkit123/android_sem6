package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {

    ListView lst;

    EditText e1;

    String fruits[] = {"Apple","Mango", "Banana","Appii","Bananana"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst = findViewById(R.id.list);
        e1 = findViewById(R.id.edit);

        ArrayAdapter adp = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        lst.setAdapter(adp);

        e1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                adp.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}