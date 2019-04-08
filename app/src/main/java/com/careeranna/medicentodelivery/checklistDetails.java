package com.careeranna.medicentodelivery;

import java.util.ArrayList;

public class checklistDetails {
    String Pharmacy;
    String orderno;
    String  ordervalue;
    int items;
    ArrayList<Medicinedetails> medicinedetails;
    public checklistDetails(String mPharmacy,String mOrdervalue,String morderno,int mitems,ArrayList<Medicinedetails> med){
        Pharmacy=mPharmacy;
        orderno=morderno;
        ordervalue=mOrdervalue;
        medicinedetails=med;
        items=mitems;
    }

    public ArrayList<Medicinedetails> getMedicinedetails() {
        return medicinedetails;
    }

    public String getOrderno() {
        return orderno;
    }

    public int getItems() {
        return items;
    }

    public String getOrdervalue() {
        return ordervalue;
    }

    public String getPharmacy() {
        return Pharmacy;
    }

}
