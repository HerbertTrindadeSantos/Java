package estruturasDados.Algoritmos_leetCode.isPalindrome.services;

public class Solution {

    public static boolean isPalindrome(int x) {
        int dig = 0;
        int palidromo = 0;
        int num = x;
        while (num != 0) {
            dig = num % 10;
            palidromo = palidromo * 10 + dig;
            System.out.println(palidromo);
            num = num / 10;
        }
        if (!(palidromo == x)){
            return false;
        }
        return true;
    }
}
