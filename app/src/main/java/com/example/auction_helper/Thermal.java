package com.example.auction_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class Thermal extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String[]> adapter;
    private List<String[]> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artefacts_list);

        listView = findViewById(R.id.listView);

        List<ListItem> data = new ArrayList<>();

        data.add(new ListItem("Глаз", "417p"));
        data.add(new ListItem("Бритва", "41gj"));
        data.add(new ListItem("Капля", "5rog"));
        data.add(new ListItem("Корка", "5rzo"));
        data.add(new ListItem("Кристалл", "gy10"));
        data.add(new ListItem("Иней", "gyln"));
        data.add(new ListItem("Глаз бури", "jkml"));
        data.add(new ListItem("Каблук", "kqoj"));
        data.add(new ListItem("Пламя", "kqp0"));
        data.add(new ListItem("Куриный бог", "qo54"));
        data.add(new ListItem("Солнце", "qoq6"));
        data.add(new ListItem("Мамины бусы", "wglp"));
        data.add(new ListItem("Фаренгейт", "wgwz"));
        data.add(new ListItem("Вихрь", "y5k0"));
        data.add(new ListItem("Волчьи слезы", "y5nz"));
        data.add(new ListItem("Хрусталь", "zyqk"));
        data.add(new ListItem("Огненный шар", "zyw2"));

        ArrayAdapter<ListItem> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);
    }
}