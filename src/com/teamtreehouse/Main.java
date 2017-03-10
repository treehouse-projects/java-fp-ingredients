package com.teamtreehouse;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
      List<String> ingredients = Arrays.asList(
          "flour",
          "salt",
          "baking powder",
          "butter",
          "eggs",
          "milk"
      );


      /*for (String ingredient : ingredients) {
        System.out.println(ingredient);
      }*/

      ingredients.forEach(new Consumer<String>() {
        @Override
        public void accept(String s) {
          System.out.println(s);
        }
      });

    }
}
