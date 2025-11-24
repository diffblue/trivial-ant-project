//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.diffblue;

public class Dummy {
  public static boolean isPalindrome(String s){
    int length = s.length();
    if (length <= 1) {
      return true;
    } else {
      char first = s.charAt(0);
      char last = s.charAt(length - 1);
      return first == last && isPalindrome(s.substring(1, length - 1));
    }
  }
}
