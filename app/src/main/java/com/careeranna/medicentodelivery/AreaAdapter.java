package com.careeranna.medicentodelivery;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AreaAdapter extends RecyclerView.Adapter<AreaAdapter.Myviewholder> {
    private ArrayList<AreaNames> mAreaNames;

    public AreaAdapter(ArrayList<AreaNames> areaNames){
        mAreaNames=areaNames;
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context=viewGroup.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.list_item,viewGroup,false);
        return new Myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder myviewholder, int i) {
        AreaNames areaNames=mAreaNames.get(i);
        TextView area=myviewholder.place;
        area.setText(areaNames.getPlace());
        TextView num=myviewholder.deliveries;
        String b=areaNames.getDeliveries();
        num.setText(""+b);
    }

    @Override
    public int getItemCount() {
        return mAreaNames.size();
    }


    class Myviewholder extends RecyclerView.ViewHolder {
        public TextView place;
        public TextView deliveries;

        public Myviewholder(@NonNull View itemView) {

            super(itemView);
            place=itemView.findViewById(R.id.areanames);
            deliveries=itemView.findViewById(R.id.deliveries);
        }
    }
 /*public AreaAdapter(Activity context, ArrayList<AreaNames> areaNames){
     super(context,0,areaNames);
 }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listItem = convertView;
        AreaNames current=getItem(position);
        if(listItem == null)
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        TextView place=(TextView) listItem.findViewById(R.id.areanames);
        place.setText(current.getPlace());
        TextView num=(TextView) listItem.findViewById(R.id.deliveries);
        num.setText(current.getDeliveries());
        return listItem;
    }*/
}
