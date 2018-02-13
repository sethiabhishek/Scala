object ZipUse {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val symbols = Array("<", "-", ">")              //> symbols  : Array[String] = Array(<, -, >)
  val counts = Array(2, 10, 2)                    //> counts  : Array[Int] = Array(2, 10, 2)
  val pairs = symbols.zip(counts)                 //> pairs  : Array[(String, Int)] = Array((<,2), (-,10), (>,2))
  
  //Now iterate over the result to produce a printout <<---------->>.
  //That is, repeat the < twice, the - ten times, and the > twice. (Hint: s * n yields the string s repeated n times)
  
   for((s,n)<-pairs) print(s*n)                   //> <<---------->>
   println                                        //> 
  
}