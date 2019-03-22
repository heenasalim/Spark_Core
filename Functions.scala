package Functions

object Functions {  
  def main(args:Array[String])
  {  
    var pi=0
    println(add(1,3));
    println(subtraction(11.0f,3));
    println(multiplication(pi:Float,3));
  }
  
  def add(x:Int,y:Int):Int={
     return x+y;}

  def subtraction(a:Float,b:Int):Any={    
    return a+b;}
  
  def multiplication(pi:Float=3.14f,radius:Int ):Any={    //Different method of the declartion
    return pi*radius*radius;
    
    
  }
  }
  