package com.company;

public class Rtriangle extends Triangl{
    public boolean Proverka(){
        super.Proverka();
        if ((a==b)&&(a==c)) 
            return true;
        return false;
    }
    public Rtriangle(double a,double b,double c){this.a=a;this.b=b;this.c=c;};

}
