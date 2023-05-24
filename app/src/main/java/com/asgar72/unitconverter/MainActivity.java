package com.asgar72.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.asgar72.unitconverter.Unit.Area_Activity;
import com.asgar72.unitconverter.Unit.Length_Activity;
import com.asgar72.unitconverter.Unit.Storage_Activity;
import com.asgar72.unitconverter.Unit.Time_Activity;
import com.asgar72.unitconverter.Unit.Weight_Activity;
import com.asgar72.unitconverter.Unit.temp_Activity;

public class MainActivity extends AppCompatActivity {

    CardView temp,storage,kilogram,time,area,length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try { this.getSupportActionBar().hide(); } catch (NullPointerException e) { }

        temp = findViewById(R.id.temp);
        storage = findViewById(R.id.storage);
        kilogram = findViewById(R.id.kilogram);
        time = findViewById(R.id.time);
        area = findViewById(R.id.area);
        length = findViewById(R.id.length);

        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), temp_Activity.class);
                startActivity(ob);
            }
        });

        storage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), Storage_Activity.class);
                startActivity(ob);
            }
        });

        kilogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), Weight_Activity.class);
                startActivity(ob);
            }
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), Time_Activity.class);
                startActivity(ob);
            }
        });

        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), Area_Activity.class);
                startActivity(ob);
            }
        });

        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), Length_Activity.class);
                startActivity(ob);
            }
        });
    }
}