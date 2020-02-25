package com.itschool.examplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {
    final static String[] pets = new String[]{"Барсик", "Мявсик",
            "Мурзик", "Васька", "Веник","Беник", "Барсик",
            "Мявсик", "Мурзик", "Васька", "Веник","Беник",
            "Барсик", "Мявсик", "Мурзик", "Васька", "Веник","Беник",
            "Барсик", "Мявсик", "Мурзик", "Васька", "Веник","Беник",
            "Барсик", "Мявсик", "Мурзик", "Васька", "Веник","Беник"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ListView lw = findViewById(R.id.lv_pets);
        MyAdapter adapter = new MyAdapter(this, pets);
        lw.setAdapter(adapter);
    }
}
