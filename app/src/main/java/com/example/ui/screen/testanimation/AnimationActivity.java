package com.example.ui.screen.testanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.ui.R;

public class AnimationActivity extends AppCompatActivity {

    ImageView imgBoy;
    ImageView imgGirl;

    public static void start(Context context) {
        Intent starter = new Intent(context, AnimationActivity.class);
        context.startActivity(starter);
    }

    boolean click = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        imgBoy = findViewById(R.id.img_boy);
        imgGirl = findViewById(R.id.img_girl);

        imgBoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAnim(imgBoy);
            }
        });
    }

    void showAnim(ImageView iv){
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_up);
        CardView loadingView = (CardView) View.inflate(this, R.layout.cate_dialog, null);
        loadingView.setAnimation(animation);
        ImageView img = loadingView.findViewById(R.id.ivTypeCategory);
        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in_zoom_out);
        img.setAnimation(zoom);


        Dialog dialog = new Dialog(this);
        dialog.setContentView(loadingView,
                new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT)
        );
        dialog.setCanceledOnTouchOutside(true);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }
}