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
    private static final int INNERTYPE1 = 1;
    private static final int INNERTYPE2 = 2;
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
        //return new InnerVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.item1, parent, false));
        if(viewType == INNERTYPE1){
            return new InnerVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.item1, parent, false));
        }else {
            return new InnerRepresentVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.represent_category_item, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof InnerVH){
            ((InnerVH) holder).bindView(contentList.get(position));
            return;
        }
        if(holder instanceof InnerRepresentVH){
            ((InnerRepresentVH) holder).bindView(contentList.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return (contentList == null)? 0 : contentList.size();
    }

    @Override
    public int getItemViewType(int position) {
        switch (contentList.get(position).getType()){
            case "web_toon":
                return INNERTYPE1;
            default:
                return INNERTYPE2;
        }
    }

    static class InnerVH extends RecyclerView.ViewHolder{
        ImageView logoToon;
        TextView nameToon, chapter;
        public InnerVH(@NonNull View itemView) {
            super(itemView);
            logoToon = itemView.findViewById(R.id.logo_toon);
            nameToon = itemView.findViewById(R.id.name_toon);
            chapter = itemView.findViewById(R.id.chapter);
        }

        public void bindView(Content content){
            String url = "https://dev-cdn.funtoon.vn/" + content.getHorizontalLogo();
            LoadImage.Companion.loadImage(url, logoToon);
            nameToon.setText(content.getComicName());
        }
    }

    static class InnerRepresentVH extends RecyclerView.ViewHolder{
        TextView cate_name;
        TextView option;
        public InnerRepresentVH(@NonNull View itemView) {
            super(itemView);
            cate_name = itemView.findViewById(R.id.rc_cate_name);
            option = itemView.findViewById(R.id.rc_cate_option);
        }

        public void bindView(Content content){
            cate_name.setText(content.getCategoryVietName());
            option.setText("Xem tất cả");
        }
    }
}
