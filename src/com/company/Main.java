/*
        THIS WAS CODED BY KORAY CETIN FOR MIS132 - SCHOOL PROJECT
 */
package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Applicant[] applicantArr = new Applicant[4];

        Applicant applicant3 = new Applicant("Koray", "Çetin", 1, 20, 2.20, 50, 8, 8);
        Applicant applicant2 = new Applicant("Hasan", "Çolak", 2, 50, 2.70, 80, 4.5, 9);
        Applicant applicant1 = new Applicant("Ahmet", "Gültekin", 3, 80, 3.30, 70, 3.3, 2);
        Applicant applicant4 = new Applicant("Kemal", "Tahir", 4, 100, 4, 100, 10, 10);

        applicantArr[0] = applicant1;
        applicantArr[1] = applicant2;
        applicantArr[2] = applicant3;
        applicantArr[3] = applicant4;

        System.out.println(Arrays.toString(applicantArr));
        arrSorting(applicantArr,true);

        for (int i = 0; i<applicantArr.length; i++) {
            System.out.println(applicantArr[i]);
        }
    }

    // true means ascending false means descending
    static void arrSorting(Applicant [] array,boolean isTrue){
        if(isTrue){
            Arrays.sort(array);
        }
        else{
            Arrays.sort(array, Collections.reverseOrder());
        }
    }



}
