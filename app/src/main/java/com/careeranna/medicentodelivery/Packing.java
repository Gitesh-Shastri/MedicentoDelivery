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
        Packingadapter packingadapter=new Packingadapter(packdetails);
        packingrcv.setLayoutManager(new LinearLayoutManager(Packing.this));
        packingrcv.setAdapter(packingadapter);
        Button calldist=findViewById(R.id.calldistributor);
        /*calldist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0123456789"));
                startActivity(intent);
            }
        });*/
       /* Button sendorder=findViewById(R.id.sendorder);
        sendorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                smsIntent.setType("vnd.android-dir/mms-sms");
                //smsIntent.putExtra("address", "12125551212");
                smsIntent.putExtra("sms_body","Body of Message");
                startActivity(smsIntent);
            }
        });*/

    }
}
