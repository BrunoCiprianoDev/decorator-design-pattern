import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.impl.CPU;
import com.example.impl.ComputerCase;
import com.example.impl.Motherboard;

public class DesktopComponentTest {

  public static Motherboard mb01Instance;
  public static ComputerCase cc01Instance;
  public static CPU cpu01Instance;

  @BeforeAll
  public static void unit() {
    cc01Instance = new ComputerCase("Cabinete01", 225f);
    mb01Instance = new Motherboard("A320", 500f, cc01Instance);
    cpu01Instance = new CPU("Ryzen 3 3200g", 1000f, mb01Instance);
  }

  @Test
  void shouldReturnTotalPrice() {
    assertEquals(725f, mb01Instance.getTotalPrice());
  }

  @Test
  void shoutReturnTotalPriceWithNewCPU() {
    assertEquals(1725f, cpu01Instance.getTotalPrice());
  }

}
