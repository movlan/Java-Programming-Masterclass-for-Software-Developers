package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

//         class ClickListener implements Button.OnClickListener {
//              public ClickListener() {
//                  System.out.println("I've been attached");
//              }
//
//              @Override
//              public void onClick(String title) {
//                   System.out.println(title + " was clicked");
//              }
//         }
//
//         btnPrint.setOnClickListener(new ClickListener());

        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });

        listen();

//         Gearbox mcLaren = new Gearbox(6); // to create inner class first need to create outer class

//         mcLaren.operateClutch(true);
//         mcLaren.changeGear(1);
//
//         mcLaren.operateClutch(false);
//         System.out.println(mcLaren.wheelSpeed(1000));
//
//         mcLaren.changeGear(2);
//         System.out.println(mcLaren.wheelSpeed(3000));
//
//         mcLaren.operateClutch(true);
//         mcLaren.changeGear(3);
//         mcLaren.operateClutch(false);
//         System.out.println(mcLaren.wheelSpeed(6000));
//
//         and then create inner class using outerClass.new
//         Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//         Gearbox.Gear second = new Gearbox.Gear(2, 15.4); // cant use this because Gear is not a enclosing class
//         Gearbox.Gear third = new mcLaren.Gear(3.17,8); // this wont work because we didn't use a outerClass.new
//         System.out.println(first.driveSpeed(1000));
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
                default:
                    break;
            }
        }
    }
}
