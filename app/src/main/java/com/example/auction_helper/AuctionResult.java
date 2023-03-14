package com.example.auction_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;

import java.net.MalformedURLException;
import java.net.URL;

public class AuctionResult extends AppCompatActivity implements View.OnClickListener, GetInernetData.AsyncResponse {

    private static final String TAG = "AuctionResult";

    private TextView ArtefactID;

    String inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auction_result);

        ArtefactID = findViewById(R.id.artefactId);

        inputText = getIntent().getStringExtra("inputText");
        TextView textView = findViewById(R.id.artefactId);
        textView.setText(inputText);

        URL url = buildUrl(inputText);

        new GetInernetData(this).execute(url);
    }

    @Override
    public void ProcessFinish(String output) {

    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "onClick: Работает");
            //URL url = new URL("https://eapi.stalcraft.net/EU/auction/id/history");

    }

    private URL buildUrl(String inputText) {
        Log.d(TAG, "аываыа");

        String BASE_URL = "https://eapi.stalcraft.net/EU/auction";
        String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIxNjIiLCJqdGkiOiI0MTNjZTIzYjUwYTExNzFjMzZlNTEzMWVhZTllMjhhMjY3MjkyM2U4M2MzZmJiNjM1MDE5NGMyYzE0NjY4NjI1ZjcyOWViM2EzOTg3ZTQwNiIsImlhdCI6MTY3ODM3MzE3Ni41NTg1NDEsIm5iZiI6MTY3ODM3MzE3Ni41NTg1NDUsImV4cCI6MTcwOTk5NTU3Ni40NjUwNjMsInN1YiI6IiIsInNjb3BlcyI6W119.hkzJvPorVD7Nq2bVnEN13RHFFzacjX_JQtmnHJ8FYVel3mbMbJ7Zi3KbGCJA-VpfezGtPY1mHfW1mM748bfHzdPa21QLlATod39aQk7W2w3WMzQxE78RpdRDe1n71tRdimaGEBHz7eJ61Lmbrb9i1kUmxCy3H8hDFbUSdBOPmLNUCZ4Cqegp6bTlR4uMlrzwI1KysbXmuPNKTy0IWDH3QVdymiMjHDEuxUySPXIdOXZJqUh2DHqEBAnrbwKKrXbTvRsxnuovhlzQYwPeiQDM_GhoY74XaiTXyFW6UJKdJUpnwoWLwbo2DkodjIRyuR6A3I-Fgqc0fc4V6aZaBI79v2kMwCKMhPwxiTnB9TPCnsypNKe1CzezQ-qxnba3ot_ig81nx5Bqb86iOyrurEKU3jrf9TsfaE03mInXs3wr0Zwb-P-Fa3p2CASn7tbWUcv_dVT0Gv00I0V9gt4AIPDN8TdxK-42HO2UbPl8FceSGEYhztbM3-o4wiWSjmUjTijOrRXlbNXHBFQM9y09A8qOa-liEFbLByiJzMASHmNeCbPzUCMBRBO7Ikpip_KYoWRgotIMHc0gaVPcPIq2MjS5SOthWFHLjSKvnWIPDp_hTR0sEOLSIm4AWwuD_BwPV6Yz11ELnC0WYVD6HNjWGiULNpRcV4GlA10QRd844FiSSbc";
        String history = "history";
        String ID = inputText;

        Uri buildUri = Uri.parse(BASE_URL).buildUpon().appendQueryParameter("", token).appendQueryParameter("", ID).appendQueryParameter("", history).build();

        URL url = null;

        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        Log.d(TAG, "ProcessFinished: " + url);

        return url;
    }
}