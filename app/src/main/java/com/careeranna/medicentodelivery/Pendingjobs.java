package com.careeranna.medicentodelivery;

public  class Pendingjobs{
    private String mDistributor;
    private String mAdress;
    private String mTime;
    /*private   String mpickup;
    private   String mdelivery;
    private String mslot;
    private String mdistance;*/
    public Pendingjobs(String distributor,String adress,String time){
        mDistributor=distributor;
        mAdress=adress;
        mTime=time;
    }

    public String getmAdress() {
        return mAdress;
    }

    public String getmDistributor() {
        return mDistributor;
    }

    public String getmTime() {
        return mTime;
    }
}
