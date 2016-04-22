package com.example.marcolemmens.csi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CSI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csi);
    }


    public void sendMessage(View view) {
        Intent intent = new Intent(this, ReportActivity.class);
        startActivity(intent);
    }


}
