package com.example.hyeon.mobile_programming_class;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class Widgets extends AppCompatActivity {
    //Button button;
    TextView labelUserName;
    EditText txtUserName;
    Button btnBegin;
    CheckBox chkCream, chkSugar;
    Button btnPay;

    RadioGroup radCoffeeType;
    RadioButton radDecaf, radEspresso, radColombian;

    private Context context;
    private int duration = Toast.LENGTH_LONG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets);
        context = getApplicationContext();
       /* button = (Button)findViewById(R.id.myButton);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                updateTime();
            }
        });
*/
        labelUserName= (TextView)findViewById(R.id.helloTxt);
        btnBegin = (Button)findViewById(R.id.btn1);
        txtUserName = (EditText)findViewById(R.id.txtuserName);

        chkCream = (CheckBox)findViewById(R.id.chkCream);
        chkSugar = (CheckBox)findViewById(R.id.chkSugar);
        btnPay = (Button)findViewById(R.id.btnPay);

        btnBegin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String userName = txtUserName.getText().toString();
                if(userName.compareTo("Won Kim") == 0) {
                    labelUserName.setText("OK, Please Wait...");
                    Toast.makeText(context, "Hi! Prof." + userName, duration).show();
                }
                else {
                    Toast.makeText(context, userName + " is not a valid USER", duration).show();
                }
            }
        });
        radCoffeeType = (RadioGroup)findViewById(R.id.radGroupCoffeeType);
        radDecaf = (RadioButton)findViewById(R.id.radDecaf);
        radEspresso = (RadioButton)findViewById(R.id.radEspresso);
        radColombian = (RadioButton)findViewById(R.id.radColombian);
        btnPay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String msg = "Coffee ";
                if(chkCream.isChecked())
                    msg += " & Cream ";
                if(chkSugar.isChecked())
                    msg+= " & Sugar";
                int radioId = radCoffeeType.getCheckedRadioButtonId();
                if(radDecaf.getId() == radioId)
                    msg = "Decaf " + msg;

                if(radEspresso.getId() == radioId)
                    msg = "Espresso " + msg;

                if(radColombian.getId() == radioId)
                    msg = "Colombian " + msg;
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
            }
        });





    }
    /*private void updateTime() {
        button.setText(new Date().toString());
    }*/
}
