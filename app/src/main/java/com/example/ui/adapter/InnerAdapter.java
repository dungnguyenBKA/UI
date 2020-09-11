package com.example.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ui.R;
import com.example.ui.model.Content;
import com.example.ui.utils.LoadImage;

import java.util.ArrayList;
import java.util.List;

public class InnerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int TYPE_VERTICAL = 1;
    private static final int TYPE_HORIZOTAL = 2;
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
        if(viewType == TYPE_VERTICAL){
            return new InnerVHVertical(LayoutInflater.from(parent.getContext()).inflate(R.layout.item1, parent, false));
        }else {
            return new InnerVHHorizontal(LayoutInflater.from(parent.getContext()).inflate(R.layout.item3, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof InnerVHVertical){
            ((InnerVHVertical) holder).bindView(contentList.get(position));
            return;
        }

        if(holder instanceof InnerVHHorizontal){
            ((InnerVHHorizontal) holder).bindView(contentList.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return (contentList == null)? 0 : contentList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if(contentList.get(position).getHorizontalLogo() == null){
            return TYPE_VERTICAL;
        }
        return TYPE_HORIZOTAL;
    }

    static class InnerVHVertical extends RecyclerView.ViewHolder{
        ImageView logoToon;
        TextView nameToon, chapter;
        public InnerVHVertical(@NonNull View itemView) {
            super(itemView);
            logoToon = itemView.findViewById(R.id.logo_toon);
            nameToon = itemView.findViewById(R.id.name_toon);
            chapter = itemView.findViewById(R.id.chapter);
        }

        public void bindView(Content content){
            String url = "https://dev-cdn.funtoon.vn/" + content.getVerticalLogo();
            LoadImage.Companion.loadImage(url, logoToon, 20);
            nameToon.setText(content.getComicName());
            if(content.getNewestChapter() == null){
                chapter.setVisibility(View.INVISIBLE);
                return;
            }
            chapter.setText("Chương " + content.getNewestChapter());
        }
    }

    static class InnerVHHorizontal extends RecyclerView.ViewHolder{
        ImageView logoToon;
        TextView nameToon;
        public InnerVHHorizontal(@NonNull View itemView) {
            super(itemView);
            logoToon = itemView.findViewById(R.id.logo_toon);
            nameToon = itemView.findViewById(R.id.name_toon);
        }

        public void bindView(Content content){
            String url = "https://dev-cdn.funtoon.vn/" + content.getHorizontalLogo();
            LoadImage.Companion.loadImage(url, logoToon, 20);
            nameToon.setText(content.getComicName());
        }
    }
}
