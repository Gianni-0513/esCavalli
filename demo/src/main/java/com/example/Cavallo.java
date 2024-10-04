package com.example;

import java.util.ArrayList;

public class Cavallo extends Thread{
    private String numCavallo;
    private ArrayList<String> classifica;

    public Cavallo(String i, ArrayList<String> classifica){
        numCavallo = i;
        this.classifica = classifica;
    }

    public void run(){
        for(int i=0; i<100; i++){
            try {
                Thread.sleep((int) (Math.random() * 10));
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            
        }
        classifica.add(numCavallo);
    }

    public String getNumeroCavallo(){return numCavallo;}
}