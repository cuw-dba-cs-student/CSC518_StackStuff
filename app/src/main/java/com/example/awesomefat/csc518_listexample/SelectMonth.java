package com.example.awesomefat.csc518_listexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//https://www.flightsfrom.com/PSC/destinations?dateMethod=month&dateFrom=2020-04-01&dateTo=2020-04-30
public class SelectMonth extends AppCompatActivity {
    String cityName, iata;
    String dateFrom, dateTo;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_month);
        String cityName = this.getIntent().getStringExtra("cityName");
        String iata = this.getIntent().getStringExtra("iata");
        Intent i = new Intent(this, AirportMonthActivity.class);
    }

    public void onJanBtn (View v) {
        this.dateFrom = "2019-01-01";
          this.dateTo = "2019-01-31";
        i.putExtra("cityName", cityName);
        i.putExtra("iata", iata);
        i.putExtra("dateFrom", dateFrom);
        i.putExtra("dateTo", dateTo);
        this.startActivity(i);
    }

    public void onFebBtn (View v) {
        dateFrom = "2019-02-01";
          dateTo = "2019-02-28";
        i.putExtra("cityName", cityName);
        i.putExtra("iata", iata);
        i.putExtra("dateFrom", dateFrom);
        i.putExtra("dateTo", dateTo);
        this.startActivity(i);
    }

    public void onMarBtn (View v) {
        dateFrom = "2019-03-01";
        dateTo   = "2019-03-31";
        i.putExtra("cityName", cityName);
        i.putExtra("iata", iata);
        i.putExtra("dateFrom", dateFrom);
        i.putExtra("dateTo", dateTo);
        this.startActivity(i);
    }

    public void onAprBtn (View v) {
        dateFrom = "2019-04-01";
        dateTo   = "2019-04-30";
        i.putExtra("cityName", cityName);
        i.putExtra("iata", iata);
        i.putExtra("dateFrom", dateFrom);
        i.putExtra("dateTo", dateTo);
        this.startActivity(i);
    }

    public void onMayBtn (View v) {
        dateFrom = "2019-05-01";
        dateTo   = "2019-05-31";
        i.putExtra("cityName", cityName);
        i.putExtra("iata", iata);
        i.putExtra("dateFrom", dateFrom);
        i.putExtra("dateTo", dateTo);
        this.startActivity(i);
    }

    public void onJunBtn (View v) {
        dateFrom = "2019-06-01";
        dateTo   = "2019-06-30";
        i.putExtra("cityName", cityName);
        i.putExtra("iata", iata);
        i.putExtra("dateFrom", dateFrom);
        i.putExtra("dateTo", dateTo);
        this.startActivity(i);
    }

    public void onJulBtn (View v) {
        dateFrom = "2019-07-01";
        dateTo   = "2019-07-31";
        i.putExtra("cityName", cityName);
        i.putExtra("iata", iata);
        i.putExtra("dateFrom", dateFrom);
        i.putExtra("dateTo", dateTo);
        this.startActivity(i);
    }

    public void onAugBtn (View v) {
        dateFrom = "2019-08-01";
        dateTo   = "2019-08-31";
        i.putExtra("cityName", cityName);
        i.putExtra("iata", iata);
        i.putExtra("dateFrom", dateFrom);
        i.putExtra("dateTo", dateTo);
        this.startActivity(i);
    }

    public void onSepBtn (View v) {
        dateFrom = "2019-09-01";
        dateTo   = "2019-09-30";
        i.putExtra("cityName", cityName);
        i.putExtra("iata", iata);
        i.putExtra("dateFrom", dateFrom);
        i.putExtra("dateTo", dateTo);
        this.startActivity(i);
    }

    public void onOctBtn (View v) {
        dateFrom = "2019-10-01";
        dateTo   = "2019-10-31";
        i.putExtra("cityName", cityName);
        i.putExtra("iata", iata);
        i.putExtra("dateFrom", dateFrom);
        i.putExtra("dateTo", dateTo);
        this.startActivity(i);
    }
    public void onNovBtn (View v) {
        dateFrom = "2019-11-01";
        dateTo   = "2019-11-30";
        i.putExtra("cityName", cityName);
        i.putExtra("iata", iata);
        i.putExtra("dateFrom", dateFrom);
        i.putExtra("dateTo", dateTo);
        this.startActivity(i);
    }
    public void onDecBtn (View v) {
        dateFrom = "2019-12-01";
        dateTo   = "2019-12-31";
        i.putExtra("cityName", cityName);
        i.putExtra("iata", iata);
        i.putExtra("dateFrom", dateFrom);
        i.putExtra("dateTo", dateTo);
        this.startActivity(i);
    }

}
