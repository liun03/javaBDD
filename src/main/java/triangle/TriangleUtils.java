package triangle;

import java.math.BigDecimal;

public class TriangleUtils {

  public static boolean isValidTriagleSides(BigDecimal side1, BigDecimal side2, BigDecimal side3) {
    if (side1.signum() == 1 && side2.signum() == 1 && side3.signum() == 1) {
      if (side1.add(side2).compareTo(side3) == 1 && side2.add(side3).compareTo(side1) == 1
          && side1.add(side3).compareTo(side2) == 1) {
        return true;
      }
    }
    return false;
  }
}
