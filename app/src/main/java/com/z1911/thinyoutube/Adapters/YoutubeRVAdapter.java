package com.z1911.thinyoutube.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.z1911.thinyoutube.Models.Song;
import com.z1911.thinyoutube.R;
import com.z1911.thinyoutube.Transformations.ImageBlurTransformation;
import com.z1911.thinyoutube.Transformations.ImageCircleCropTransformation;

import java.util.List;

/**
 * Created by nicola on 27/07/2015.
 */
public class YoutubeRVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Song> itemsData;
    private Context context;

    public YoutubeRVAdapter(Context context, List<Song> itemsData) {
        this.context = context;
        this.itemsData = itemsData;
    }

    @Override
    public int getItemViewType(int position) {
        // Just as an example, return 0 or 2 depending on position
        // Note that unlike in ListView adapters, types don't have to be contiguous
        if (position == 0)
            return 0;
        return 1;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {


        if (viewType == 0) {
            return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.empty_row, parent, false));
        }

        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.song_row, null);

        // create ViewHolder

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }


    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, final int position) {

        // - get data from your itemsData at this position
        // - replace the contents of the view with that itemsData

        if (position > 0) {
            ViewHolder view = (ViewHolder) viewHolder;

            view.txtViewTitle.setText(itemsData.get(position).title);

            Picasso.with(context).
                    load(itemsData.get(position).coverImageUrlLocation).
                    transform(new ImageBlurTransformation()).
                    into(view.blurredBackgroundImage);

            Picasso.with(context).
                    load(itemsData.get(position).coverImageUrlLocation).
                    transform(new ImageCircleCropTransformation()).
                    into(view.backgroundImage);
        }

    }


    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return itemsData.size();
    }


    // inner class to hold a reference to each item of RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtViewTitle;
        public ImageView blurredBackgroundImage;
        public ImageView backgroundImage;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            txtViewTitle = (TextView) itemLayoutView.findViewById(R.id.item_title);
            blurredBackgroundImage = (ImageView) itemLayoutView.findViewById(R.id.blurredBackGroundImage);
            backgroundImage = (ImageView) itemLayoutView.findViewById(R.id.backGroundImage);
        }
    }

}
