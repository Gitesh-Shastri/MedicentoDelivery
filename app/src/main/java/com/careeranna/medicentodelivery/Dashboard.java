package com.careeranna.medicentodelivery;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;



public class Dashboard extends AppCompatActivity {

    private String data;
    private String dp;
    private String ac;
    private String lo;
    private String dc;
    private ArrayList<AreaNames> ad=new ArrayList<AreaNames>();

    TextView tw1, tw2, tw3;
    
    RecyclerView recyclerView;

    AreaAdapter adapter;
    ProgressBar pb;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
         ArrayList<AreaNames> areas=new ArrayList<AreaNames>();

        tw1=(TextView)findViewById(R.id.deliverypending);
        tw2=(TextView)findViewById(R.id.amountcollected);
        
        tw3=(TextView)findViewById(R.id.lateorder);

        recyclerView= findViewById(R.id.recycle);

        pb = findViewById(R.id.pb);
        TextView jobs=findViewById(R.id.jobs);
        jobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "fd", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Dashboard.this,Jobs.class);
                startActivity(intent);
            }
        });
        TextView packing=findViewById(R.id.packing1);
        packing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Dashboard.this,Packing.class);
                startActivity(i);

            }
        });
        
        Json js= new Json();
        js.execute();


    }

    public class Json extends AsyncTask<Void,Void,Void> {
        @Override
    protected Void doInBackground(Void... voids) {

        try {
            URL url= new URL("https://medicento-api.herokuapp.com/product/delivery?user_email=delivery1.medicento@gmail.com");
            HttpURLConnection httpURLConnection= (HttpURLConnection) url.openConnection();
            InputStream inputStream=httpURLConnection.getInputStream();
            BufferedReader bufferedReader=new BufferedReader( new InputStreamReader(inputStream));
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                data=data+line;
            }
            JSONObject jsonObject=new JSONObject(data);
             dp=jsonObject.getString("delivery_pending");
             dc=jsonObject.getString("delivery_completed");
             ac=jsonObject.getString("collected_amount");
             JSONArray Ja=jsonObject.getJSONArray("area_and_delivery");
            for(int i=0;i<Ja.length();i++){
                JSONObject jo=  Ja.getJSONObject(i);
                ad.add(new AreaNames((jo.getString("area")),jo.getString("No_of_delivery")) );
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        tw1.setText(dp);
        tw2.setText(ac);
        tw3.setText(dc);
        pb.setVisibility(View.GONE);
        recyclerView.setLayoutManager(new LinearLayoutManager(Dashboard.this));
        /*ad.add(new AreaNames("hiiii","hhhhhhhhh"));
        ad.add(new AreaNames("hiiii","hhhhhhhhh"));
        ad.add(new AreaNames("hiiii","hhhhhhhhh"));
        ad.add(new AreaNames("hiiii","hhhhhhhhh"));
        ad.add(new AreaNames("hiiii","hhhhhhhhh"));
        ad.add(new AreaNames("hiiii","hhhhhhhhh"));
        ad.add(new AreaNames("hiiii","hhhhhhhhh"));
        ad.add(new AreaNames("hiiii","hhhhhhhhh"));
        ad.add(new AreaNames("hiiii","hhhhhhhhh"));
        ad.add(new AreaNames("hiiii","hhhhhhhhh"));
        ad.add(new AreaNames("hiiii","hhhhhhhhh"));
        ad.add(new AreaNames("hiiii","hhhhhhhhh"));
        ad.add(new AreaNames("hiiii","hhhhhhhhh"));
        ad.add(new AreaNames("hiiii","hhhhhhhhh"));
        ad.add(new AreaNames("hiiii","hhhhhhhhh"));
        ad.add(new AreaNames("hiiii","hhhhhhhhh"));
        ad.add(new AreaNames("hiiii","hhhhhhhhh"));
        ad.add(new AreaNames("hiiii","hhhhhhhhh"));
        ad.add(new AreaNames("hiiii","hhhhhhhhh"));
        ad.add(new AreaNames("hiiii","hhhhhhhhh"));*/
        adapter=new AreaAdapter(ad);
        recyclerView.setAdapter(adapter);
    }
    }


}
