package com.example.vediofy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    boolean doubletap = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView= findViewById(R.id.rvlist);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Sony 4K Demo: Another World","https://youtu.be/xcJtL7QggTI","3:11",R.drawable.img));
        items.add(new Item("COSTA RICA IN 4K 60fps HDR (ULTRA HD)","https://youtu.be/LXb3EKWsInQ","2:00",R.drawable.img2));
        items.add(new Item("LG 4K DEMO HDR 2018 (60FPS) ELBA","https://youtu.be/bON-KPiiNCk","3:12",R.drawable.img3));
        items.add(new Item("2021 LG OLED 8K l Redwoods 8K HDR 60fps","https://youtu.be/EJr3uAQwGek","10",R.drawable.img4));
        items.add(new Item("Sony 4K Demo: Another World","https://youtu.be/xcJtL7QggTI","3.11",R.drawable.img));
        items.add(new Item("COSTA RICA IN 4K 60fps HDR (ULTRA HD)","https://youtu.be/LXb3EKWsInQ","2:00",R.drawable.img2));
        items.add(new Item("LG 4K DEMO HDR 2018 (60FPS) ELBA","https://youtu.be/bON-KPiiNCk","3:12",R.drawable.img3));
        items.add(new Item("2021 LG OLED 8K l Redwoods 8K HDR 60fps","https://youtu.be/EJr3uAQwGek","1:40",R.drawable.img4));
        items.add(new Item("LG 4K DEMO HDR 2018 (60FPS) ELBA","https://youtu.be/bON-KPiiNCk","3:12",R.drawable.img3));
        items.add(new Item("2021 LG OLED 8K l Redwoods 8K HDR 60fps","https://youtu.be/EJr3uAQwGek","1:40",R.drawable.img4));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));

    }

    @Override
    public void onBackPressed() {
        if (doubletap){
            super.onBackPressed();

        }else {
            Toast.makeText(this,"Press Back again to exit app",Toast.LENGTH_SHORT).show();
            doubletap= true;
            Handler handler= new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    doubletap= false;
                }
            },500);
        }

    }
}