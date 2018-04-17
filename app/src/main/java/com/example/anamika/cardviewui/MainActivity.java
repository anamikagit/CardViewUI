package com.example.anamika.cardviewui;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<Data> myData;
    private DataAdapter dataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize the RecyclerView
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        //Set the Layout Manager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Initialize the ArrayList that will contain the data
        myData = new ArrayList<>();

        //Initialize the adapter and set it ot the RecyclerView
        dataAdapter = new DataAdapter(myData, this);
        mRecyclerView.setAdapter(dataAdapter);

        initializeData();
    }
    private void initializeData() {
        //Get the resources from the XML file
        String[] tvLabel = getResources().getStringArray(R.array.tv_label);
        String[] tvDisplay = getResources().getStringArray(R.array.tv_display);
        TypedArray cardImageResources = getResources().obtainTypedArray(R.array.card_images);
        //Clear the existing data (to avoid duplication)
        myData.clear();

        //Create the ArrayList of Sports objects with the titles, images
        // and information about each sport
        for(int i=0; i<tvLabel.length; i++){
            myData.add(new Data(tvLabel[i], tvDisplay[i],
                    cardImageResources.getResourceId(i,0)));
        }

        //Recycle the typed array
        cardImageResources.recycle();

        //Notify the adapter of the change
        dataAdapter.notifyDataSetChanged();

    }
}
