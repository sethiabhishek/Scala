import scala.collection.mutable.ArrayBuffer

object partitioning {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  "Hello World".partition(_.isUpper)              //> res0: (String, String) = (HW,ello orld)
  
  // creating array buffer of negative and positive numbers
  val numbers = ArrayBuffer(-5 to 10: _*)         //> numbers  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(-5, -4, -
                                                  //| 3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val tuple = numbers.partition(_.<(0))           //> tuple  : (scala.collection.mutable.ArrayBuffer[Int], scala.collection.mutabl
                                                  //| e.ArrayBuffer[Int]) = (ArrayBuffer(-5, -4, -3, -2, -1),ArrayBuffer(0, 1, 2, 
                                                  //| 3, 4, 5, 6, 7, 8, 9, 10))
  
  val (negative,positive) = tuple                 //> negative  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(-5, -4, 
                                                  //| -3, -2, -1)
                                                  //| positive  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(0, 1, 2,
                                                  //|  3, 4, 5, 6, 7, 8, 9, 10)
  
  val list = new ArrayBuffer[Int]                 //> list  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
  list ++= positive                               //> res1: partitioning.list.type = ArrayBuffer(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                                                  //| 
  
  list += negative(0)                             //> res2: partitioning.list.type = ArrayBuffer(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                                                  //|  -5)
  
  list                                            //> res3: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(0, 1, 2, 3, 4,
                                                  //|  5, 6, 7, 8, 9, 10, -5)
  
  
  
}