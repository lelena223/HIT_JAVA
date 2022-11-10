package Buoi3;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim().toLowerCase();
        while(str.contains("  ")){
            str = str.replace("  "," ");
        }
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if (s.compareTo("0") >= 0 && s.compareTo("9") <= 0) {
                str = str.replace(s, "");
                i--;
            }
        }
        str = str.toLowerCase();
        String[] temp = str.split(" ");
        str = "";
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1)
                str += " ";
        }
        System.out.print(str);
	}

}
