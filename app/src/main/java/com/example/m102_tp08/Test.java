package com.example.m102_tp08;

public class Test {

    public static void main(String[] args) {
        // Créer un objet myReser de type
        Reservation myReser = new Reservation("Ali",21,true,"cisco");
        System.out.println(myReser.getNom());

        myReser.setNom("Amine");

        System.out.println(myReser.getNom());

        System.out.println(myReser.calculerPrix());

    }



}
