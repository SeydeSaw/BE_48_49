package lesson23_01_23;

public class Task3Util {

    int[] createArray(int arraySize){
        return new int[arraySize];
    }

    int[] fillArray(int[] arrayForFilling, int startValue, int endValue){

        for (int i = 0; i < arrayForFilling.length; i++) {
            arrayForFilling[i] = (int) (Math.random()*(endValue-startValue) + startValue);
        }

        return arrayForFilling;
    }

    int findMaxElement(int[] workingArray){
        int maxElement = workingArray[0];
        for (int i = 0; i < workingArray.length; i++) {
            if(maxElement < workingArray[i]){
                maxElement = workingArray[i];
            }
        }
        return maxElement;
    }

    int findLastIndexElement(int[] workingArray, int maxElement){
        int serachedIndex = 0;
        for (int i = workingArray.length-1;i >= 0; i--) {
            if(workingArray[i] == maxElement){
                serachedIndex = i;
                break;
            }
        }
        return serachedIndex;
    }


}
