package phoneExample;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PhoneExampleBestTests {
  @Test
  public void tests() {
    assertEquals(true, KataBest.validPhoneNumber("(123) 456-7890"));
    assertEquals(false, KataBest.validPhoneNumber("(1111)555 2345"));
    assertEquals(false, KataBest.validPhoneNumber("(098) 123 4567"));
  }
}