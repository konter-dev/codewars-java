/**
 * (8 kyu) Volume of a Cuboid
 * https://www.codewars.com/kata/58261acb22be6e2ed800003a/
 *
 * Bob needs a fast way to calculate the volume of a cuboid with three values:
 * the `length`, `width` and `height` of the cuboid. Write a function to help
 * Bob with this calculation.
 */
// 1. Simple solution
public class Kata {
  public static double getVolumeOfCuboid(final double length, final double width, final double height) {
    double volume = length * width * height;
    return volume;
  }
}

// 2. Optimized solution
public class Kata {
  public static double getVolumeOfCuboid(final double length, final double width, final double height) {
    return length * width * height;
  }
}

// 3. Coding golf
public class Kata {
  public static double getVolumeOfCuboid(double... x) {
    return x[0]*x[1]*x[2];
  }
}
