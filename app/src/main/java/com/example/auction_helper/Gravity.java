package com.example.auction_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class Gravity extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String[]> adapter;
    private List<String[]> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artefacts_list);

        listView = findViewById(R.id.listView);

        List<ListItem> data = new ArrayList<>();

        data.add(new ListItem("Ломоть мяса", "1k4q"));
        data.add(new ListItem("Грави", "1kv2"));
        data.add(new ListItem("Протомедуза", "411r"));
        data.add(new ListItem("Душа", "5r34"));
        data.add(new ListItem("Темная медуза", "5rg1"));
        data.add(new ListItem("Янтарник", "5rpq"));
        data.add(new ListItem("Кровь камня", "9n1w"));
        data.add(new ListItem("Выверт", "9nvy"));
        data.add(new ListItem("Золотая рыбка", "gyg5"));
        data.add(new ListItem("Желчь камня", "gypg5"));
        data.add(new ListItem("Каменный цветок", "gyv6"));
        data.add(new ListItem("Браслет", "kqgy"));
        data.add(new ListItem("Ночная звезда", "wg62"));
        data.add(new ListItem("Черный кристалл", "wgr3"));
        data.add(new ListItem("Остов", "wgzd"));
        data.add(new ListItem("Жильник", "y5jk"));
        data.add(new ListItem("Криоген", "y5m3"));
        data.add(new ListItem("Пружина", "y5yw"));
        data.add(new ListItem("Медуза", "zyly"));
        data.add(new ListItem("Болотный гнилец", "zyo9"));
        data.add(new ListItem("Золотистый грави", "zypm"));

        ArrayAdapter<ListItem> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);
    }
}