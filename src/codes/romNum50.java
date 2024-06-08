package codes;
import java.util.Scanner;

public class romNum50 {
    public static void main(String[] args) {
        //Asking for a number (1 to 50) and setting romanNum
        Scanner input = new Scanner(System.in);
        System.out.println("Write a number (1 to 50)");
        int num = input.nextInt();
        String roman = switch (num) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            case 10 -> "X";
            case 11 -> "XI";
            case 12 -> "XII";
            case 13 -> "XIII";
            case 14 -> "XIV";
            case 15 -> "XV";
            case 16 -> "XVI";
            case 17 -> "XVII";
            case 18 -> "XVIII";
            case 19 -> "XIX";
            case 20 -> "XX";
            case 21 -> "XXI";
            case 22 -> "XXII";
            case 23 -> "XXIII";
            case 24 -> "XXIV";
            case 25 -> "XXV";
            case 26 -> "XXVI";
            case 27 -> "XXVII";
            case 28 -> "XXVIII";
            case 29 -> "XXIX";
            case 30 -> "XXX";
            case 31 -> "XXXI";
            case 32 -> "XXXII";
            case 33 -> "XXXIII";
            case 34 -> "XXXIV";
            case 35 -> "XXXV";
            case 36 -> "XXXVI";
            case 37 -> "XXXVII";
            case 38 -> "XXXVIII";
            case 39 -> "XXXIX";
            case 40 -> "XL";
            case 41 -> "XLI";
            case 42 -> "XLII";
            case 43 -> "XLIII";
            case 44 -> "XLIV";
            case 45 -> "XLV";
            case 46 -> "XLVI";
            case 47 -> "XLVII";
            case 48 -> "XLVIII";
            case 49 -> "XLIX";
            case 50 -> "L";
            default -> "";
            //Switching cases
        };
        System.out.print(roman + "\n");
    }
}