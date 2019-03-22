package Collection


object List_Ini {
 
  def main(args:Array[String])={   
    var l = List(1 , 3 , 4 , 5, 6 ,7);
    
    for (index <- 0 until l.length)
    {
     if (l(index)%2 != 0)
     println("odd element : " + l(index));
     else 
     println("even element: " + l(index));
    }
     
    for ( a  <- l)
    println("\t" + a)
   // for populating the another list
   
    val duplicate_list = List.tabulate(9)(n=>n);
    println("duplicate elements" + duplicate_list);
    
    // for printing odd and even numbers with their mod
    val odd_list = List.tabulate(111)(n=>(n,n%2));
    println("odd numbers are" + odd_list);
    
   // var a = (1 to 21).toList();
  //  println(a)
    
    var new_list = duplicate_list.filter(_>2);
    
    println("the new list elements are:" + new_list);
    
  }
}          