package com.george.sliceoflife.gloweffectexample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.george.sliceoflife.gloweffectexample.R;
import com.sanojpunchihewa.glowbutton.GlowButton;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MarvelAdaper extends RecyclerView.Adapter<MarvelAdaper.ViewHolder> {
    ArrayList<Integer> marvels;
    Context c;

    public MarvelAdaper(ArrayList<Integer> marvels, Context c) {
        this.marvels = marvels;
        this.c = c;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(c).inflate(R.layout.marvel_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            int itemId = marvels.get(position);
            holder.marvel_image.setImageResource(itemId);
            holder.marvel_image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(c, "Image Clicked :)", Toast.LENGTH_SHORT).show();
                }
            });
    }

    @Override
    public int getItemCount() {
        return marvels.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView marvel_image;
        GlowButton glowButton;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            marvel_image = itemView.findViewById(R.id.marvel_image);
            glowButton = itemView.findViewById(R.id.glowButton);
        }
    }
}
