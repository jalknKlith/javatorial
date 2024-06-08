package codes;
import java.util.Scanner;

public class romNum50 {
    public static void main(String[] args) {
        //Asking for a number (1 to 50) and setting romanNum
        Scanner input = new Scanner(System.in);
        System.out.println("Write a number (1 to 50)");
        int num = input.nextInt();
        String roman = "";
        //Switching cases
        switch (num) {
            case 1: roman = "I"; break;
            case 2: roman = "II"; break;
            case 3: roman = "III";break;
            case 4: roman = "IV";break;
            case 5: roman = "V";break;
            case 6: roman = "VI";break;
            case 7: roman = "VII";break;
            case 8: roman = "VIII";break;
            case 9: roman = "IX";break;
            case 10: roman = "X";break;
            case 11: roman = "XI";break;
            case 12: roman = "XII";break;
            case 13: roman = "XIII";break;
            case 14: roman = "XIV";break;
            case 15: roman = "XV";break;
            case 16: roman = "XVI";break;
            case 17: roman = "XVII";break;
            case 18: roman = "XVIII";break;
            case 19: roman = "XIX";break;
            case 20: roman = "XX";break;
            case 21: roman = "XXI";break;
            case 22: roman = "XXII";break;
            case 23: roman = "XXIII";break;
            case 24: roman = "XXIV";break;
            case 25: roman = "XXV";break;
            case 26: roman = "XXVI";break;
            case 27: roman = "XXVII";break;
            case 28: roman = "XXVIII";break;
            case 29: roman = "XXIX";break;
            case 30: roman = "XXX";break;
            case 31: roman = "XXXI";break;
            case 32: roman = "XXXII";break;
            case 33: roman = "XXXIII";break;
            case 34: roman = "XXXIV";break;
            case 35: roman = "XXXV";break;
            case 36: roman = "XXXVI";break;
            case 37: roman = "XXXVII";break;
            case 38: roman = "XXXVIII";break;
            case 39: roman = "XXXIX";break;
            case 40: roman = "XL";break;
            case 41: roman = "XLI";break;
            case 42: roman = "XLII";break;
            case 43: roman = "XLIII";break;
            case 44: roman = "XLIV";break;
            case 45: roman = "XLV";break;
            case 46: roman = "XLVI";break;
            case 47: roman = "XLVII";break;
            case 48: roman = "XLVIII";break;
            case 49: roman = "XLIX";break;
            case 50: roman = "L";break;
        }
        System.out.print(roman + "\n");
    }
}