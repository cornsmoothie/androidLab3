package edu.temple.palettelab3;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import static edu.temple.palettelab3.R.id.activity_palette;

public class PaletteActivity extends AppCompatActivity {

    Spinner colorSpinner;
    String[] colors = {"WHITE" , "RED" , "BLUE" , "GREEN" , "GRAY" , "PURPLE"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        colorSpinner = (Spinner) findViewById(R.id.spinnerOfColor);

        final RelativeLayout pallette_activity = (RelativeLayout) findViewById(R.id.activity_palette);

        final customadapter colorAdapter = new customadapter(PaletteActivity.this , android.R.layout.simple_list_item_1 , colors);

        colorSpinner.setAdapter(colorAdapter);

        AdapterView.OnItemSelectedListener spinnerListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(PaletteActivity.this, colorSpinner.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                pallette_activity.setBackgroundColor(Color.parseColor(colorSpinner.getSelectedItem().toString()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };


        colorSpinner.setOnItemSelectedListener(spinnerListener);
    }
}

