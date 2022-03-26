package com.creations.space.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public interface Output {

  private PrintStream systemPrintStream() {
    return System.out;
  }

  private PrintStream filePrintStream() {
    try {
      return new PrintStream(new FileOutputStream("debug.txt"));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      return systemPrintStream();
    }
  }

  default void print(Object obj) {
    filePrintStream().println(obj);
  }
}
