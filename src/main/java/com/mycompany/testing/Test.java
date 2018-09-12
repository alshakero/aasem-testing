package com.mycompany.testing;

/**
 *
 * @author Aasem
 */
public class Test {
    //[5,6,7,8] ,length =4 
    //0,1,2

    public int SayZero() {
        return 0;
    }

    public int[] LastThree(int[] args) {
        if (args.length < 3) {
            throw new IndexOutOfBoundsException("Array too short");

        }

        int index = 0;

        int[] Elements = new int[3];
        for (int i = args.length - 3; i < args.length; i++) {
            Elements[index++] = args[i];
        }
        return Elements;

    }

    public int MaxItem(int[] Myarray) {

        int MaxItem = 0;
        for (int i = 0; i < Myarray.length; i++) {
            if (MaxItem < Myarray[i]) {
                MaxItem = Myarray[i];
            }
        }
        return MaxItem;
    }

    public int MinItem(int[] Myarray) {
        int MinItem = 999999;
        for (int i = 0; i < Myarray.length; i++) {
            if (MinItem > Myarray[i]) {
                MinItem = Myarray[i];
            }
        }
        return MinItem;
    }

    public double AvarageItem(int[] Myarray) {
        double Avg;
        double arrsum = 0;

        for (int i = 0; i < Myarray.length; i++) {
            arrsum += Myarray[i];

        }
        Avg = arrsum / Myarray.length;
        return Avg;
    }

    public String ReversString(String MyText) {
 
        
        String RevText = new StringBuffer(MyText).reverse().toString();
        return RevText;
   
   
    }
}
