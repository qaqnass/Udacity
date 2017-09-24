package com.nanoddegree.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Play extends AppCompatActivity {
  Button homeButton;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_play);

    Button homeButton = (Button) findViewById(R.id.homeButoon);
    homeButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(Play.this, MainActivity.class);
        startActivity(intent);
      }
    });


  }
}
