package com.example.awesomefat.csc518_listexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.LinkedList;

public class ViewItinerary extends AppCompatActivity {

    private ArrayAdapter<String> destinationAdapter;
    private ListView destinationsLV;
    private LinkedList<String> destinationStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_itinerary);

        this.destinationStrings = new LinkedList<String>();
        this.destinationAdapter = new ArrayAdapter<String>(this, R.layout.another_row, destinationStrings);
        this.destinationsLV = (ListView)this.findViewById(R.id.destinationsLV);
        this.destinationsLV.setAdapter(destinationAdapter);
        loadStackIntoLinkedList();
        destinationAdapter.notifyDataSetChanged();
    }

    private void loadStackIntoLinkedList() {
        ItineraryStackNode dest;
        for(int i = 0; i < Core.currentItinerary.getCount(); i++) {
            dest = Core.currentItinerary.peek();
            destinationStrings.addLast(dest.toString());
            Core.currentItinerary.pop();
        }
    }

    @Override
    public void onBackPressed()
    {
        this.finish();
        //super.onBackPressed();
    }
}
