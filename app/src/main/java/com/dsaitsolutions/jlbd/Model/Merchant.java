package com.dsaitsolutions.jlbd.Model;


public class Merchant {

    private String businessName;
    private  long discount;
    private String service;
    private String address;
    private String hoursOpen;
    private String daysOpen;
    private long number1;
    private long number2;

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
    public long getDiscount() {
        return discount;
    }

    public void setDiscount(long discount) {
        this.discount = discount;
    }
     public String getService(){
         return  service;
     }
     public void  setService(String service){
         this.service=service;
     }
    public  String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getHoursOpen(){
        return  hoursOpen;
    }
    public  void  setHoursOpen(String hoursOpen){
        this.hoursOpen =hoursOpen;
    }
    public String getDaysOpen(){
        return daysOpen;
    }
    public void setDaysOpen(String daysOpen){

        this.daysOpen = daysOpen;
    }
    public  long getNumber1(){
        return number1;
    }
    public  void setNumber1(long number1){
        this.number1=number1;

    }
    public  long getNumber2(){
        return number2;
    }
    public void  setNumber2(long number2){
        this.number2 = number2;
    }
}
