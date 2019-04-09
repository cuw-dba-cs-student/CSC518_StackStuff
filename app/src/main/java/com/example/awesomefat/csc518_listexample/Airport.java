package com.example.awesomefat.csc518_listexample;

import java.io.Serializable;

public class Airport implements Serializable
{
    public String name;
    public String country;
    public String region;
    public String city;
    public String iata;

/*    public Airport(String name, String country, String region, String city, String iata)
    {
        this.name = name;
        this.country = country;
        this.region = region;
        this.city = city;
        this.iata = iata;
    }*/

    public Airport(String country, String region, String iata, String name, String city) {
        this.country = country;
        this.region = region;
        this.iata = iata;
        this.name = name;
        this.city = city;
    }

    public Airport()
    {

    }

    public boolean filterApplies(String filterString)
    {
        filterString = filterString.toLowerCase();

        return this.name.toLowerCase().contains(filterString) ||
                this.city.toLowerCase().contains(filterString) ||
                this.region.toLowerCase().contains(filterString) ||
                this.iata.toLowerCase().contains(filterString) ||
                this.country.toLowerCase().contains(filterString);
    }

    public String toString()
    {
        return this.city + " | " + this.region + " | " +  this.country + "(" + this.iata + ")";
    }

    public void display()
    {
        System.out.println("*** " + this.name + "\t" + this.country + "\t" + this.region + "\t" + this.city + "\t" + this.iata);
    }
}
