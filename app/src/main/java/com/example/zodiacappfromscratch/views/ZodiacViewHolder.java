package com.example.zodiacappfromscratch.views;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.zodiacappfromscratch.DisplayActivity;
import com.example.zodiacappfromscratch.R;
import com.example.zodiacappfromscratch.model.ZodiacModel;

public class ZodiacViewHolder extends RecyclerView.ViewHolder {
    TextView zodiacNameTextView;
    TextView zodiacNumberTextView;
    public ZodiacViewHolder(@NonNull View itemView) {
        super(itemView);

        zodiacNameTextView = itemView.findViewById(R.id.zodiacName);
        zodiacNumberTextView = itemView.findViewById(R.id.zodiacNumber);
    }

    public void onBind(final ZodiacModel zodiacModel){
        zodiacNameTextView.setText(zodiacModel.getName());
        zodiacNumberTextView.setText(zodiacModel.getNumber());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itemView.getContext(), DisplayActivity.class);
                intent.putExtra("name",zodiacModel.getName());
                intent.putExtra("number", zodiacModel.getNumber());
                intent.putExtra("image", zodiacModel.getName());
                itemView.getContext().startActivity(intent);
            }
        });
    }
}
