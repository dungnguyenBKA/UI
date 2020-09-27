package com.example.ui.adapter;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ui.R;
import com.example.ui.model.cosmic.Datum;
import com.example.ui.utils.LoadImage;

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
            case TYPE0  : {
                vh = new ViewHolderBanner(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.banner, parent, false)
                );
                break;
            }
            case TYPE1 : {
                vh = new ViewHolderType1(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item, parent, false)
                );
                break;
            }

            case TYPE2 : {
                vh = new ViewHolderType2(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item, parent, false)
                );
                break;
            }

            case TYPE3 : {
                vh = new ViewHolderType3(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item, parent, false)
                );
                break;
            }


            case TYPE4 : {
                vh = new ViewHolderType4(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item, parent, false)
                );
                break;
            }

            case TYPE5 : {
                vh = new ViewHolderType5(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.represent_category, parent, false)
                );
                break;
            }

            default: vh = new ViewHolderType3(
                    LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item, parent, false)
            );
        }

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof ViewHolderBanner){
            ((ViewHolderBanner) holder).bindView(datumList.get(position));
            return;
        }

        if(holder instanceof ViewHolderType1){
            ((ViewHolderType1) holder).bindView(datumList.get(position));
            return;
        }

        if(holder instanceof ViewHolderType2){
            ((ViewHolderType2) holder).bindView(datumList.get(position));
            return;
        }

        if(holder instanceof ViewHolderType3){
            ((ViewHolderType3) holder).bindView(datumList.get(position));
            return;
        }

        if(holder instanceof ViewHolderType4){
            ((ViewHolderType4) holder).bindView(datumList.get(position));
            return;
        }

        if(holder instanceof ViewHolderType5){
            ((ViewHolderType5) holder).bindView(datumList.get(position));
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

    static class ViewHolderBanner extends RecyclerView.ViewHolder{
        ImageView bannerIv;
        public ViewHolderBanner(@NonNull View itemView) {
            super(itemView);
            bannerIv = itemView.findViewById(R.id.banner_img);
        }

        void bindView(Datum datum){
            String url = "https://dev-cdn.funtoon.vn/" + datum.getCovers().get(0).getLink();
            LoadImage.Companion.loadImage(url, bannerIv);
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

    static class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        void smoothSwipe(RecyclerView innerRv){
            innerRv.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
                @Override
                public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
                    if (e.getAction() == MotionEvent.ACTION_DOWN &&
                            rv.getScrollState() == RecyclerView.SCROLL_STATE_SETTLING) {
                        rv.stopScroll();
                    }
                    return false;
                }

                @Override
                public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {

                }

                @Override
                public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

                }
            });
        }
    }

    static class ViewHolderType2 extends ViewHolder{
        TextView cateName;
        TextView cateOpt;
        RecyclerView innerRv;
        public ViewHolderType2(@NonNull View itemView) {
            super(itemView);
            cateName = itemView.findViewById(R.id.cate_name);
            cateOpt = itemView.findViewById(R.id.cate_option);
            innerRv = itemView.findViewById(R.id.inner_rv);
        }

        void bindView(Datum datum){
            //this.smoothSwipe(innerRv);
            cateName.setText(datum.getTypeName());
            cateOpt.setText("Xem tất cả");
            InnerAdapter innerAdapter = new InnerAdapter();
            innerRv.setAdapter(innerAdapter);
            innerAdapter.setContentList(datum.getContent());
        }
    }

    static class ViewHolderType3 extends ViewHolder{
        TextView cateName;
        TextView cateOpt;
        RecyclerView innerRv;
        public ViewHolderType3(@NonNull View itemView) {
            super(itemView);
            cateName = itemView.findViewById(R.id.cate_name);
            cateOpt = itemView.findViewById(R.id.cate_option);
            innerRv = itemView.findViewById(R.id.inner_rv);
        }

        void bindView(Datum datum){
            this.smoothSwipe(innerRv);
            cateName.setText(datum.getTypeName());
            cateOpt.setText("Xem tất cả");
            InnerAdapter innerAdapter = new InnerAdapter();
            innerRv.setAdapter(innerAdapter);
            innerAdapter.setContentList(datum.getContent());
        }
    }

    static class ViewHolderType4 extends ViewHolder{
        TextView cateName;
        TextView cateOpt;
        RecyclerView innerRv;
        public ViewHolderType4(@NonNull View itemView) {
            super(itemView);
            cateName = itemView.findViewById(R.id.cate_name);
            cateOpt = itemView.findViewById(R.id.cate_option);
            innerRv = itemView.findViewById(R.id.inner_rv);
        }

        void bindView(Datum datum){
            cateName.setText(datum.getTypeName());
            cateOpt.setText("Xem tất cả");
            InnerGridAdapter innerAdapter = new InnerGridAdapter();
            innerRv.setLayoutManager(new GridLayoutManager(innerRv.getContext(), 3, GridLayoutManager.HORIZONTAL, false));
            innerRv.setAdapter(innerAdapter);
            innerAdapter.setContentList(datum.getContent());
        }
    }

    static class ViewHolderType5 extends ViewHolder{
        RecyclerView innerRv;
        public ViewHolderType5(@NonNull View itemView) {
            super(itemView);
            innerRv = itemView.findViewById(R.id.represent_categorys_rv);
        }

        void bindView(Datum datum){
            RepresentCategoryAdapter innerAdapter = new RepresentCategoryAdapter();
            innerRv.setAdapter(innerAdapter);
            innerAdapter.setContentList(datum.getContent());
        }
    }

    public void updateListDatum(List<Datum> datumList){
        this.datumList.clear();
        this.datumList.addAll(datumList);
        notifyDataSetChanged();
    }
}
