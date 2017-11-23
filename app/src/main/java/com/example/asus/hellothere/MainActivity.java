package com.example.asus.hellothere;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    public final ThreadLocal<TextView> t = new ThreadLocal<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.detstar);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), Main2Activity.class);

                startActivity(i);
            }
        });

        TextView t;
        t = (TextView) findViewById(R.id.darth);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"font/STARWARS.TTF");
        t.setTypeface(myCustomFont);
    }
}


