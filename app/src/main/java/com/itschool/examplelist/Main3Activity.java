package com.itschool.examplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import com.itschool.examplelist.adapters.MyAdapter;

public class Main3Activity extends AppCompatActivity {
    final static String[] pets = new String[]{"Барсик", "Мявсик",
            "Мурзик", "Васька", "Веник", "Беник", "Барсик",
            "Мявсик", "Мурзик", "Васька", "Веник", "Беник",
            "Барсик", "Мявсик", "Мурзик", "Васька", "Веник", "Беник",
            "Барсик", "Мявсик", "Мурзик", "Васька", "Веник", "Беник",
            "Барсик", "Мявсик", "Мурзик", "Васька", "Веник", "Беник"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ListView lw = findViewById(R.id.lv_pets);
        MyAdapter adapter = new MyAdapter(this, pets);
        lw.setAdapter(adapter);

        Button next = findViewById(R.id.bt_next);

        next.setOnClickListener((view) -> {
            Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
            startActivity(intent);
        });
    }
}
