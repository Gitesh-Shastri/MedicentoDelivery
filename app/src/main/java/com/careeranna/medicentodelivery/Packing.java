package com.careeranna.medicentodelivery;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Packing extends AppCompatActivity {
    private RecyclerView packingrcv;
    final ArrayList<packagingdetails> packdetails= new ArrayList<packagingdetails>();
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packaging);
        packdetails.add(new packagingdetails("vamshi medical","banglore","155788","550","25","5 am 28th feb","Tulsasi"));
        packdetails.add(new packagingdetails("vamshi medical","banglore","155788","550","25","5 am 28th feb","Tulsasi"));
        packdetails.add(new packagingdetails("vamshi medical","banglore","155788","550","25","5 am 28th feb","Tulsasi"));
        packdetails.add(new packagingdetails("vamshi medical","banglore","155788","550","25","5 am 28th feb","Tulsasi"));
        packdetails.add(new packagingdetails("vamshi medical","banglore","155788","550","25","5 am 28th feb","Tulsasi"));
        packdetails.add(new packagingdetails("vamshi medical","banglore","155788","550","25","5 am 28th feb","Tulsasi"));
        packdetails.add(new packagingdetails("vamshi medical","banglore","155788","550","25","5 am 28th feb","Tulsasi"));
        packingrcv=findViewById(R.id.packingrc);
        Packingadapter packingadapter=new Packingadapter(packdetails,Packing.this);
        packingrcv.setLayoutManager(new LinearLayoutManager(Packing.this));
        packingrcv.setAdapter(packingadapter);

    }
}
