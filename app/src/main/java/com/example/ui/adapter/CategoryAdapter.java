package com.example.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ui.R;
import com.example.ui.model.Datum;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Datum> datumList;
    private static final int TYPE1 = 1;
    private static final int TYPE2 = 2;
    private static final int TYPE3 = 3;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder vh;
        switch (viewType){
            case TYPE1 : {
                vh = new ViewHolderType1(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item1, parent, false)
                );
                break;
            }

            case TYPE2 : {
                vh = new ViewHolderType2(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item1, parent, false)
                );
                break;
            }

            default: vh = new ViewHolderType3(
                    LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item1, parent, false)
            );
        }

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    class ViewHolderType1 extends RecyclerView.ViewHolder{
        public ViewHolderType1(@NonNull View itemView) {
            super(itemView);
        }
    }

    class ViewHolderType2 extends RecyclerView.ViewHolder{
        public ViewHolderType2(@NonNull View itemView) {
            super(itemView);
        }
    }

    class ViewHolderType3 extends RecyclerView.ViewHolder{
        public ViewHolderType3(@NonNull View itemView) {
            super(itemView);
        }
    }
}
