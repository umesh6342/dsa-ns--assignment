package com.recurtion;

public class sourcDes {

    public static void reachHome(int src, int dest){
//        System.out.println("source"     + src + " " +    "destination" +dest);

        if (src==dest){
            System.out.println("pahuch gya");
           return ;
        }
//        src++;
        reachHome(src+1,dest);
        // recurtion is function when it calls itself to drive itself recurtion is basically used in a particular way to solve and

    }


    public static void main(String[] args) {
        int dest = 10;
        int src= 1;
        reachHome(src,dest);

    }
}
