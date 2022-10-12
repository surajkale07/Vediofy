package com.example.vediofy;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView name,url, len;
    ImageView img;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        img= itemView.findViewById(R.id.img);
        name= itemView.findViewById(R.id.name);
        url= itemView.findViewById(R.id.url);
        len= itemView.findViewById(R.id.len);
    }
}
