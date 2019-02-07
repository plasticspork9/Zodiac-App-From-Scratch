package com.example.zodiacappfromscratch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DisplayActivity extends AppCompatActivity {
    private ImageView image;
    private TextView sign;
    private TextView date;
    private Button button;
    private static final String ADDRESS = "https://www.astrology.com/horoscope/daily/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        image = findViewById(R.id.zodiac_image_view);
        sign = findViewById(R.id.zodiac_name_view);
        date = findViewById(R.id.zodiac_number_view);
        button = findViewById(R.id.horoscope_button);

        final Intent intent = getIntent();
        String imageUrl = intent.getStringExtra("image");
        final String zodiacName = intent.getStringExtra("name");
        String zodiacNumber = intent.getStringExtra("number");

        sign.setText(zodiacName);
        date.setText(zodiacNumber);
        Picasso.get()
                .load(imageUrl)
                .into(image);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(ADDRESS + zodiacName + ".html");
                Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent1);
            }
        });
    }
}
