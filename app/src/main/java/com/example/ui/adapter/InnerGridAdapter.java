package com.example.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ui.R;
import com.example.ui.model.cosmic.Content;
import com.example.ui.utils.LoadImage;

import java.util.ArrayList;
import java.util.List;

public class InnerGridAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Content> contentList = new ArrayList<>();

    public void setContentList(List<Content> contentList) {
        this.contentList.clear();
        if(contentList == null){
            notifyDataSetChanged();
            return;
        }
        this.contentList.addAll(contentList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InnerGridVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.item4, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof InnerGridVH){
            ((InnerGridVH) holder).bindView(contentList.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return (contentList == null)? 0 : contentList.size();
    }

    static class InnerGridVH extends RecyclerView.ViewHolder{
        ImageView logoToon;
        TextView nameToon, slug, number;
        public InnerGridVH(@NonNull View itemView) {
            super(itemView);
            logoToon = itemView.findViewById(R.id.logo_toon);
            nameToon = itemView.findViewById(R.id.name_toon);
            slug = itemView.findViewById(R.id.slug_toon);
            number = itemView.findViewById(R.id.number_toon);
        }

        public void bindView(Content content){
            String url = "https://dev-cdn.funtoon.vn/" + content.getVerticalLogo();
            LoadImage.Companion.loadImage(url, logoToon, 20);
            nameToon.setText(content.getComicName());
            slug.setText(content.getCategories().get(0).getCategoryVietName());
            number.setText(String.valueOf(getAdapterPosition()+1));
        }
    }
}

