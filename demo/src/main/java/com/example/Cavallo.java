package com.example;

public class Cavallo extends Thread{
    private String numCavallo;

    public Cavallo(String i){
        numCavallo = i;
    }

    public void run(){
        for(int i=0; i<100; i++){
            try {
                Thread.sleep((int) (Math.random() * 10));
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            
        }
    }

    public String getNumeroCavallo(){return numCavallo;}
}