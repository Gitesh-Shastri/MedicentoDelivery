package com.careeranna.medicentodelivery;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Checklist_adapter extends RecyclerView.Adapter<Checklist_adapter.checklistholder> {
   private final Context context;
    MedicineAdapter medicineAdapter;
    private Context ct;
    private ArrayList<checklistDetails> checklistDetail;
    public Checklist_adapter(Context mcontext,ArrayList<checklistDetails> cd){
        this.context=mcontext;
        checklistDetail=cd;
    }

    @NonNull
    @Override
    public Checklist_adapter.checklistholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
         ct=viewGroup.getContext();
        LayoutInflater inflater=LayoutInflater.from(ct);
        View view=inflater.inflate(R.layout.checklist_listitems,viewGroup,false);
        return new checklistholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Checklist_adapter.checklistholder checklistholder, int i) {
        checklistDetails c1=checklistDetail.get(i);
        TextView Pharmacy=checklistholder.Pharmacy;
        Pharmacy.setText(c1.getPharmacy());
        TextView orderno=checklistholder.ordernum;
        orderno.setText("Order No :"+c1.getOrderno());
        TextView ordervalue=checklistholder.ordervalue;
        ordervalue.setText("Order value :"+c1.getOrdervalue());
        TextView items=checklistholder.items;
        items.setText("Items :"+c1.getItems());
        ArrayList<Medicinedetails> m1=c1.getMedicinedetails();
        medicineAdapter=new MedicineAdapter(context,m1);
        //checklistholder.checkrc1.setHasFixedSize(true);
        checklistholder.checkrc1.setLayoutManager(new LinearLayoutManager(context));
        checklistholder.checkrc1.setAdapter(medicineAdapter);


    }

    @Override
    public int getItemCount() {
        return checklistDetail.size();
    }
     class checklistholder extends RecyclerView.ViewHolder {
        final public RecyclerView checkrc1;
        public TextView Pharmacy;
        public TextView ordernum;
        public TextView ordervalue;
        public Button dispatch;
        public TextView items;
         public checklistholder(@NonNull View itemView) {
             super(itemView);
             checkrc1=itemView.findViewById(R.id.crc2);
             Pharmacy=itemView.findViewById(R.id.pharmacy1);
             ordernum=itemView.findViewById(R.id.orderno1);
             ordervalue=itemView.findViewById(R.id.ordervalue1);
             dispatch=itemView.findViewById(R.id.dispatch);
             items=itemView.findViewById(R.id.items2);

         }
     }
}
