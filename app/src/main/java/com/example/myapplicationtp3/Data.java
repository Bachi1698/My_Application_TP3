package com.example.myapplicationtp3;

import java.util.ArrayList;

public class Data
{
    ArrayList<String> planetes;
    private String[] taillePlanetes = {"4900", "12000", "12800", "6800", "144000", "120000", "52000", "50000", "2300"};
   void installePlanetes()
   {
        planetes = new ArrayList<String>();
        planetes.add("Mercure");
        planetes.add("Venus");
        planetes.add("Terre");
        planetes.add("Mars");
        planetes.add("Jupiter");
        planetes.add("Saturne");
        planetes.add("Uranus");
        planetes.add("Neptune");
        planetes.add("Pluton");
    }

    public Data( ) {
       installePlanetes();
    }

    public String[] getTaillePlanetes(){
        return taillePlanetes;
    }

    public ArrayList<String> getPlanetes() {
        return planetes;
    }
}


    //private ArrayList<String> planetes;
    //private String[] taillePlanetes = {"4900", "12000", "12800", "6800", "144000", "120000", "52000", "50000", "2300"};
   /* void installePlanetes() {
        planetes = new ArrayList<String>();
        planetes.add("Mercure");
        planetes.add("Venus");
        planetes.add("Terre");
        planetes.add("Mars");
        planetes.add("Jupiter");
        planetes.add("Saturne");
        planetes.add("Uranus");
        planetes.add("Neptune");
        planetes.add("Pluton");
    }

    public Data( ) {
       installePlanetes();
    }

    public String[] getTaillePlanetes(){
        return taillePlanetes;
    }

    public ArrayList<String> getPlanetes() {
        return planetes;
    }
}
**/

/*
*     private ArrayList<Planete> planetes;

    public Data() {
        //getPlanetes();
    }

    public ArrayList<Planete> getPlanetes() {
        this.planetes = new ArrayList<>();
        planetes.add(new Planete("Mercure", 4900));
        planetes.add(new Planete("Venus", 12000));
        planetes.add(new Planete("Terre", 12800));
        planetes.add(new Planete("Mars", 6800));
        planetes.add(new Planete("Jupiter", 144000));
        planetes.add(new Planete("Saturne", 120000));
        planetes.add(new Planete("Uranus", 52000));
        planetes.add(new Planete("Neptune", 50000));
        planetes.add(new Planete("Pluton", 2300));
        return planetes;
    }
    public int getTaillePlanetes(){

        return getPlanetes().size();
    }

    public ArrayList<String> getTailleListe(){
        ArrayList<String> liste = new ArrayList<String>();
            for(int i = 0; i< planetes.size(); i++){
                liste.add(planetes.get(i).getTaille()+ "");
            }
            return liste;
    }
*/