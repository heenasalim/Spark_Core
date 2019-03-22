
//write the program to calculate the time difference 
import java.util.Calendar // Class to import the calender
import java.text.SimpleDateFormat //Class for formatting the text

object Simple_Program {
  
  def difference_between_start_time_end_time()   
    {
     val hour_format= new SimpleDateFormat("hh");
     val minute_format =new SimpleDateFormat("mm");
     val sec_format = new SimpleDateFormat("ss");
     
     var start_time = Calendar.getInstance().getTime;
     println(s"$start_time");
     val start_time_hour = hour_format.format(start_time);
     val start_time_minute = minute_format.format(start_time);
     val start_time_sec = sec_format.format(start_time);
     
     //start_time_sec.foreach(println);    //foreach for printing each character in new line 
    // println(s"$start_time_minute");  //printing the string values
     println(start_time_hour)   //printing the all the things
    
     // *************Writing the code********************
     var a = 11
     var b = 10
     var c = a + b ;
     println(s"the addition of the number is: " + c);
     println(s"subtraction of the number is: "+ (a-b+c+c+b+c*b*c/c+a));
     println(s"multiplication of the number is: " + (a*b*a*b*c*b*c));
     println(s"divide the number: " + (a/b));
     
    // *********Calculating the End Time******************
    
    var end_time = Calendar.getInstance().getTime;
    println(s"end_time is " +end_time);
    val end_time_hour = hour_format.format(end_time);
    val end_time_minute = minute_format.format(end_time);
    val end_time_sec = sec_format.format(end_time);
    
    //**********difference between times*******************
    val hour_difference = start_time_hour.toInt - end_time_hour.toInt;
    val minute_difference = start_time_minute.toInt - end_time_minute.toInt;
    val seconds_difference = start_time_sec.toInt - end_time_sec.toInt;
    println(s"difference of the hours is: " + hour_difference)
    println(s"difference of the minutes is:" + minute_difference)
    println(s"differnce in seconds is:" + seconds_difference)
    }
 
    def main(args:Array[String])  //textfile
  { 
      difference_between_start_time_end_time();
  }
}