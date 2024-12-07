package com.example.viewflipperimageslider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    String[] Header ={
            "Title 1","Title 2",
            "Title 3","Title 4",
            "Title 5"
    };

    String[] Desc ={
            "Subtitle 1","Subtitle 2",
            "Subtitle 3","Subtitle 4",
            "Subtitle 5"
    };
    int [] imgid=
            {
                R.drawable.Professor,
                    R.drawable.denver,
                    R.drawable.moneyheistsdp,
                    R.drawable.download,
                    R.drawable.denver

            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.displist);
        custAdapter adp = new custAdapter(this ,Header,Desc,imgid);

        lv.setAdapter(adp);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectheader = Header[i].toString();
                String selectimg = String.valueOf(imgid[i]);

                Intent i1 = new Intent(MainActivity.this,SecondAc.class);
                i1.putExtra("hed",selectheader);
                i1.putExtra("img",selectimg);
                startActivity(i1);
            }
        });
    }

    class custAdapter extends ArrayAdapter<String>
    {
        Context context;
        String h1[];
        String d1[];
        int i1[];


        public custAdapter(@NonNull Context context, String i[], String j[], int k[])
        {
            super(context,R.layout.customlist,R.id.displist,i);
            h1=i;
            d1=j;
            i1=k;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inflater=(LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView= inflater.inflate(R.layout.customlist,null,true);

            ImageView img = rowView.findViewById(R.id.custimg);
            TextView t1=rowView.findViewById(R.id.head);
            TextView t2=rowView.findViewById(R.id.Des);


            return rowView;
        }
    }
}