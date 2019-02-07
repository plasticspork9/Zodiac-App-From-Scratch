package com.example.zodiacappfromscratch.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zodiacappfromscratch.R;
import com.example.zodiacappfromscratch.model.ZodiacModel;
import com.example.zodiacappfromscratch.views.ZodiacViewHolder;

import java.util.List;

public class ZodiacAdapter extends RecyclerView.Adapter<ZodiacViewHolder> {
    private List<ZodiacModel> zodiac;

    public ZodiacAdapter(List<ZodiacModel> zodiac) {
        this.zodiac = zodiac;
    }

    @NonNull
    @Override
    public ZodiacViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View childView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zodiac_itemview,
                viewGroup, false);
        return new ZodiacViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull ZodiacViewHolder zodiacViewHolder, int i) {
        zodiacViewHolder.onBind(zodiac.get(i));
    }

    @Override
    public int getItemCount() {
        return zodiac.size();
    }
}
