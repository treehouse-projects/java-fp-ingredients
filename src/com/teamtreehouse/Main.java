package com.teamtreehouse;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import javafx.application.Application;

public class Main {

    public static void yell(String words) {
      System.out.printf("%s!!!!! %n", words.toUpperCase());
    }

    public static void main(String[] args) {
      List<String> ingredients = Arrays.asList(
          "flour",
          "salt",
          "baking powder",
          "butter",
          "eggs",
          "milk"
      );

      Main.yell("But I want that cupcake");
//      ingredients.forEach(System.out::println);
      ingredients.forEach(Main::yell);


    }
}
