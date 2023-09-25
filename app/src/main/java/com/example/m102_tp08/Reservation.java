package com.example.m102_tp08;

public class Reservation {

    private String nom;

    private int age;

    private boolean isFidele;

    private String typeFormation;

    public Reservation(String n, int age, boolean isFidele, String typeFormation) {
        this.nom = n;
        this.age = age;
        this.isFidele = isFidele;
        this.typeFormation = typeFormation;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String n) {
        this.nom = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFidele() {
        return isFidele;
    }

    public void setFidele(boolean fidele) {
        isFidele = fidele;
    }

    public String getTypeFormation() {
        return typeFormation;
    }

    public void setTypeFormation(String typeFormation) {
        this.typeFormation = typeFormation;
    }


    public Double calculerPrix() {
        if(typeFormation.equals("java")) {
            return 3500.0;

        }

        if(typeFormation.equals("linux")) {

            if(isFidele) {

                return 4300*0.9;

            }

            else return 4300.0;
        }

        if(typeFormation.equals("cisco")) {

            if(isFidele) {

                return 5000*0.9;

            }

            else return 5000.0;
        }


        return 0.0;
    }
}
