package com.example;

import java.util.ArrayList;

public class Sfida {
    private ArrayList<Cavallo> cavalli;
    private ArrayList<String> classifica;

    public Sfida(){
        cavalli = new ArrayList<>();
        this.classifica = new ArrayList<>();
    }

    public void aggiungiCavallo(Cavallo c){
        if(cavalli.size() < 20){
            cavalli.add(c);
        }
    }

    public void inizioSfida() {
        for(int i=0; i<20; i++){
            aggiungiCavallo(new Cavallo("Cavallo" + i, classifica));
        }
        for (Cavallo c : cavalli) {
            c.start();
        }
        for (Cavallo c : cavalli) {
            try {
                c.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
