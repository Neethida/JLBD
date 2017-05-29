package com.dsaitsolutions.jlbd.FBDB;

import com.dsaitsolutions.jlbd.Model.Merchant;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MerchantFBDB {

    private FirebaseDatabase database;
    private DatabaseReference reference;

    public MerchantFBDB(){

        database = FirebaseDatabase.getInstance();
        reference=database.getReference("jlbd").child("merchant");

    }
    public  void save(Merchant merchant){

           reference.push().setValue(merchant);
    }

}
