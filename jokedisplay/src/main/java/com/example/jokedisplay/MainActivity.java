package com.example.jokedisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        joke = getIntent().getExtras().getString("joke", "");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();
        finish();
    }
}
