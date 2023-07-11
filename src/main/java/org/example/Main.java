package org.example;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        double[] list = {1.5, 2.7, 3.2, 4.8, 5.6};
        double toplam = 0;

        for (int i = 0; i < list.length; i++) {
            toplam += 1 / list[i];
        }

        double harmonikOrtalama = list.length / toplam;

        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Harmonik Ortalama: " + harmonikOrtalama);
    }

}