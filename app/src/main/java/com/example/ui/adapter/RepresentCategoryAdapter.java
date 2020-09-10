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

public class RepresentCategoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
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
        public InnerPresenterCategoryVH(@NonNull View itemView) {
            super(itemView);
            cate_option = itemView.findViewById(R.id.rc_cate_option);
            cate_name = itemView.findViewById(R.id.rc_cate_name);
        }

        public void bindView(Content content){
            cate_option.setText("Xem tất cả");
            cate_name.setText(content.getCategoryVietName());
        }
    }
}
