package Codility;

import java.util.Arrays;

public class NAB {

    public int solution(int[] P, int[] S) {
        // Implement your solution here
        // total people
        int totalPeople = getTotalPeople(P);
        System.out.println("totalPeople: " + totalPeople);
        int totalSeats = getTotalSeat(S);
        System.out.println("totalSeats: " + totalSeats);
        int remainingSeats = totalSeats - totalPeople;
        System.out.println("remainingSeats: " + remainingSeats);
        Arrays.sort(S);
        int numRemainingCars = getNumRemainingCars(S,remainingSeats);
        return S.length - numRemainingCars;
    }

    private int getNumRemainingCars(int[] s, int remainingSeats) {
        for (int i = 0; i < s.length; i++) {
            remainingSeats -= s[i];
            if(remainingSeats == 0){
                return i+1;
            } else if(remainingSeats < 0){
                return i;
            }
        }
        return s.length;
    }

    private int getTotalSeat(int[] s) {
        int total = 0;
        for (int i = 0; i < s.length; i++) {
            total += s[i];
        }
        return total;
    }

    private int getTotalPeople(int[] p) {
        int total = 0;
        for (int i = 0; i < p.length; i++) {
            total += p[i];
        }
        return total;
    }


//    public int solution(String S) {
//        // Implement your solution here
//        int num = 0;
//        char[] chars = S.toCharArray();
//        int indexOfLastX = findIndexOfLastX(chars);
////        int num = getSegmentsInRepairation(chars);
//
//        num = ((indexOfLastX+1) + 2) / 3;
//        return num;
//    }
//
//    private int findIndexOfLastX(char[] chars) {
//        for (int i = chars.length - 1; i >= 0 ; i--) {
//            if(chars[i] == 'X'){
//                return i;
//            }
//        }
//        return -1;
//    }



}
