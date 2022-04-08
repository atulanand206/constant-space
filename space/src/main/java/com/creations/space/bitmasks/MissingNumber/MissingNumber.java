package com.creations.space.bitmasks.MissingNumber;

import com.creations.space.utils.*;

public class MissingNumber implements Input, Output {

  /**
   * Given an array of integers where each number is repeated twice except for one number which
   * occurs only once. Find the odd one out.
   */
  public int missingNumber(int[] numbers) {
    int xor = 0;
    for (int i : numbers) {
      xor ^= i;
    }
    return xor;
  }

  private void driver() {
    int[] nums = inputIntArray();
    print(new MissingNumber().missingNumber(nums));
  }

  public static void main(String[] args) {
    new MissingNumber().driver();
  }
}
