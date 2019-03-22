package Collection

//What is a HashMap?

//As per the Scala Documentation, a HashMap is a collection of key and value pairs which are stored internally using a Hash Table data structure.
import scala.collection.mutable._
object ArrayBuffer {
 def main(args:Array[String])
  {
    
  }
 
 def arry_buffer_methods() = {
   
 // Empty sarraybuff  = ArrayBuffer()
   var array = Array[Int](10)      //....Learn this definittion
   var empty_arraybuffer = new ArrayBuffer[Int]()//
   empty_arraybuffer += 3;
   empty_arraybuffer += 4;
   var sum=0
   println(empty_arraybuffer);
   for ( a <- empty_arraybuffer)
    println(a)
   for( a <- 0 until empty_arraybuffer.length)
   {
     sum +=a
   }
   println(sum);
   
    
  }
}