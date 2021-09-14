package com.files;

import java.io.File;
import java.util.Scanner;

public class FilesAndDirectory {

    public static void main(String[] args) {
      try(Scanner scanner = new Scanner(System.in)) {

          System.out.println("Enter name:");
          String name = scanner.next();
      }
    }
}
