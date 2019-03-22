package Loops

object While_Loop {
  
  var a = 1;
  def main(args:Array[String])
  {
    while ( a < 22) {    
      println(s"values is :" + a);
      
      a = a+1;
    }
  }
}