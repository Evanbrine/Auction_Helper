package com.example.auction_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class Biochemical extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String[]> adapter;
    private List<String[]> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artefacts_list);

        listView = findViewById(R.id.listView);

        List<ListItem> data = new ArrayList<>();

        data.add(new ListItem("Кристальная колючка", "1kdg"));
        data.add(new ListItem("Светляк", "4lml"));
        data.add(new ListItem("Слизь", "5r04"));
        data.add(new ListItem("Стальной колобок", "5rd1"));
        data.add(new ListItem("Колючка", "9nml"));
        data.add(new ListItem("Морской еж", "gy06"));
        data.add(new ListItem("Кислый кристалл", "gyjg"));
        data.add(new ListItem("Плёнка", "jkj4"));
        data.add(new ListItem("Улитка", "kqj3"));
        data.add(new ListItem("Многогранник", "ljpq"));
        data.add(new ListItem("Пузырь", "qo59"));
        data.add(new ListItem("Слюда", "wgvd"));
        data.add(new ListItem("Слизняк", "y5vw"));
        data.add(new ListItem("Колобок", "zy7y"));
        data.add(new ListItem("Кисель", "zyv9"));

        ArrayAdapter<ListItem> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);
    }
}