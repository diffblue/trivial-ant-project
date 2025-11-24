package io.diffblue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicTest {

  @Test
  void testIsGreaterThanFive() {
    assertTrue(new Basic().isGreaterThanFive(42));
    assertFalse(new Basic().isGreaterThanFive(5));
  }
}
