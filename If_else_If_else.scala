package Loops

object If_else_If_else {
  def main(args:Array[String])
  {
    
   var first = 11;
   var second = 17
   if( first > 11 || (first+second) == 28) {
     println(s"Test one is corect");
   }
   else if (first == first+second){
   println("Test two is correct")
   }
   else if (second != first)
   {
     println(first)
   }
  }
}