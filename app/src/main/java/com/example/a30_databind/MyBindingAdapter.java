package com.example.a30_databind;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class MyBindingAdapter {
    @BindingAdapter("imageDrawable")
    public static void setDrawable(ImageView view, int drawable){
        view.setImageResource(drawable);
    }
}
