package com.company.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrray {
    public static void main(String[] args) {
       /* List<Integer> list = new ArrayList<>();
    //    ArrayList<String> w = new ArrayList<>();
        list.add(39);
        list.add(12);
        list.add(9);
        list.add(54);
        list.add(22);
        list.add(1,50);
        list.add(Integer.valueOf(12));
        list.remove(2);
        System.out.println(list);
        for(Integer e: list){
            System.out.println("Element is " +e);
        }

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("Iterator" +it.next());
        }*/

        List<Fortnite> fortniteList = new ArrayList<>();
        fortniteList.add(new Fortnite(1,"p1"));
        fortniteList.add(new Fortnite(2,"p2"));
        fortniteList.add(new Fortnite(3,"p3"));
        System.out.println(fortniteList); // output : p1 1, p2 2
        for(Fortnite e : fortniteList){
            System.out.println(e.getPlayers());
        }

        List<Integer> l = Arrays.asList(2,3,1,5);
       /* Iterator<Fortnite> b = fortniteList.iterator();
        while(b.hasNext()){
            System.out.println(b.next().getPlayers());
        }*/
       // System.out.println(fortniteList.get(0).getpName());
    }
}
class Fortnite{
    public Fortnite(int players, String pName){
        this.players = players;
        this.pName = pName;

    }
    private int players;
    private String pName;
    public String toString(){
        return pName + " " + players;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }
}
