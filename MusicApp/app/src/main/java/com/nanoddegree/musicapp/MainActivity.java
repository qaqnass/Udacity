package com.nanoddegree.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    TextView classic = (TextView) findViewById(R.id.classic);
    TextView rock = (TextView) findViewById(R.id.rock);

    classic.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent  intent = new Intent(MainActivity.this, Classic.class);
        startActivity(intent);
      }
    });

    rock.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent  intent = new Intent(MainActivity.this, Rock.class);
        startActivity(intent);
      }
    });
  }
}
