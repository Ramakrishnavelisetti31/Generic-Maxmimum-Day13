package com.bdlz.generics;

public class Maximum<E extends Comparable> {

    E value1;
    E value2;
    E value3;

   public Maximum(E value1, E value2, E value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public E findMaximum() {
        return Maximum.findMaximum(value1, value2, value3);
    }

    public static< E extends Comparable> E findMaximum(E value1, E value2, E value3) {

        E max = value1;
        if (value2.compareTo(value1)>0 && value2.compareTo(value3)>0) {
            max = value2;
        } if (value3.compareTo(max) > 0) {
            max = value3;
        }
        return (max);
    }
}