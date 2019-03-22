package Loops

object ForLoop {  
  def main(args:Array[String])
  {
  var a=0
  var b=0
  var c=0
  for(a<-1 to 10; b<-4 until 11;if a > b)
  {
    println(a + "|" + b);
    
   }
  }
  
}