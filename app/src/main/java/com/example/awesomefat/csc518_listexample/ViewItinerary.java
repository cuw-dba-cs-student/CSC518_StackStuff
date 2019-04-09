package com.example.awesomefat.csc518_listexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.LinkedList;

public class ViewItinerary extends AppCompatActivity {

    private ArrayAdapter<String> itineraryAdapter;
    private ListView itineraryLV;
    private LinkedList<String> itineraryStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_itinerary);

        this.itineraryAdapter = new ArrayAdapter<String>(this, R.layout.another_row, CoreItinerary.theItineraryStrings);
        this.itineraryLV = (ListView)this.findViewById(R.id.itineraryLV);
        this.itineraryLV.setAdapter(itineraryAdapter);
        //loadStackIntoLinkedList();
        itineraryAdapter.notifyDataSetChanged();
    }

    private void loadStackIntoLinkedList() {
        ItineraryStackNode dest;
        ItineraryStack theItinerary = Core.currentItinerary;

        for(int i = 0; i < theItinerary.getCount(); i++) {
            dest = theItinerary.peek();
            itineraryStrings.addFirst(dest.toString());
            theItinerary.pop();
        }
    }

    @Override
    public void onBackPressed()
    {
        this.finish();
        //super.onBackPressed();
    }
}
