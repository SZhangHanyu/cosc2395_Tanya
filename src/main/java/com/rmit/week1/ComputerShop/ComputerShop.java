package com.rmit.week1.ComputerShop;

import java.util.*;

public class ComputerShop {
  public static void main(String[] args) {
    Computer c1 = new Computer("HP", "i5");
    c1.setMemory(8);
    c1.setYear(2013);
    c1.setPrice(400.0);
    System.out.println(c1.toString());

    Scanner input = new Scanner(System.in);
    Computer c2 = new Computer("Lenovo", "i7", 10);
    System.out.println("Year:");
    int year = input.nextInt();
    c2.setYear(year);
    System.out.println("Price:");
    double price = input.nextDouble();
    c2.setPrice(price);
    System.out.println(c2.toString());
  }// main
}// class