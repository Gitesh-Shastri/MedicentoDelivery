package com.careeranna.medicentodelivery;

public class Deliveryjobs {
    private String numAreas;
    private String numPhramacies;
    private String time;
    Deliveryjobs(String a,String b,String c){
        numAreas=a;
        numPhramacies=b;
        time=c;
    }

    public String getNumAreas() {
        return numAreas;
    }

    public String getNumPhramacies() {
        return numPhramacies;
    }

    public String getTime() {
        return time;
    }
}
