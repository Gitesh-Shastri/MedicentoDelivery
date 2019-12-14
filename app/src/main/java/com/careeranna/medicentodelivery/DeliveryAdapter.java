package com.careeranna.medicentodelivery;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class DeliveryAdapter extends RecyclerView.Adapter<DeliveryAdapter.DeliveryHolder>  {
    private ArrayList<Deliveryjobs> mDeliveryjobs;
    DeliveryAdapter(ArrayList<Deliveryjobs> deliveryjobs){
        mDeliveryjobs=deliveryjobs;
    }
    @NonNull
    @Override
    public DeliveryAdapter.DeliveryHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.delivery_listiems, viewGroup, false);
        return new DeliveryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DeliveryAdapter.DeliveryHolder deliveryHolder, int i) {
        Deliveryjobs dj=mDeliveryjobs.get(i);
        TextView tw1=deliveryHolder.NumPhramacies;
        tw1.setText(dj.getNumPhramacies());
        TextView tw2=deliveryHolder.Numareas;
        tw2.setText(dj.getNumAreas());
        TextView tw3=deliveryHolder.Time;
        tw3.setText("Time : "+dj.getTime());
    }

    @Override
    public int getItemCount() {
        return mDeliveryjobs.size();
    }
    class  DeliveryHolder extends RecyclerView.ViewHolder {
        public TextView NumPhramacies;
        public TextView Numareas;
        public  TextView Time;
        public DeliveryHolder(@NonNull View itemView) {
            super(itemView);
            NumPhramacies=itemView.findViewById(R.id.numPharmacies);
            Numareas=itemView.findViewById(R.id.numAreas);
            Time =itemView.findViewById(R.id.time1);
        }
    }
}
