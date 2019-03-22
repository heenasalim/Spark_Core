package Collection

import collection.mutable.Map;
object Maps {
  
  def main(args:Array[String])
  {    
    println("Maps Operation:");
    
    map_operation();
  }
  
  
  def map_operation() = {
    
    //Adding the values in the already define map
    var imap = Map(1 -> "Heena" , 2 -> "Ajinkya")
    imap+=(3->"Shaikh")
    imap+=(4->"collection")
    println("imap"+ imap)
     
    //Adding the values in empty map
  //Syntax var map_name:Map[type1,type2] = Map()
    var empty_map:Map[Any,Any]  = Map();
    empty_map+= (1 -> "Sourabh")
    empty_map+= ("Heena" -> "Salim")
    empty_map+= ( 2 -> "Shaikh")
   
   //printing the map
    println("Map" + empty_map);
   
    //adding and printing keys of the map
       var total_keys =0 
       var total_values:String = " ";
      for( (keys,values) <- imap) 
      {total_keys += keys;}
      println("Addition of the keys :" + total_keys)
      
     //adding the values of the map  and printing 
      for ( (keys,values) <- imap)
      {
      total_values += values + "  " }
      println("Addition of the value are :" + total_values);
  }
   
   // How to delete one of the element  of the map
    var cmap =  Map("Name" -> "Heena", "Marks" -> "Salim", "id" -> "1234");
    cmap -= "Name"
    println("Removed the element" + cmap)
    
    cmap -= ("Marks","Name")
    println("Removed group of the element:"  + cmap)
    cmap("id") = "2522"        //we can update the values b using their key
    cmap("Name") = "Heena Salim"
    
    cmap+=("Address" -> "Ruston Colony/Chinchwad Pune33");
    println("Updated Keys and Values" + cmap);
}
