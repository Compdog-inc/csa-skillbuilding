// Vlad, 9/11/2024, Write a program that asks about the user's favorite things and responds

package com.compdog.csa.skillbuilding;

import java.util.Scanner;

public class Favorite {

    /**
     *  This program asks the user about some of their favorite things
     *  (food, animal, movie)
     *  And responds with a sentence relating to them,
     *  with support for empty responses.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your favorite food?");
        String favoriteFood = keyboard.nextLine();

        System.out.println("What is your favorite animal?");
        String favoriteAnimal = keyboard.nextLine();

        System.out.println("What is your favorite movie?");
        String favoriteMovie = keyboard.nextLine();

        System.out.printf(
                "Same! I also love watching %s while eating %s, %s!",
                withDefault( // Provide alternative to the favorite movie when no answer is given
                        capitalizeName(favoriteMovie), // Movie names should be capitalized
                        "my life passing in front of my eyes"
                ),
                withDefault( // Provide alternative to the favorite food when no answer is given
                        favoriteFood,
                        "my regrets"
                ),
                favoriteAnimal.isEmpty() ? // If no favorite animal is provided, use a default instead
                        "alone" :
                        ("with my " + favoriteAnimal)
        );
    }

    /**
     * Capitalizes the first character of each word in a name.
     *
     * @param name The name to capitalize
     * @return A capitalized string
     */
    private static String capitalizeName(String name) {
        // Split name into words by the space character
        String[] words = name.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].isEmpty()) // Ignore empty words
                continue;

            words[i] =
                    // Convert first character of the word to upper case
                    Character.toUpperCase(words[i].charAt(0)) +
                            // Concat the rest of the word
                            words[i].substring(1);
        }

        // Join the words back into a string and return
        return String.join(" ", words);
    }

    /**
     * Returns input string unless it is empty, then return a default instead
     * @param str Input string
     * @param defaultStr Default string
     * @return The input string or default if empty
     */
    private static String withDefault(String str, String defaultStr) {
        if (str.isEmpty())
            return defaultStr;
        else
            return str;
    }
}
