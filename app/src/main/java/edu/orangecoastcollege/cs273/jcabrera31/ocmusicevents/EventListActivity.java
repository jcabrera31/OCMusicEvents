package edu.orangecoastcollege.cs273.jcabrera31.ocmusicevents;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static edu.orangecoastcollege.cs273.jcabrera31.ocmusicevents.MusicEvent.details;

public class EventListActivity extends ListActivity {

    ListView eventListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set the adapter (which binds the listView with the data in the MusicEvent.java
        //Since the date in is an array, we use an ArrayAdapter:

        //ArrayAdapter(source, style, data)
        setListAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                MusicEvent.titles));

        //setContentView(R.layout.activity_event_list);
    }


    @Override
    protected void onListItemClick(ListView l, View v, int pos, long id)
    {
        String eventTitle = MusicEvent.titles[pos];
        String eventDetail = details[pos];
        Intent intent = new Intent(this, EventDetailsActivity.class);
        intent.putExtra("title", eventTitle);
        intent.putExtra("details", eventDetail);
        startActivity(intent);

    }
}
