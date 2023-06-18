package Codility;

import java.util.ArrayList;
import java.util.List;

public class NABCODE {

    public int solution(int K, int[][] A) {
        // step 1: find list house
        // step 2: check any empty plots -> validate -> count
        int numberLocation = 0;
        List<Integer[]> houses = getHouses(A);
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++) {
                if(A[i][j] != 1 && isSuitableLocation(i,j,houses,K)){
                    numberLocation++;
                    //System.out.println("suitable : " + "[" + i + "," + j + "]");
                }
            }
        }
        return numberLocation;
    }

    private boolean isSuitableLocation(int i, int j, List<Integer[]> houses, int k) {
        Integer[] house;
        for (int l = 0; l < houses.size(); l++) {
            house = houses.get(l);
            if(!isSuitableDistance(i,j, house,k)){
                // there is a house that's not enough close with the location
                return false;
            }
        }
        // it's suitable location
        return true;
    }

    private boolean isSuitableDistance(int i, int j, Integer[] house, int k) {
        if(house.length < 2){
            System.out.println("ERROR in isSuitableDistance");
            return false;
        }
        int distance = Math.abs(house[0] - i) + Math.abs(house[1] - j);
        //System.out.println("distance: " + distance);
        return distance <= k;

    }

    private List<Integer[]> getHouses(int[][] A){
        List<Integer[]> housesList = new ArrayList<>();
        for(int i = 0; i < A.length; i ++){
            for (int j = 0; j < A[0].length; j++) {
                if(A[i][j] == 1){
                    housesList.add(new Integer[]{i,j});
                }
            }
        }
        //System.out.println("housesList.size(): " + housesList.size());
        return housesList;
    }


}
