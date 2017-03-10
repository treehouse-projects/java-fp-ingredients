package com.teamtreehouse;

import java.util.Arrays;
import java.util.List;

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

//      boolean hasEggs = false;
//      for (String ingredient : ingredients) {
//        if (ingredient.equals("eggs")) {
//          hasEggs = true;
//          break;
//        }
//      }

      if (ingredients.contains("eggs")) {
        System.out.println("Sorry sweetheart!  It has eggs :(");
      }

    }
}
