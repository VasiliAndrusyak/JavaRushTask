package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }



    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {

        Beach beach  = new Beach("Beach",100,500);
        Beach beach2 = new Beach("Beach 2",200,1000);

        int q = beach.compareTo(beach2);
        System.out.println(q);

    }

    @Override
    public synchronized int compareTo(Beach o) {
        return (int) ((getDistance()-o.distance) - (getQuality()- o.quality ));
    }
}
