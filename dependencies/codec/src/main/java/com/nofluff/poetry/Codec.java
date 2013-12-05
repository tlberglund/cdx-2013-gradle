package com.nofluff.poetry;

import org.apache.commons.codec.binary.Base64;

public class Codec {
   
   public String encode(String line) {
      Base64 codec = new Base64();
      return new String(codec.encode(line.getBytes()));
      //return line;
   }
   
}

