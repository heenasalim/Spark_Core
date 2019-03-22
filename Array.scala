//Good document   https://www.scala-lang.org/api/2.12.1/scala/Array.html

package Collection


import Array._
import scala.collection.mutable._
object Array_Collection {
 def main(args:Array[String])
  {
     sum_of_elements(); 
  }
 
 
 
 def sum_of_elements()={  //initialize here only

 //* Array elements are
 var sarray = Array(1,23,14,23,100,111); 
 println("Elements are:")
 for (a <- sarray)
 println (a);

 // Addition the elements
 var total = 0
 for (index1 <- 0 until sarray.length) 
 total += sarray(index1);   
 println("total for elements is: " + total); 
 //
 
 //* Find the maximum of the all elements"
 var maximum_element = 0
 for ( index <- 0 until sarray.length ; if (maximum_element < sarray(index)))
 {
  maximum_element = sarray(index);
 }
 println("Highest element is: " + maximum_element);
 
 
 ///Map method o the array
 
 var new_array = sarray map (_ * 2); //_ this isfirst element
 println("The multiplied array" + new_array)
 
 
 //Method to filter the values of the array
 
 //var filtered_empty_array:Array[Int] = Array();
 val second_array = sarray.map(_*2)
 for ( a  <- 0 until second_array.length)
 println( second_array(a));//
 for ( a <- sarray)  // here sarray is the elements
   println(a);
   
 
 
 
 // size of theay  arr
   
   sarray.size;
 // printing the distinct elements
 sarray.distinct;
 sarray.map(_/2);
 sarray.filter(_>3);
 sarray(0)
 sarray(1);
 sarray(0) =1;
 // we cannot update the array sarray(11) = 2;
 sarray(5) = 111;
 sarray.indexOf(3);
 (1 until 9).toArray
 ( 'a' to 'h').toArray;
 Array.range(1,99);
    Array.tabulate(4)(n => n * n) 
 
 
 // access the elements by indexing
 
 //finding the index of the particular element
 
 } 
//def closed
  
 
 
 
}