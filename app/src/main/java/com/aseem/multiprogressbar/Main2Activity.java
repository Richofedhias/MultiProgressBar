package com.aseem.multiprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aseem.versatileprogressbar.ProgBar;

public class Main2Activity extends AppCompatActivity {
    private ProgBar progBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        progBar = findViewById(R.id.myProgBar);
    }
}
