package Main;

import java.awt.dnd.DropTarget;
import java.time.LocalDate;
import java.util.*;

public class Main {

//    public int workdays_between(int y1, int m1, int d1, int y2, int m2, int d2) {
//        // write code here
//        int number = 0;
//        long oneDay = 1000 * 60 * 60 * 3600;
//        Date date1 = new Date(y1 + "/" + m1 + "/" + d1);
//        Date date2 = new Date(y2 + "/" + m2 + "/" + d2);
//        long time = date2.getTime() - date1.getTime();
//        int week = (int) (time / oneDay) / 7;
//
//        Date date3 = new Date();
//        date3.setTime(date1.getTime() + week * 7 * oneDay);
//        while (date3.getTime() < date2.getTime()) {
//            if (date3.getDay() <= 5 && date3.getDay() >= 1) {
//                number++;
//                System.out.println(date3.toString());
//            }
//            date3.setTime(date3.getTime() + oneDay);
//        }
//        return week * 7 + number;
//    }
    public int getDifferenceDayCount(String startDateStr,String endDateStr){
        LocalDate startDate = LocalDate.parse(startDateStr);
        LocalDate endDate = LocalDate.parse(endDateStr);

        //取正数
        return Math.abs((int)(endDate.toEpochDay() - startDate.toEpochDay()));
    }

    public static void main(String[] args) {
        //2020,9,25,2020,9,28
        Main main = new Main();
//        Scanner scanner=new Scanner(System.in);
//        String[] strings=scanner.next().split(",");
//        System.out.println(main.workdays_between(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]),
//                Integer.parseInt(strings[2]), Integer.parseInt(strings[3]),Integer.parseInt(strings[4]), Integer.parseInt(strings[5])));
        Calendar calendar1=Calendar.getInstance();


    }
}