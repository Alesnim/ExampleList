package com.itschool.examplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    final static String[] pets = new String[]{"Барсик", "Мявсик",
            "Мурзик", "Васька", "Веник","Беник", "Барсик",
            "Мявсик", "Мурзик", "Васька", "Веник","Беник",
            "Барсик", "Мявсик", "Мурзик", "Васька", "Веник","Беник",
            "Барсик", "Мявсик", "Мурзик", "Васька", "Веник","Беник",
            "Барсик", "Мявсик", "Мурзик", "Васька", "Веник","Беник"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView lw = findViewById(R.id.lv_pets);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_one, pets);
        //ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.pets, R.layout.list_item_one);
        lw.setAdapter(adapter);
        lw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView tw = (TextView) view;
                String str = (String) tw.getText();
                Toast.makeText(getApplicationContext(), str , Toast.LENGTH_SHORT).show();
            }
        });
        Button next = findViewById(R.id.bt_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
            }
        });

    }



}
