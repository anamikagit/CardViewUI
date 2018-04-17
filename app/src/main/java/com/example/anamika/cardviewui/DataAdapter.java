package com.example.anamika.cardviewui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.RecyclerViewHolder> {

private GradientDrawable gradientDrawable;
private ArrayList<Data> myData;
private Context context;

public DataAdapter(ArrayList<Data> myData, Context context) {
        this.myData = myData;
        this.context = context;

        gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.GRAY);
        }

@Override
public DataAdapter.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new RecyclerViewHolder(context, LayoutInflater.from(context).inflate(R.layout.single_row,parent,
        false),gradientDrawable);
        }

@Override
public void onBindViewHolder(DataAdapter.RecyclerViewHolder holder, int position) {
        Data currentData = myData.get(position);
        holder.bindTo(currentData);
        }

@Override
public int getItemCount() {
        return myData.size();
        }

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    private TextView textTimeLabel;
    private TextView textTimeDisplay;
    private ImageView cardViewImage;
    private Context context;
    private Data currentData;
    private GradientDrawable gradientDrawable;

    public RecyclerViewHolder(Context context, View itemView, GradientDrawable gradientDrawable) {
        super(itemView);
        textTimeLabel = itemView.findViewById(R.id.tv_label);
        textTimeDisplay = itemView.findViewById(R.id.tv_display);
        cardViewImage = itemView.findViewById(R.id.card_image);

        this.context = context;
        this.gradientDrawable = gradientDrawable;
    }

    void bindTo(Data currentData) {
        //Populate the textviews with data
        textTimeLabel.setText(currentData.getLabel());
        textTimeDisplay.setText(currentData.getDisplay());

        //Get the current sport
        this.currentData = currentData;


        //Load the images into the ImageView using the Glide library
        Glide.with(context).load(currentData.getImageResource()).apply(new RequestOptions()
                .placeholder(gradientDrawable))
                .into(cardViewImage);
    }

       /* @Override
        public void onClick(View view) {

            //Set up the detail intent
            Intent detailIntent = Data.starter(mContext, mCurrentSport.getTitle(),
                    mCurrentSport.getImageResource());


            //Start the detail activity
            mContext.startActivity(detailIntent);
        }*/
}
}
