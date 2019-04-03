package com.careeranna.medicentodelivery;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Jobs extends AppCompatActivity {
    private RecyclerView rc,rc3,rc2;

    final private ArrayList<Pendingjobs> pendingjobs=new ArrayList<Pendingjobs>();
    private Jobadapter jobadapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);
        rc=findViewById(R.id.rc);
        pendingjobs.add(new Pendingjobs("delhi","banglore","5 am to 10 am"));
        pendingjobs.add(new Pendingjobs("delhi","banglore","5 am to 10 am"));
        pendingjobs.add(new Pendingjobs("delhi","banglore","5 am to 10 am"));
        pendingjobs.add(new Pendingjobs("delhi","banglore","5 am to 10 am"));
        pendingjobs.add(new Pendingjobs("delhi","banglore","5 am to 10 am"));
        pendingjobs.add(new Pendingjobs("delhi","banglore","5 am to 10 am"));
        pendingjobs.add(new Pendingjobs("delhi","banglore","5 am to 10 am"));
        pendingjobs.add(new Pendingjobs("delhi","banglore","5 am to 10 am"));

        jobadapter=new Jobadapter(pendingjobs);
        rc.setLayoutManager(new LinearLayoutManager(Jobs.this));
        rc.setAdapter(jobadapter);
        jobadapter.setOnItemClickListener(new Jobadapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Toast.makeText(getApplicationContext(), "fd", Toast.LENGTH_SHORT).show();
            }
        });
        if(jobadapter.getItemCount()==0){
            rc.setVisibility(View.GONE);
        }
        rc2=findViewById(R.id.rc2);
        jobadapter=new Jobadapter(pendingjobs);
        rc2.setLayoutManager(new LinearLayoutManager(Jobs.this));
        rc2.setAdapter(jobadapter);
        rc3=findViewById(R.id.rc3);
        jobadapter=new Jobadapter(pendingjobs);
        rc3.setLayoutManager(new LinearLayoutManager(Jobs.this));
        rc3.setAdapter(jobadapter);







    }
}



