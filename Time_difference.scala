
import java.util.Calendar
import java.text.SimpleDateFormat
object Time_difference {
  
  def main(args:Array[String])
  {
    
    val start_time= System.nanoTime
    //read the file in spark core by from file not any other method
    lazy val file = scala.io.Source.fromFile("C:\\Users\\jabin\\Desktop\\sample_test.txt").mkString;
    println(file)
    var a = 11
    var b = 10
    var c = a + b ;
    println(s"the addition of the number is: " + c);
    println(s"subtraction of the number is: "+ (a-b+c+c+b+c*b*c/c+a*1.09*3.14*20000));
    println(s"multiplication of the number is: " + (a*b*a*b/6*3*c*10000000*0.1*b*c));
    println(s"divide the number: " + a);      
    val end_time = System.nanoTime()
    println(s"time_difference is:= " + (start_time-end_time)/1e9d);
   // val minutes = start_time*60;
    //val sec = end_time*60
    
  }
  
}

