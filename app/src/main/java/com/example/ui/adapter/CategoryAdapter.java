package com.example.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ui.R;
import com.example.ui.model.Datum;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Datum> datumList = new ArrayList<>();
    private static final int TYPE0 = 0;
    private static final int TYPE1 = 1;
    private static final int TYPE2 = 2;
    private static final int TYPE3 = 3;
    private static final int TYPE4 = 4;
    private static final int TYPE5 = 5;

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

            case TYPE3 : {
                vh = new ViewHolderType3(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item1, parent, false)
                );
                break;
            }


            case TYPE4 : {
                vh = new ViewHolderType4(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item1, parent, false)
                );
                break;
            }

            case TYPE5 : {
                vh = new ViewHolderType5(
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
        if(holder instanceof ViewHolderType1){
            ((ViewHolderType1) holder).bindView(datumList.get(position));
            return;
        }

        if(holder instanceof ViewHolderType2){
            ((ViewHolderType2) holder).bindView(datumList.get(position));
            return;
        }
    }

    @Override
    public int getItemCount() {
        return datumList.size();
    }

    @Override
    public int getItemViewType(int position) {
        switch (datumList.get(position).getType()){
            case "banner":
                return TYPE0;
            case "histories":
                return TYPE1;

            case "recommendation" : case "newest":
                return TYPE2;

            case "funtoonChoice":
                return TYPE3;

            case "trend":
                return TYPE4;

            case "representCategory":
                return TYPE5;
            default: return 0;
        }
    }

    static class ViewHolderType1 extends RecyclerView.ViewHolder{
        TextView cateName;
        TextView cateOpt;
        public ViewHolderType1(@NonNull View itemView) {
            super(itemView);
            cateName = itemView.findViewById(R.id.cate_name);
            cateOpt = itemView.findViewById(R.id.cate_option);
        }

        void bindView(Datum datum){
            cateName.setText(datum.getTypeName());
            cateOpt.setText("Sửa");
        }
    }

    static class ViewHolderType2 extends RecyclerView.ViewHolder{
        TextView cateName;
        TextView cateOpt;
        public ViewHolderType2(@NonNull View itemView) {
            super(itemView);
            cateName = itemView.findViewById(R.id.cate_name);
            cateOpt = itemView.findViewById(R.id.cate_option);
        }

        void bindView(Datum datum){
            cateName.setText(datum.getTypeName());
            cateOpt.setText("Xem tất cả");
        }
    }

    static class ViewHolderType3 extends RecyclerView.ViewHolder{
        TextView cateName;
        TextView cateOpt;
        public ViewHolderType3(@NonNull View itemView) {
            super(itemView);
        }
    }

    static class ViewHolderType4 extends RecyclerView.ViewHolder{
        TextView cateName;
        TextView cateOpt;
        public ViewHolderType4(@NonNull View itemView) {
            super(itemView);
        }
    }

    static class ViewHolderType5 extends RecyclerView.ViewHolder{
        TextView cateName;
        TextView cateOpt;
        public ViewHolderType5(@NonNull View itemView) {
            super(itemView);
        }
    }

    public void updateListDatum(List<Datum> datumList){
        this.datumList.clear();
        this.datumList.addAll(datumList);
        notifyDataSetChanged();
    }
}
