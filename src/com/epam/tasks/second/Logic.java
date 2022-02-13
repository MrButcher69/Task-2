package com.epam.tasks.second;

public class Logic {

    public  boolean FirstPart(int num){
        int a = num / 1000;
        int b = num / 100 % 10;
        int c = num % 100 / 10;
        int d = num % 1000 % 10;
        if((a + b) == (c + d)){
            return true;
        }else {
            return false;
        }
    }

    public  double SecondPart(double a, double b, double c){
        double solution;
        double temp1;
        double temp2;

        if(a == 0.0 || b==0.0){
            return 0.0;
        }

        if(c >=0.0 || a >=0.0){
            return 0.0;
        }

        if(!(b<=(-Math.sqrt(-(4.0*a*c))) || b>=(Math.sqrt(-(4.0*a*c))) )){
            return 0.0;
        }


        temp1 = Math.sqrt(b*b + 4.0 * a* c);
        temp2 = (b + temp1) / 2.0*a;
        solution = temp2 - (Math.pow(a,3.0)*c) + Math.pow(b,-2.0);

        return solution;
    }

    public  double SixPart(double a, double b, double c){
        double max, min, sum;
        if(a>b) max = a; else max = b;
        if(c>max) max = c;
        if(a<b) min = a; else min = b;
        if(c<min) min = c;

        sum = max + min;
        return sum;
    }
}
