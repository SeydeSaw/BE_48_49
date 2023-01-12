package lesson12_01_23.workWithArray;

public class ArrayUtil {

    public int findMaxElement (int[] workingArray){

        int maxElement = workingArray[0];

        for (int i = 0; i < workingArray.length; i++) {

            if (workingArray[i] > maxElement){
                maxElement = workingArray[i];
            }
        }
        return maxElement;
    }

    public int findMinElement (int[] workingArray){

        int minElement = workingArray[0];

        for (int i = 0; i < workingArray.length; i++) {

            if (workingArray[i] < minElement){
                minElement = workingArray[i];
            }
        }
        return minElement;
    }

    public int[] createNewArrayFromOurArray(int[] workingArray, int indexStart, int indexEnd){

        //создаём массив (индекс конечный - индекс начальный и + 1):
        int[] newArray = new int[indexEnd-indexStart+1];

        //заполняем массив данными:
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = workingArray[indexStart+i];
        }
        return newArray;
    }

}
