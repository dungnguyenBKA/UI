package com.example.ui.screen.showdatamvvm;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

import com.example.ui.R;
import com.example.ui.adapter.CategoryAdapter;
import com.example.ui.base.BaseActivity;
import com.example.ui.databinding.HomeBinding;
import com.example.ui.model.cosmic.Datum;
import com.example.ui.screen.showdatamvvm.viewmodel.HomeViewModel;

import java.util.List;

public class HomeActivity extends BaseActivity {
    private Dialog dialog;
    private HomeBinding viewBinding;

    public static void start(Context context) {
        Intent starter = new Intent(context, HomeActivity.class);
        context.startActivity(starter);
    }

    @Override
    public void configView() {
        showLoading();
        final CategoryAdapter adapter = new CategoryAdapter();
        viewBinding.rvListCategoryHome.setAdapter(adapter);
        viewBinding.rvListCategoryHome.setNestedScrollingEnabled(false);
        HomeViewModel viewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        viewModel.getListCate().observe(this, new Observer<List<Datum>>() {
            @Override
            public void onChanged(List<Datum> datumList) {
                adapter.updateListDatum(datumList);
                dialog.cancel();
            }
        });
    }

    @Override
    public ViewBinding getViewBinding() {
        return viewBinding;
    }

    @Override
    public void initViewBinding(LayoutInflater inflater) {
        viewBinding = HomeBinding.inflate(inflater);
    }

    void showLoading() {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_up);
        CardView loadingView = (CardView) View.inflate(this, R.layout.cate_dialog, null);
        loadingView.setAnimation(animation);
        ImageView img = loadingView.findViewById(R.id.ivTypeCategory);
        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in_zoom_out);
        img.setAnimation(zoom);


        dialog = new Dialog(this);
        dialog.setContentView(loadingView,
                new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT)
        );
        dialog.setCanceledOnTouchOutside(false);
        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
        dialog.show();
    }
}