package com.lexxkit;

public class Main {

    public static void main(String[] args) {
	    // Task 1
        System.out.println("Task 1\n");
        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;

        double[] doubles = {1.57, 7.654, 9.986};

        boolean[] booleans = {true, false};

        // Task 2
        System.out.println("\nTask2\n");
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i]);
            if (i == integers.length - 1) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }

        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i]);
            if (i == doubles.length - 1) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }

        for (int i = 0; i < booleans.length; i++) {
            System.out.print(booleans[i]);
            if (i == booleans.length - 1) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }

        // Task 3
        System.out.println("\nTask 3\n");
        for (int i = integers.length - 1; i >= 0 ; i--) {
            System.out.print(integers[i]);
            if (i == 0) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }

        for (int i = doubles.length - 1; i >= 0 ; i--) {
            System.out.print(doubles[i]);
            if (i == 0) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }

        for (int i = booleans.length - 1; i >= 0 ; i--) {
            System.out.print(booleans[i]);
            if (i == 0) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }

        // Task 4
        System.out.println("\nTask 4\n");
        for (int i = 0; i < integers.length; i++) {
            if(integers[i] % 2 == 1) {
                integers[i] += 1;
            }
            System.out.print(integers[i]);
            if (i == integers.length - 1) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }

    }
}
