package com.example.ui.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ui.model.Content;

import java.util.List;

public class RepresentCategoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Content> contentList;
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class RepresentCategoryVH extends RecyclerView.ViewHolder{

        public RepresentCategoryVH(@NonNull View itemView) {
            super(itemView);
        }
    }
}
