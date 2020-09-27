package com.example.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ui.R;
import com.example.ui.model.cosmic.Content;

import java.util.ArrayList;
import java.util.List;

public class RepresentCategoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
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
        return new InnerPresenterCategoryVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.represent_category_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof InnerPresenterCategoryVH){
            ((InnerPresenterCategoryVH) holder).bindView(contentList.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return (contentList == null)? 0 : contentList.size();
    }

    static class InnerPresenterCategoryVH extends RecyclerView.ViewHolder{
        TextView cate_name;
        TextView cate_option;
        RecyclerView innerRv;
        public InnerPresenterCategoryVH(@NonNull View itemView) {
            super(itemView);
            cate_option = itemView.findViewById(R.id.rc_cate_option);
            cate_name = itemView.findViewById(R.id.rc_cate_name);
            innerRv = itemView.findViewById(R.id.list_toon);
        }

        public void bindView(Content content){
            cate_option.setText("Xem tất cả");
            cate_name.setText(content.getCategoryVietName());

            InnerAdapter innerAdapter = new InnerAdapter();
            innerAdapter.setContentList(content.getComics() == null ? content.getNovels() : content.getComics());
            innerRv.setAdapter(innerAdapter);
        }
    }
}
