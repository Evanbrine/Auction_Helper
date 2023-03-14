package com.example.auction_helper;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;
import java.net.MalformedURLException;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, GetInernetData.AsyncResponse {

    private Button searchButton;

    private static final String TAG = "MainActivity";
    private EditText searchField;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchField = findViewById(R.id.searchField);

        searchButton = findViewById(R.id.buttonSearch);
        searchButton.setOnClickListener(this);
    }

    @Override
    public void ProcessFinish(String output) {
        Log.d(TAG, "ProcessFinish: "+output);
        try{
            JSONObject resultJSON = new JSONObject(output);
            JSONObject category = resultJSON.getJSONObject("");
        } catch (JSONException e){
            e.printStackTrace();
        }
    }

    public void onClickTextView(View view) throws MalformedURLException {
        int id = view.getId();
        switch (id) {
            case R.id.bio:
                //Log.d(TAG, "onClickTextView: произведен клик на textView1");
                Intent intent = new Intent(MainActivity.this, Biochemical.class);
                startActivity(intent);
                break;
            case R.id.electric:
                //Log.d(TAG, "onClickTextView: произведен клик на textView2");
                intent = new Intent(MainActivity.this, Electrophysical.class);
                startActivity(intent);
                break;
            case R.id.gravity:
                //Log.d(TAG, "onClickTextView: произведен клик на textView3");
                intent = new Intent(MainActivity.this, Gravity.class);
                startActivity(intent);
                break;
            case R.id.thermal:
                //Log.d(TAG, "onClickTextView: произведен клик на textView4");
                intent = new Intent(MainActivity.this, Thermal.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onClick(View view) {
        String inputText = searchField.getText().toString();
        Intent intent = new Intent(MainActivity.this, AuctionResult.class);
        intent.putExtra("inputText", inputText);
        startActivity(intent);

    }
}