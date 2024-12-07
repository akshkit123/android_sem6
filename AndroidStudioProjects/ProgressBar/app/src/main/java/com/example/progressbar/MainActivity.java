package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ProgressBar pbar1;

    TextView t1;

    Button b1;

    Handler hd1 = new Handler();

    int i=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pbar1 = findViewById(R.id.pbar);
        t1 = findViewById(R.id.txt);
        b1 = findViewById(R.id.btnsubmit);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (i<=100)
                            hd1.post(new Runnable() {
                                @Override
                                public void run() {
                                    pbar1.setProgress(i);
                                    t1.setText(i + "/" + pbar1.getMax());
                                }
                            });
                            try {
                                Thread.sleep(1000);
                            }
                            catch (Exception e)
                            {

                            }
                            i++;
                    }
                }).start();
            }
        });
    }
}