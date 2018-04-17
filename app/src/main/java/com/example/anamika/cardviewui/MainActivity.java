package com.example.anamika.cardviewui;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Data> dataList;
    private GridCardAdapter gridCardAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        dataList = new ArrayList<>();
        gridCardAdapter = new GridCardAdapter(this, dataList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(gridCardAdapter);

        prepareCards();

        try {
            Glide.with(this).load(R.drawable.sample_1).into((ImageView) findViewById(R.id.card_image));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void prepareCards() {
        int[] covers = new int[]{
                R.drawable.image,
                R.drawable.image,
                R.drawable.image,
                R.drawable.image,
                R.drawable.image,
                R.drawable.image,
                R.drawable.image,
                R.drawable.image,
                R.drawable.image,
                R.drawable.image,};

        Data a = new Data("True Romance", "gg", covers[0]);
        dataList.add(a);

        a = new Data("Xscpae", "hh", covers[1]);
        dataList.add(a);

        a = new Data("Maroon 5", "ygh", covers[2]);
        dataList.add(a);

        a = new Data("Born to Die", "j", covers[3]);
        dataList.add(a);

        a = new Data("Honeymoon", "er", covers[4]);
        dataList.add(a);

        a = new Data("I Need a Doctor", "sd", covers[5]);
        dataList.add(a);

        a = new Data("Loud", "fg", covers[6]);
        dataList.add(a);

        a = new Data("Legend", "c", covers[7]);
        dataList.add(a);

        a = new Data("Hello", "sd", covers[8]);
        dataList.add(a);

        a = new Data("Greatest Hits", "sx", covers[9]);
        dataList.add(a);

        gridCardAdapter.notifyDataSetChanged();
    }

    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
}



