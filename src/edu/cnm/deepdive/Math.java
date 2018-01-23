package edu.cnm.deepdive;

public class Math {

  public static long gcd(long a, long b) { //declaration
    a = java.lang.Math.abs(a); //implementation (body)
    b = java.lang.Math.abs(b);
    if (a == 0) { // if requires a boolean expression
    return b;
    } else if (b == 0) {
    return a;
    }
    while (a != b) {
      if (a > b) {
        a -= b; // a = a - b; "compound assignment operator"
      } else {
        b -= a;
      }
    }
    return a;
  }
  
}
