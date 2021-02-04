package com.algo;

public class CountingValleys {

    enum LEVELS {SEA, VALLEY, MOUNTAIN}

    public static int countingValleys(int steps, String path) {
        // Write your code here

        LEVELS hikerLevel = LEVELS.SEA;


        int stepsToSeaLevel = 0, valleys = 0, mountains = 0, nextPath = 0;
        char[] pathArray = path.toCharArray();

        for(int i = 0; i < pathArray.length - 1; i++){

            if(Character.valueOf(pathArray[i]).equals('U')){

                System.out.println("Mountain count from index " + i);

                i += getSeaLevelIndex(pathArray, i) - 1;
                mountains++;
                System.out.printf("Mountain count %d @ index %d%n%n--> ", mountains,i );


            }
            else if(Character.valueOf(pathArray[i]).equals('D')){

                System.out.println("Valley count from index " + i);
                i += getSeaLevelIndex(pathArray, i ) -1 ;
                valleys++;
                System.out.printf("Valley count %d @ index %d%n%n--> ", valleys,i );

            }




        }

        return valleys;

    }
    private static int getSeaLevelIndex(char[] pathArray, int index){
        int stepsToSeaLevel = 0, count = 0;
        for(int j = index ; j < pathArray.length ; j++){
            System.out.printf("Path --> %c %s %n", pathArray[j], j);
            if(Character.valueOf(pathArray[j]).equals('U')){
                    stepsToSeaLevel-=1;

                System.out.println("A --> "+stepsToSeaLevel);
            }
            if(Character.valueOf(pathArray[j]).equals('D')){
                stepsToSeaLevel++;
                System.out.println("B --> "+stepsToSeaLevel);
            }
            System.out.println("After each --> "+stepsToSeaLevel);
//
             count++;
            if(stepsToSeaLevel == 0){
                System.out.println(" returning j --> "+count);

                return count;
            }
        }
        System.out.println("Returning 0");
        return 0;
    }


    public static void main(String[] args) {
        String path = "UDDDUDUU";

        int result  = countingValleys(8, path);

        System.out.printf("result %d", result);


    }
}
