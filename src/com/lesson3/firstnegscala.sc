import scala.collection.mutable.ArrayBuffer

object firstnegscala {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val numbers = ArrayBuffer(-5 to 10: _*)         //> numbers  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(-5, -4, -
                                                  //| 3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val allNegativeBuffer = for(i<-0 until numbers.length if numbers(i) < 0 ) yield i
                                                  //> allNegativeBuffer  : scala.collection.immutable.IndexedSeq[Int] = Vector(0, 
                                                  //| 1, 2, 3, 4)
 val indexesToRemove =  allNegativeBuffer.drop(1) //> indexesToRemove  : scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2,
                                                  //|  3, 4)
 
 
 for(i<-indexesToRemove reverse) numbers.remove(i)
 
  numbers                                         //> res0: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(-5, 0, 1, 2, 3
                                                  //| , 4, 5, 6, 7, 8, 9, 10)
 


}