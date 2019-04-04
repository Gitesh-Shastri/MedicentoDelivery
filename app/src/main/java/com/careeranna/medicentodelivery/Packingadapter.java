package com.careeranna.medicentodelivery;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Packingadapter extends RecyclerView.Adapter<Packingadapter.Packingholder> {
    final private ArrayList<packagingdetails> pd;
    public Packingadapter(ArrayList<packagingdetails> ss){
        pd=ss;
    }
    @NonNull
    @Override
    public Packingholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.packaging_listitems, viewGroup, false);
        return new Packingholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Packingholder packingholder, int i) {
        packagingdetails p=pd.get(i);
        TextView tw1=packingholder.phramacyName;
        tw1.setText(p.getPhramacyName());
        TextView tw2=packingholder.area;
        tw2.setText(p.getArea());
        TextView tw3=packingholder.orderAmount;
        tw3.setText(p.getOrderAmount());
        TextView tw4=packingholder.orderNo;
        tw4.setText(p.getOrderNo());
        TextView tw5=packingholder.items;
        tw5.setText(p.getItems());
        TextView tw6=packingholder.distributor;
        tw6.setText(p.getDistributor());
        TextView tw7=packingholder.deliveryby;
        tw7.setText(p.getDeliveryby());
    }

    @Override
    public int getItemCount() {
        return pd.size();
    }

    public class Packingholder extends RecyclerView.ViewHolder {
        public TextView phramacyName;
        public TextView area;
        public TextView orderNo;
        public TextView orderAmount;
        public TextView items;
        public TextView deliveryby;
        public TextView distributor;
        public Packingholder(@NonNull View itemView) {
            super(itemView);
            area=itemView.findViewById(R.id.area1);
            orderAmount=itemView.findViewById(R.id.orderamt);
            orderNo=itemView.findViewById(R.id.orderno);
            items=itemView.findViewById(R.id.items1);
            deliveryby=itemView.findViewById(R.id.deliverby);
            distributor=itemView.findViewById(R.id.distributor);
            phramacyName=itemView.findViewById(R.id.phramacies);

        }
    }
}
