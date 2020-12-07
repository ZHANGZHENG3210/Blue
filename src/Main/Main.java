package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string=scanner.nextLine();
        String[] stringArray=string.split(" ");
        for(int i=stringArray.length-1;i>=0;i--){
            System.out.print(stringArray[i]+" ");
        }
    }
}