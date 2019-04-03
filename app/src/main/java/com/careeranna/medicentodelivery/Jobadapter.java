package com.careeranna.medicentodelivery;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Jobadapter extends RecyclerView.Adapter<Jobadapter.Jobholder> {
    private ArrayList<Pendingjobs> mPendingjobs;
    private static ClickListener clickListener;


    public Jobadapter(ArrayList<Pendingjobs> pendingjobs) {
        mPendingjobs = pendingjobs;
    }

    @NonNull
    @Override
    public Jobholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.pending_job_listitems, viewGroup, false);
        return new Jobholder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull Jobholder jobholder, int i) {
        Pendingjobs pendingjobs = mPendingjobs.get(i);
        TextView Distibutor = jobholder.mDistributor;
        Distibutor.setText(pendingjobs.getmDistributor());
        TextView add = jobholder.mAddress;
        add.setText(pendingjobs.getmAdress());
        TextView time= jobholder.mtime;
        time.setText(pendingjobs.getmTime());
        //TextView distance = jobholder.mDistance;
        //distance.setText(pendingjobs.getMdistance());
    }

    @Override
    public int getItemCount() {
        return mPendingjobs.size();
    }


    class  Jobholder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView mDistributor;
        public TextView mAddress;
        public TextView mtime;
        //private TextView mDistance;

        public Jobholder(@NonNull View itemView) {

            super(itemView);
            mDistributor = itemView.findViewById(R.id.distributor);
            mAddress = itemView.findViewById(R.id.address);
            mtime=itemView.findViewById(R.id.time);
        }

        @Override
        public void onClick(View v) {
            clickListener.onItemClick(getAdapterPosition(), v);

        }
    }
    public void setOnItemClickListener(ClickListener cl) {
        Jobadapter.clickListener = cl;
    }
    public  interface ClickListener {
        void onItemClick(int position, View v);
    }
}
