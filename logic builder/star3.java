// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class star3  {

   public static void main(String[] var0) {
      int var1;
      int var2;
      for(var1 = 1; var1 <= 4; ++var1) {
         for(var2 = 1; var2 <= var1; ++var2) {
            System.out.print("*");
         }

         System.out.println();
      }

      for(var1 = 1; var1 <= 4; ++var1) {
         for(var2 = 4; var2 >= var1 - 1; --var2) {
            System.out.print("*");
         }

         System.out.println();
      }

   }
}
