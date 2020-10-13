package src.hiep.algorithm;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        int choice;
        Scanner sc = new Scanner(System.in);
        BackTracking b = new BackTracking();
        do {
            System.out.println("1- Xep lich nhan vien 1 tuan");
            System.out.println("2- Xep tour cho nhan vien");
            System.out.println("3- thoat");
            choice = sc.nextInt();
            switch (choice) {
                case 1:b.schedule(2);
                    break;
                case 2:
                    sc = new Scanner(System.in);
                    System.out.println("Input Day of Week : ");
                    int day = sc.nextInt();
                    b.scheduleTourguides(day);
                    break;
                case 3:
                    System.out.println("Good Bye");
            }
        } while (choice != 3);

    }
}
