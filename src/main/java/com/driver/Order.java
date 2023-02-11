package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order() {

    }

    public Order(String id, String deliveryTime) {

        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM

        this.id=id;
        this.deliveryTime= (Integer.parseInt(deliveryTime.substring(0,2)) * 60 )+
                Integer.parseInt(deliveryTime.substring(3) );
    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}

    public static String getDeliveryTimeAsString(int timeInt){
        int hours=timeInt/60;
        int min=timeInt%60;
        String time="";

        if(hours<10){
            time=time+"0"+hours+":";
        }
        else{
            time=time+hours+":";
        }

        if(min<10){
            time=time+"0"+min;
        }
        else{
            time=time+min;
        }

        return time;
    }

    public static int getDeliveryTimeAsInt(String timeString){

        return (Integer.parseInt(timeString.substring(0,2)) * 60 )+
                Integer.parseInt(timeString.substring(3) );
    }
}
