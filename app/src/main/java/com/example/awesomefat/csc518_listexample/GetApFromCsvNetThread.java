package com.example.awesomefat.csc518_listexample;

import com.google.firebase.database.DatabaseReference;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class GetApFromCsvNetThread extends Thread {
    Airport ap;
    java.util.LinkedList<Airport> apLnkLst = new java.util.LinkedList<>();



    public void run() {
        try {
            DatabaseReference ref = Core.database.getReference("airports");
            URL airportURL = new URL("http://ourairports.com/data/airports.csv");
            HttpURLConnection conn = (HttpURLConnection)airportURL.openConnection();
            Scanner input = new Scanner(conn.getInputStream());

            while(input.hasNextLine()) {
                String [] parts = input.nextLine().split(",");
                if(parts.length >= 14) {
                    ap = new Airport(parts[3],parts[8],parts[9],parts[10],parts[13]);
                    if(ap.iata.length() > 0) {
                        apLnkLst.add(ap);
                        System.out.println("**** City = " + ap.city  + " Country = " + ap.country + " Iata = " + ap.iata + " Name = " + ap.name + " Region = " + ap.region);
                    }
                }
            }
            System.out.println("**** Done refreshing the airports");
            ref.setValue(apLnkLst);
        }
        catch(Exception e)
        {

        }
    }
}

