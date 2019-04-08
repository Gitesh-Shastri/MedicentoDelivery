package com.careeranna.medicentodelivery;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class Checklist extends AppCompatActivity {

     RecyclerView crc1;
   final private ArrayList<checklistDetails> cd=new ArrayList<checklistDetails>();
   final private ArrayList<Medicinedetails> md =new ArrayList<Medicinedetails>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);
        crc1=findViewById(R.id.crc1);
        md.add(new Medicinedetails("crocin","500mg",5,8));
        md.add(new Medicinedetails("crocing","500mg",5,8));
        md.add(new Medicinedetails("croci","500mg",5,8));
        md.add(new Medicinedetails("crocinl","500mg",5,8));
        /*md.add(new Medicinedetails("crocin","500mg",5,8));
        md.add(new Medicinedetails("crocin","500mg",5,8));
        md.add(new Medicinedetails("crocin","500mg",5,8));
        md.add(new Medicinedetails("crocin","500mg",5,8));*/
        cd.add(new checklistDetails("AP phrama","5000","8778",5,md));
        cd.add(new checklistDetails("AP phrama","5000","8778",5,md));
        cd.add(new checklistDetails("AP phrama","5000","8778",5,md));
        cd.add(new checklistDetails("AP phrama","5000","8778",5,md));
        cd.add(new checklistDetails("AP phrama","5000","8778",5,md));
        cd.add(new checklistDetails("AP phrama","5000","8778",5,md));
        cd.add(new checklistDetails("AP phrama","5000","8778",5,md));
        cd.add(new checklistDetails("AP phrama","5000","8778",5,md));
        cd.add(new checklistDetails("AP phrama","5000","8778",5,md));
        cd.add(new checklistDetails("AP phrama","5000","8778",5,md));
        cd.add(new checklistDetails("AP phrama","5000","8778",5,md));
        cd.add(new checklistDetails("AP phrama","5000","8778",5,md));

        Checklist_adapter checklist_adapter=new Checklist_adapter(this,cd);
        final LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        crc1.setLayoutManager(linearLayoutManager);
        //crc1.setHasFixedSize(true);
        crc1.setAdapter(checklist_adapter);
       crc1.addOnItemTouchListener(new Rclistener(this, crc1, new Rclistener.OnItemClickListener() {
           @Override
           public void onItemClick(View view, int position) {
                //RecyclerView rc=findViewById(R.id.crc1);
               View v=linearLayoutManager.findViewByPosition(position);


               LinearLayout l=v.findViewById(R.id.nonexpandle);
               l.setVisibility(View.GONE);
               LinearLayout p=v.findViewById(R.id.expandablelist);
               p.setVisibility(View.VISIBLE);
           }

           @Override
           public void onLongItemClick(View view, int position) {

           }
       }));

    }
}
