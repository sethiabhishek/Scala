package com.lesson6

object excercise2 {
 
 // factorial
 
 1.to(10).reduceLeft(_ * _)                       //> res0: Int = 3628800
 
 //power function
 
 def pow(a:Int,b:Int) = 1.to(b).map(_=>a).reduceLeft(_ * _)
                                                  //> pow: (a: Int, b: Int)Int
 
 pow(2, 20)                                       //> res1: Int = 1048576

 def concat(str:Seq[String], separator: String) = str.map(_ + separator).reduceLeft(_ + _)
                                                  //> concat: (str: Seq[String], separator: String)String

 val data = Array("Mary", "had", "a", "little", "lamb")
                                                  //> data  : Array[String] = Array(Mary, had, a, little, lamb)
 
 val result = concat(data, " ")                   //> result  : String = "Mary had a little lamb "

}