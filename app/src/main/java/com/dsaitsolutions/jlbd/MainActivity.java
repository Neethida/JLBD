package com.dsaitsolutions.jlbd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dsaitsolutions.jlbd.FBDB.MerchantFBDB;
import com.dsaitsolutions.jlbd.Model.Merchant;

public class MainActivity extends AppCompatActivity {
    Button addButton ;
    EditText NameOfBusiness;
    EditText Discount;
    EditText Service;
    EditText Address;
    EditText HoursOpen;
    EditText DaysOpen;
    EditText PhoneNumber1;
    EditText PhoneNumber2;
    Merchant merchant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NameOfBusiness = (EditText) findViewById(R.id.NameOfBusiness);
        Discount = (EditText) findViewById(R.id.Discount);
        Service = (EditText) findViewById(R.id.Service);
        Address = (EditText) findViewById(R.id.Address);
        HoursOpen = (EditText) findViewById(R.id.HoursOpen);
        DaysOpen = (EditText) findViewById(R.id.DaysOpen);
        PhoneNumber1 = (EditText) findViewById(R.id.PhoneNumber1);
        PhoneNumber2 = (EditText) findViewById(R.id.PhoneNumber2);

         merchant =new Merchant();
        addButton = (Button) findViewById(R.id.addButton);
      addButton.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           String discountValu = Discount.getText().toString().trim();
                                           String mobile1 = PhoneNumber1.getText().toString().trim();
                                           String mobile2 = PhoneNumber2.getText().toString().trim();
                                          merchant.setBusinessName(NameOfBusiness.getText().toString());
                                           if (!discountValu.equals("")) {
                                               merchant.setDiscount(Long.valueOf(Discount.getText().toString()));
                                           }
                                           merchant.setService(Service.getText().toString());
                                           merchant.setAddress(Address.getText().toString());
                                           merchant.setHoursOpen(HoursOpen.getText().toString());
                                           merchant.setDaysOpen(DaysOpen.getText().toString());
                                           if (!mobile1.equals("")) {
                                               merchant.setDiscount(Long.valueOf(PhoneNumber1.getText().toString()));
                                           }
                                           if (!mobile2.equals("")) {
                                               merchant.setDiscount(Long.valueOf(PhoneNumber2.getText().toString()));
                                           }

                                           MerchantFBDB merchantFBDB =new MerchantFBDB();
                                           merchantFBDB.save(merchant);
                                           Toast.makeText(getApplicationContext(), "You clicked on OK", Toast.LENGTH_SHORT).show();
                                       }
                                   }

      );
    }
}
