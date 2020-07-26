package tr.com.testing;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        String[] countries = {"Turkey", "Netherlands", "Englands"};
        Arrays.sort(countries);
        Arrays.binarySearch(countries, "Turkey");
        String orderedCountries = Arrays.toString(countries);
        System.out.println(orderedCountries);
    }

    public static void sortArray(String[] countries, String abc){
        countries = new String[] {"Gencer", "Ahmet"};

    }
}
