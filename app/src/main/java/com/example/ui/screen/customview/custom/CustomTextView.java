package com.example.ui.screen.customview.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.ui.R;

public class CustomTextView extends LinearLayout {
    OnClickListener listener;
    ImageView imageView;
    TextView textView;
    public CustomTextView(@NonNull Context context) {
        super(context);
    }

    public CustomTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public void setText(String text){
        textView.setText(text);
        invalidate();
        requestLayout();
    }

    private void init(Context context, AttributeSet attrs){
        imageView = this.findViewById(R.id.ivIcon);
        textView = this.findViewById(R.id.tvTitle);
        inflate(context, R.layout.custom_text_view, this);
        TypedArray attributes = context.obtainStyledAttributes(attrs, R.styleable.CustomTextView);
        textView.setText(attributes.getString(R.styleable.CustomTextView_text));
        textView.setTextColor(attributes.getColor(R.styleable.CustomTextView_textColor, getResources().getColor(R.color.textBlack)));
        attributes.recycle();
    }

    @Override
    public void setOnClickListener(@Nullable OnClickListener l) {
        this.listener = l;
    }

    public OnClickListener getListener() {
        return listener;
    }

    @Override
    public boolean callOnClick() {
        if(listener != null){
            listener.onClick(this);
            return true;
        }
        return false;
    }
}
