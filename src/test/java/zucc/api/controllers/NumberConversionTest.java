package zucc.api.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Class Description.
 *
 * @author Antônio Lima Jr
 */
class NumberConversionTest {

  public NumberConversionTest() {
  }

  @Test
  void test() {
    NumberConversion numberConversion = new NumberConversion();

    assertEquals("Ola mundo", numberConversion.conversionNumber());
  }
}