package com.example.vediofy;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {


    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.name.setText(items.get(position).getVideoname());
        holder.len.setText(items.get(position).getLength());
        holder.img.setImageResource(items.get(position).getImage());

        holder.url.setOnClickListener((view) ->{

            Intent intent= new Intent( Intent.ACTION_VIEW);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setData(Uri.parse(items.get(position).getUrl()));
            context.startActivity(intent);

//            AlertDialog.Builder alert= new AlertDialog.Builder(context.getApplicationContext());
//            alert.setMessage("demo");
//            alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialogInterface, int i) {
//                    context.startActivity(intent);
//                }
//            });

        });


    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
