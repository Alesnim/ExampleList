package com.itschool.examplelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;
import android.widget.TextView;

import com.itschool.examplelist.adapters.MyDataBiningAdapter;
import com.itschool.examplelist.cats.Cat;
import com.itschool.examplelist.databinding.ActivityMain4Binding;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain4Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main4);
        final ArrayList<Cat> cats = new ArrayList<>();
        final MyDataBiningAdapter<Cat> adapter = new MyDataBiningAdapter<>(cats);
        cats.add(new Cat("Барсик"));
        cats.add(new Cat("Мявзик"));
        cats.add(new Cat("Мурсик"));
        cats.add(new Cat("Васька"));
        cats.add(new Cat("Веник"));
        cats.add(new Cat("Бублик"));
        cats.add(new Cat("Рыжик"));
        cats.add(new Cat("Барсик"));
        cats.add(new Cat("Мявзик"));
        cats.add(new Cat("Не придумал имя"));
        cats.add(new Cat("Не придумал имя 2"));
        cats.add(new Cat("Не придумал имя 3"));
        binding.listCats.setAdapter(adapter);
    }
}