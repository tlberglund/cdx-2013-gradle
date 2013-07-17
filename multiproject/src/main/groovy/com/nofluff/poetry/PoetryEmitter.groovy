package com.nofluff.poetry

class PoetryEmitter {

   def codec

   def emit(lines) {
      lines.each { line ->
         println codec.encode(line)
      }
   }
      
   public static void main(args) {
      PoetryEmitter pe = new PoetryEmitter()
      pe.codec = new Codec()
      def content = new Content()      
      pe.emit(content."${args[0]}"())
   }
}

