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

}
