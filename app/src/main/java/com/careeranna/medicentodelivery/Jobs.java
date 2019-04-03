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
    final private ArrayList<Deliveryjobs> deliveryjobs=new ArrayList<Deliveryjobs>();
    final private ArrayList<Deliveryjobs> returnjobs=new ArrayList<Deliveryjobs>();
    private Jobadapter jobadapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);
        rc=findViewById(R.id.rc);
        /*pendingjobs.add(new Pendingjobs("delhi","banglore","5 am to 10 am"));
        pendingjobs.add(new Pendingjobs("delhi","banglore","5 am to 10 am"));
        pendingjobs.add(new Pendingjobs("delhi","banglore","5 am to 10 am"));
        pendingjobs.add(new Pendingjobs("delhi","banglore","5 am to 10 am"));
        pendingjobs.add(new Pendingjobs("delhi","banglore","5 am to 10 am"));
        pendingjobs.add(new Pendingjobs("delhi","banglore","5 am to 10 am"));
        pendingjobs.add(new Pendingjobs("delhi","banglore","5 am to 10 am"));
        pendingjobs.add(new Pendingjobs("delhi","banglore","5 am to 10 am"));*/

        jobadapter=new Jobadapter(pendingjobs);
        rc.setLayoutManager(new LinearLayoutManager(Jobs.this));
        rc.setAdapter(jobadapter);
        rc.addOnItemTouchListener(
                new Rclistener(this, rc , new Rclistener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Toast.makeText(getApplicationContext(), "hihi", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        Toast.makeText(getApplicationContext(), "too long", Toast.LENGTH_SHORT).show();

                    }
                })
        );
        if(jobadapter.getItemCount()==0){
            rc.setVisibility(View.GONE);
            TextView t=findViewById(R.id.op1);
            t.setVisibility(View.GONE);
        }
        deliveryjobs.add(new Deliveryjobs("5","6","8:00AM"));
        deliveryjobs.add(new Deliveryjobs("5","6","8:00AM"));
        deliveryjobs.add(new Deliveryjobs("5","6","8:00AM"));
        deliveryjobs.add(new Deliveryjobs("5","6","8:00AM"));
        deliveryjobs.add(new Deliveryjobs("5","6","8:00AM"));
        deliveryjobs.add(new Deliveryjobs("5","6","8:00AM"));
        deliveryjobs.add(new Deliveryjobs("5","6","8:00AM"));

        rc2=findViewById(R.id.rc2);
        DeliveryAdapter deliveryAdapter=new DeliveryAdapter(deliveryjobs);
        rc2.setLayoutManager(new LinearLayoutManager(Jobs.this));
        rc2.setAdapter(deliveryAdapter);
        rc2.addOnItemTouchListener(
                new Rclistener(this, rc , new Rclistener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Toast.makeText(getApplicationContext(), "hihi", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        Toast.makeText(getApplicationContext(), "too long", Toast.LENGTH_SHORT).show();

                    }
                })
        );

        if(deliveryAdapter.getItemCount()==0){
            rc2.setVisibility(View.GONE);
            TextView t=findViewById(R.id.d1);
            t.setVisibility(View.GONE);
        }



        returnjobs.add(new Deliveryjobs("5","8","10:00 Am"));
        returnjobs.add(new Deliveryjobs("5","8","10:00 Am"));
        returnjobs.add(new Deliveryjobs("5","8","10:00 Am"));
        returnjobs.add(new Deliveryjobs("5","8","10:00 Am"));
        rc3=findViewById(R.id.rc3);
        DeliveryAdapter returnadapter=new DeliveryAdapter(returnjobs);
        rc3.setLayoutManager(new LinearLayoutManager(Jobs.this));
        rc3.setAdapter(returnadapter);
        rc3.addOnItemTouchListener(
                new Rclistener(this, rc , new Rclistener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Toast.makeText(getApplicationContext(), "hihi", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        Toast.makeText(getApplicationContext(), "too long", Toast.LENGTH_SHORT).show();

                    }
                })
        );
        if(returnadapter.getItemCount()==0){
            rc3.setVisibility(View.GONE);
            TextView t=findViewById(R.id.rp1);
            t.setVisibility(View.GONE);
        }

    }
}



