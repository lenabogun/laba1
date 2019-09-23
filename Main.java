package com.company;

import java.util.Vector;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a=0,b=0,c=0;
                int k=0,l=0;
        System.out.println("Введите К и L");
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        l = in.nextInt();
        System.out.print("Input a number: ");
        Vector vk = new Vector();
        Vector vl = new Vector();
        for(int i = 0;i < k;i++) {
            a=in.nextDouble();
            b=in.nextDouble();
            c=in.nextDouble();
            vk.add(new Triangl(a,b,c));
        }
        for(int i = 0;i < l;i++) {
            a=in.nextDouble();
            b=in.nextDouble();
            c=in.nextDouble();
            vl.add(new Rtriangle(a,b,c));
        }
        float p=0;
        for(int i = 0;i<k;i++){
            Triangl t = (Triangl)vk.get(i);
            p += t.getP();
        }
        p /= k;
        System.out.println(p);
        double max=0;
        for(int i = 0;i<l;i++) {
            Triangl t = (Triangl)vl.get(i);
            double S = t.getS();
            if(max<S){
                max=S;
            }
        }
        System.out.println(max);
    }
}
