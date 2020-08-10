package com.stratos.syrostownhall;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

import static com.stratos.syrostownhall.PoiActivity.POI_KEY;

public class PoiAdapter extends RecyclerView.Adapter<PoiAdapter.ViewHolder> {
    private static final String TAG = "PoiAdapter";

    private ArrayList<Poi> pois = new ArrayList<>();
    private Context context;


    public PoiAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.poi_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: Called");
        holder.name.setText(pois.get(position).getName());
        holder.description.setText(pois.get(position).getShortDesc());
        Glide.with(context)
                .asBitmap()
                .load(pois.get(position).getImageUrl())
                .into(holder.image);
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PoiActivity.class);
                intent.putExtra(POI_KEY, pois.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return pois.size();
    }

    public void setPois(ArrayList<Poi> pois) {
        this.pois = pois;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

            private MaterialCardView parent;
            private ImageView image;
            private TextView name, description;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                parent = itemView.findViewById(R.id.parent);
                image = itemView.findViewById(R.id.image);
                name = itemView.findViewById(R.id.txtName);
                description = itemView.findViewById(R.id.txtDescription);
        }
    }
}
