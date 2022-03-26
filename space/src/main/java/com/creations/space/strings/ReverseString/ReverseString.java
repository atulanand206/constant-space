package com.creations.space.strings.ReverseString;

import java.io.*;

public class ReverseString {

  /**
   * Languages like C++ and Golang represent strings as a char array and are mutable but strings are
   * immutable in Java and it would be impossible to alter it w/o using a StringBuilder or a char
   * array
   *
   * <p>For the purposes of this explanation, a string would be represented using a char array
   *
   * <p>The method would not return anything rather modify the given char array in-place.
   */
  public void reverseString(char[] characters) {
    int i = 0, j = characters.length - 1;
    while (i < j) {
      char temp = characters[i];
      characters[i] = characters[j];
      characters[j] = temp;
      i++;
      j--;
    }
  }

  /**
   * Converts a given char array to a String using StringBuilder and gets it ready for printing in
   * one go.
   */
  private static String stringify(char[] chars) {
    StringBuilder sb = new StringBuilder();
    for (char ch : chars) {
      sb.append(ch);
    }
    return sb.toString();
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] chars = br.readLine().toCharArray();
    new ReverseString().reverseString(chars);
    System.out.println(stringify(chars));
  }
}
