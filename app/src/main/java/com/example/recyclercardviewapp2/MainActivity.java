package com.example.recyclercardviewapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GameAdapter.ItemClicked{

    ImageView tvView;
    TextView tvName, tvRelease, tvType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.tvName);
        tvRelease = findViewById(R.id.tvRelease);
        tvType = findViewById(R.id.tvType);
        tvView = findViewById(R.id.tvView);
    }

    @Override
    public void onItemClicked(int index) {
        tvName.setText(ApplicationClass.games.get(index).getName());
        tvType.setText(ApplicationClass.games.get(index).getType());
        tvRelease.setText(ApplicationClass.games.get(index).getRelease());
    }
}