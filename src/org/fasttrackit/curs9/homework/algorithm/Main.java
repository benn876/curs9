package org.fasttrackit.curs9.homework.algorithm;

public class Main {
    public static void main(String[] args) {
        Integer[] myArray = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        maxFrequency(myArray);
    }

    private static void maxFrequency(Integer[] myArray) {
        FrequencyNumber[] frequencyArray = new FrequencyNumber[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            getFrequencyNumber(myArray[i], frequencyArray);
        }
    }

    private static FrequencyNumber getFrequencyNumber(Integer key, FrequencyNumber[] frequencyNumbers) {
        if (frequencyNumbers.length == 0) {
            return new FrequencyNumber(key, 1);
        }
        for (int i = 0; i < frequencyNumbers.length; i++) {
            if (frequencyNumbers[i].getKey().equals(key)) {
                frequencyNumbers[i].increaseCount();
                return frequencyNumbers[i];
            }
        }
        return new FrequencyNumber(key, 1);
    }
}
