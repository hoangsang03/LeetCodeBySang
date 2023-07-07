package Codility;

import java.util.ArrayList;
import java.util.List;

public class NABCODE1 {
    long bigO = 0;

    public int solution(int K, int[][] A) {
        // step 1: find list house
        // step 2: check any empty plots -> validate -> count
        int numberLocation = 0;
        List<Integer[]> houses = getHouses(A);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                bigO++;
                if (A[i][j] != 1 && isSuitableLocation(i, j, houses, K)) {
                    numberLocation++;
                    //System.out.println("suitable : " + "[" + i + "," + j + "]");
                }
                //System.out.println("solution bigO: " + bigO);
            }
        }
        System.out.println("solution bigO: " + bigO);
        return numberLocation;
    }

    public int solution2(int K, int[][] A) {
        // step 1: find list house
        // step 2: check any empty plots -> validate -> count
        int numberLocation = 0;
        List<Integer[]> houses = getHouses2(A);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                bigO++;
                if (A[i][j] != 1 && isSuitableLocation(i, j, houses, K)) {
                    numberLocation++;
                    //System.out.println("suitable : " + "[" + i + "," + j + "]");
                }
                //System.out.println("solution bigO: " + bigO);
            }
        }
        System.out.println("solution bigO: " + bigO);
        return numberLocation;
    }

    public int solution3(int K, int[][] A) {
        // step 1: find list house
        // step 2: check any empty plots -> validate -> count
        int numberLocation = 0;
        List<Integer[]> houses = getHouses3(A);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                bigO++;
                if (A[i][j] != 1 && isSuitableLocation(i, j, houses, K)) {
                    numberLocation++;
                    //System.out.println("suitable : " + "[" + i + "," + j + "]");
                }
                //System.out.println("solution bigO: " + bigO);
            }
        }
        System.out.println("solution bigO: " + bigO);
        return numberLocation;
    }

    private List<Integer[]> getHouses2(int[][] A) {
        List<Integer[]> housesList = new ArrayList<>();
        int rows = A.length;
        int cols = A[0].length;
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                if (A[i][j] != 0) {
                    // first house of row
                    housesList.add(new Integer[]{i, j});
                    for (int k = cols - 1; k > j; k--) {
                        if (A[i][k] != 0) {
                            // last house of row
                            housesList.add(new Integer[]{i, k});
                            break;
                        }
                    }
                    break;
                }
            }
        }
        System.out.println("housesList.size():" + housesList.size());
        return housesList;
    }

    private List<Integer[]> getHouses3(int[][] A) {
        List<Integer[]> housesList = new ArrayList<>();
        int rows = A.length;
        int cols = A[0].length;
        // find first row that has house
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (A[i][j] != 0) {
                    // first house of row
                    found = true;
                    housesList.add(new Integer[]{i, j});
                    System.out.println("A[" + i + "," + j + "]");
                    for (int k = cols - 1; k > j; k--) {
                        if (A[i][k] != 0) {
                            // last house of row
                            housesList.add(new Integer[]{i, k});
                            System.out.println("A[" + i + "," + k + "]");
                            break;
                        }
                    }
                    break;
                }
            }
            if(found){
                break;
            }
        }
        // find last row that has houses
        found = false;
        for (int i = rows - 1; i >= 0; i--) {
            // check any elements in row
            for (int j = 0; j < cols; j++) {
                if (A[i][j] != 0) {
                    // first house of row
                    housesList.add(new Integer[]{i, j});
                    found = true;
                    System.out.println("A[" + i + "," + j + "]");
                    for (int k = cols - 1; k > j; k--) {
                        if (A[i][k] != 0) {
                            // last house of row
                            housesList.add(new Integer[]{i, k});
                            System.out.println("A[" + i + "," + k + "]");
                            break;
                        }
                    }
                    break;
                }
            }
            if(found){
                break;
            }
        }
        // find first columns that has houses
        found = false;
        for (int i = 0; i < cols; i++) {
            // check any elements in column
            for (int j = 0; j < rows; j++) {
                if (A[j][i] != 0) {
                    // first house of column
                    housesList.add(new Integer[]{j, i});
                    found = true;
                    System.out.println("A[" + j + "," + i + "]");
                    for (int k = rows - 1; k > j; k--) {
                        if (A[k][i] != 0) {
                            // last house of row
                            housesList.add(new Integer[]{k, i});
                            System.out.println("A[" + k + "," + i + "]");
                            break;
                        }
                    }
                    break;
                }
            }
            if(found){
                break;
            }
        }
        // find last columns that has houses
        found = false;
        for (int i = cols-1; i >= 0; i--) {
            // check any elements in column
            for (int j = 0; j < rows; j++) {
                if (A[j][i] != 0) {
                    // first house of column
                    housesList.add(new Integer[]{j, i});
                    found = true;
                    System.out.println("A[" + j + "," + i + "]");
                    for (int k = rows - 1; k > j; k--) {
                        if (A[k][i] != 0) {
                            // last house of row
                            housesList.add(new Integer[]{k, i});
                            System.out.println("A[" + k + "," + i + "]");
                            break;
                        }
                    }
                    break;
                }
            }
            if(found){
                break;
            }
        }
        System.out.println("housesList.size():" + housesList.size());
        return housesList;
    }

    private boolean isSuitableLocation(int i, int j, List<Integer[]> houses, int k) {
        for (Integer[] integers : houses) {
            bigO++;
            if (!isSuitableDistance(i, j, integers, k)) {
                // there is a house that's not enough close with the location
                //System.out.println("isSuitableLocation bigO: " + bigO);
                return false;
            }
        }
        //System.out.println("isSuitableLocation bigO: " + bigO);
        // it's suitable location
        return true;
    }

    private boolean isSuitableDistance(int i, int j, Integer[] house, int k) {
        if (house.length < 2) {
            System.out.println("ERROR in isSuitableDistance");
            return false;
        }
        int distance = Math.abs(house[0] - i) + Math.abs(house[1] - j);
        //System.out.println("distance: " + distance);
        return distance <= k;

    }

    private List<Integer[]> getHouses(int[][] A) {
        List<Integer[]> housesList = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                bigO++;
                if (A[i][j] == 1) {
                    housesList.add(new Integer[]{i, j});
                }
            }
        }
        System.out.println("getHouses bigO: " + bigO);
        System.out.println("housesList.size(): " + housesList.size());
        return housesList;
    }


}
