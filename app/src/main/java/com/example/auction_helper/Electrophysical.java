package com.example.auction_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class Electrophysical extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String[]> adapter;
    private List<String[]> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artefacts_list);

        listView = findViewById(R.id.listView);

        List<ListItem> data = new ArrayList<>();

        data.add(new ListItem("Бенгальский огонь", "1k96"));
        data.add(new ListItem("Лунный свет", "4lkp"));
        data.add(new ListItem("Снежинка", "5r5g"));
        data.add(new ListItem("Осколок", "5rwq"));
        data.add(new ListItem("Частотный кристалл", "9nd0"));
        data.add(new ListItem("Вспышка", "gyn0"));
        data.add(new ListItem("Спираль", "gyq5"));
        data.add(new ListItem("Гелий", "kqr0"));
        data.add(new ListItem("Дезинтегратор", "wg3p"));
        data.add(new ListItem("Атом", "wg53"));
        data.add(new ListItem("Пустышка", "y54z"));
        data.add(new ListItem("Призма", "y5w3"));
        data.add(new ListItem("Батарейка", "zy32"));
        data.add(new ListItem("Зеркало", "zyrm"));

        ArrayAdapter<ListItem> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);
    }
}