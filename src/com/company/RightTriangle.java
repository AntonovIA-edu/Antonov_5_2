package com.company;

public class RightTriangle {
    int cathet1;
    int cathet2;
    double hypotenuse;
    RightTriangle(int cat1,int cat2){
        this.cathet1 = cat1;
        this.cathet2 = cat2;
    }
    void Calc_hyp()
    {
        hypotenuse=Math.sqrt((cathet1*cathet1)+(cathet2*cathet2));
        System.out.println("Гипотезуна = " + hypotenuse);
    }
}
