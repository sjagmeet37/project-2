package com.doctor.jagmeet.starrating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class RateIt extends AppCompatActivity {

    float rating;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_it);

        ratingBar = findViewById(R.id.rating);

    }

    public void rate(View view) {

        rating = ratingBar.getRating();

        Toast.makeText(this,String.valueOf(rating),Toast.LENGTH_SHORT).show();
    }
}
