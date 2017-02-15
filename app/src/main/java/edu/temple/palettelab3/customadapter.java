package edu.temple.palettelab3;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.List;


public class customadapter extends ArrayAdapter<String> {

    //TODO fix this. you shouldn't need to have the array two times
    String[] colors = {"WHITE" , "RED" , "BLUE" , "GREEN" , "GRAY" , "PURPLE"};

    Spinner colorSpinner;
  //  String[] colors = null;//This is the thing you'll pass when you construct it I'm making it null now so that I can reference it down there
//List<String> objects) {
    public customadapter(Context context , int resource , String[] objects) {
        super(context , android.R.layout.simple_list_item_1 , objects);
    }

    @Override
    public View getView(int position , View convertView , ViewGroup parent) {
        View v = super.getView(position , convertView , parent);
        //v.setBackgroundColor(Color.parseColor("RED"));
        //v.setBackgroundColor(Color.parseColor(colorSpinner.getSelectedItem().toString()));
        v.setBackgroundColor(Color.parseColor(colors[position]));
        return v;
    }

    @Override
    public View getDropDownView(int position , View convertView , ViewGroup parent) {
        View v = super.getView(position , convertView, parent);
        //v.setBackgroundColor(Color.parseColor("GREEN"));
        v.setBackgroundColor(Color.parseColor(colors[position]));
        return v;
    }

}
