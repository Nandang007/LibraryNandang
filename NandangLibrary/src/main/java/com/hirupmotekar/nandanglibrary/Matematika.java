package com.hirupmotekar.nandanglibrary;

public class Matematika {
    private double bil1;
    private double bil2;

    public Matematika() {
    }

    public Matematika(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    public double getBil1() {
        return bil1;
    }

    public void setBil1(double bil1) {
        this.bil1 = bil1;
    }

    public double getBil2() {
        return bil2;
    }

    public void setBil2(double bil2) {
        this.bil2 = bil2;
    }

    public double getTambah(){
        return bil1+bil2;
    }
    public double getKurang(){
        return bil1-bil2;
    }

    public double getKali(){
        return bil1*bil2;
    }

    public double getBati(){
        return bil1/bil2;
    }

}
