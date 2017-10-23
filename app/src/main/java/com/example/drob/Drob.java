package com.example.drob;

import android.widget.TextView;

public class Drob {
    int num;
    int denum;
    public Drob(int i, int i1) {
        num = i;
        denum = i1;
    }



    public Drob mult(Drob dr2){
        return new Drob(num*dr2.num,denum*dr2.denum).simple();
    }

    public Drob sep(Drob dr2){
        return new Drob(num*dr2.denum,denum*dr2.num).simple();
    }

    public Drob min(Drob dr2){
        return new Drob(num*dr2.denum- dr2.num*denum,denum*dr2.denum).simple();
    }

    public Drob plus(Drob dr2){
        return new Drob(num*dr2.denum+ dr2.num*denum,denum*dr2.denum).simple();
    }

    private Drob simple(){
        int a = num;
        int b = (denum>0?denum:denum*-1);
        while (a!=0 && b!=0){
            if (a > b)
                a = a % b;
            else
                b = b % a;}
        a = (a<0?a*-1:a);
        b = (b<0?b*-1:b);
        if(a==0&& b==0)
            a =1;
        if(denum < 0 && num < 0){
            return new Drob(num/(b+a)*-1,denum/(b+a)*-1);
        }
        else
            return new Drob(denum>0?(num / (b+a)):(num / (b+a)*-1),denum>0?(denum / (b+a)):(denum / (b+a)*-1));
    }
}
