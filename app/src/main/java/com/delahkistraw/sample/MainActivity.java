package com.delahkistraw.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.delahkistraw.utils.GetInformations;
import com.delahkistraw.utils.ValidationsForm;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.email)TextView email;
    @BindView(R.id.Imei) TextView imei;
    @BindView(R.id.phone) TextView phone;
    @BindView(R.id.ismail) TextView ismail;
    @BindView(R.id.isphone) TextView isphone;

    @OnClick(R.id.btn_Imei)
    public void getImei(){

        imei.setText(GetInformations.getIMEI(this));
    }
    @OnClick(R.id.btn_email)
    public void getEmail(){
        String emaill=GetInformations.getEmiailID(this);
        if (ValidationsForm.isValidEmail(emaill)) ismail.setText("YES :D");
        else ismail.setText("No :(");
        email.setText(emaill);
    }
    @OnClick(R.id.btn_phone)
    public void getphone(){
        String phonee=GetInformations.getPhoneNumber(this);
        if (ValidationsForm.isValidPhoneNumber(phonee)) isphone.setText("YES :D");
        else isphone.setText("No :(");
        phone.setText(phonee);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



    }
}
