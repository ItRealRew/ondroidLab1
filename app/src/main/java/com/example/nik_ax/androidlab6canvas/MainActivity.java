package com.example.nik_ax.androidlab6canvas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Draw(this));
        setTitle("Lab Canvas Extended");
    }

}