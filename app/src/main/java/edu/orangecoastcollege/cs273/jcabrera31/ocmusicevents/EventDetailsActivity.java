package edu.orangecoastcollege.cs273.jcabrera31.ocmusicevents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class EventDetailsActivity extends AppCompatActivity {

    private ImageView eventImageView;
    private TextView eventTitleTextView;
    private TextView eventDateDayTextView;
    private TextView eventTimeTextView;
    private TextView eventLocationDayTextView;
    private TextView eventAddress1View;
    private TextView eventAddress2View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String date = intent.getStringExtra("date");
        String time = intent.getStringExtra("time");
        String day = intent.getStringExtra("day");
        String location = intent.getStringExtra("location");
        String address1 = intent.getStringExtra("address1");
        String address2 = intent.getStringExtra("address2");


        String imageFileName = title.replace(" ", "")+".png";

        eventImageView = (ImageView) findViewById(R.id.eventImageView);
        eventTitleTextView = (TextView) findViewById(R.id.eventTitleTextView);
        eventDateDayTextView = (TextView) findViewById(R.id.eventDateDayTextView);
        eventTimeTextView = (TextView) findViewById(R.id.eventTimeTextView);
        eventLocationDayTextView = (TextView) findViewById(R.id.eventLocationTextView);
        eventAddress1View = (TextView) findViewById(R.id.eventAddress1TextView);
        eventAddress2View = (TextView) findViewById(R.id.eventAddress2TextView);

        eventTitleTextView.setText(date);
        eventDateDayTextView.setText(day);
        eventTimeTextView.setText(time);
        eventLocationDayTextView.setText(location);
        eventAddress1View.setText(address1);
        eventAddress1View.setText(address2);


        //load the image from the Assets folder using the AssetManager class

    }
}
