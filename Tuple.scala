package Collection

object Tuples {
  
  
  def main(args:Array[String])
  {
    var sTuple = (1,2,3,5,6)
    
   //  var aTuple = scala.io.Source.fromFile("C:\\Users\\jabin\\Desktop\\sample_test.txt");
     
     println(sTuple._2);
      println(sTuple._3);
     
   // for loop in tuples 
    sTuple.productIterator.foreach(println)
      
  }
}