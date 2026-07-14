package SkillScript.p5;

public class Solution {
    static public void convertTemperature(int c) {
        double farenheit = (c*(9.0/5))+32;
        int ans = ((short) farenheit);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        convertTemperature(100);
    }
}
