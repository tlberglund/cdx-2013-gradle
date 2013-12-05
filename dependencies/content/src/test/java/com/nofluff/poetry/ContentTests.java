package com.nofluff.poetry;

import java.util.List;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ContentTests {

   private Content content;

   @Before
   public void setup() {
      content = new Content();
   }

   @Test
   public void testPoe() {
      List<String> lines = content.poe();
      assertEquals("Ah, distinctly I remember it was in the bleak December", lines.get(0));
   }

}