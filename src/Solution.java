public class Solution {
    public int romanToInt(String s) {

    }

    public static void main(String[] args) {
        Solution s = new Solution();

        if(s.romanToInt("I") != 1){
            System.err.println("Ошибка I");
        }
        if(s.romanToInt("III") != 3){
            System.err.println("Ошибка III");
        }

        if(s.romanToInt("LVIII") != 58){
            System.err.println("Ошибка LVIII");
        }

        if(s.romanToInt("MCMXCIV") != 1994){
            System.err.println("Ошибка MCMXCIV");
        }
    }
}