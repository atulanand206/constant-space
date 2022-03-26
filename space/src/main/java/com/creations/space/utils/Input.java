package com.creations.space.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public interface Input {

  BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream()));

  private static InputStream systemInputStream() {
    return System.in;
  }

  private static InputStream fileInputStream() {
    try {
      return new FileInputStream("input.txt");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      return systemInputStream();
    }
  }

  default int[] inputIntArray() {
    String[] strings = new String[0];
    try {
      strings = br.readLine().trim().split(" ");
    } catch (IOException e) {
      e.printStackTrace();
    }
    int[] res = new int[strings.length];
    for (int i = 0; i < res.length; i++) {
      res[i] = Integer.parseInt(strings[i]);
    }
    return res;
  }
}
