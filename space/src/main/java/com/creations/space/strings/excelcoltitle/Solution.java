package com.creations.space.strings.excelcoltitle;

import com.creations.space.utils.Input;
import com.creations.space.utils.Output;

public class Solution implements Input, Output {
  /**
   * In Danceland, one person can party either alone or can pair up with another person.
   * Can you find in how many ways they can party if there are A people in Danceland?
   * Note: Return your answer modulo 10003, as the answer can be large.
   *
   * This one is a little variation where the group at (i - 1) item would have
   * additional (i - 1) options available before one person is picked for
   */
  public int party(int A) {
    int MOD = 10003;
    int a = 1, b = 1;
    for (int i = 2; i <= A; i++) {
      int temp = b;
      b = (a * (i - 1) + b) % MOD;
      a = temp;
    }
    return b;
  }

  private void driver() {
    print(new Solution().party(inputInt()));
  }

  public static void main(String[] args) {
    new Solution().driver();
  }
}
