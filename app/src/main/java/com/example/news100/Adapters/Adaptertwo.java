package com.example.news100.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.news100.ModelA;
import com.example.news100.R;
import com.example.news100.WebViewa;

import java.util.ArrayList;

public class Adaptertwo extends RecyclerView.Adapter<Adaptertwo.Viewholder> {


    Context context;
    ArrayList<ModelA> modelclassarraylist;

    public Adaptertwo(Context context, ArrayList<ModelA> modelclassarraylist) {
        this.context = context;
        this.modelclassarraylist = modelclassarraylist;
    }

    @NonNull
    @Override
    public Adaptertwo.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, null, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptertwo.Viewholder holder, int position) {


        holder.mcardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, WebViewa.class);
                intent.putExtra("url", modelclassarraylist.get(position).getUrl());
                context.startActivity(intent);
            }
        });
        holder.mtime.setText(modelclassarraylist.get(position).getPublishedAt());
        holder.mauther.setText(modelclassarraylist.get(position).author);
        holder.mheading.setText(modelclassarraylist.get(position).title);
        holder.mcontent.setText(modelclassarraylist.get(position).description);
        Glide.with(context).load(modelclassarraylist.get(position).getUrlToImage()).into(holder.mimageView);


    }

    @Override
    public int getItemCount() {
        return modelclassarraylist.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        CardView mcardView;
        TextView mheading, mcontent, mauther, mtime;

        ImageView mimageView;


        public Viewholder(@NonNull View itemView) {
            super(itemView);

            mcardView = itemView.findViewById(R.id.cardview01);
            mheading = itemView.findViewById(R.id.item_text);
            mcontent = itemView.findViewById(R.id.itemcontext);
            mauther = itemView.findViewById(R.id.itemauthor);
            mtime = itemView.findViewById(R.id.itemPublishat);
            mimageView = itemView.findViewById(R.id.itemimage);


        }
    }
}
