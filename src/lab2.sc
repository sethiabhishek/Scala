import scala.math._;

object lab2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  sqrt(10)                                        //> res0: Double = 3.1622776601683795
  
  1 to(10)                                        //> res1: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7
                                                  //| , 8, 9, 10)
  1.to(10).map(sqrt(_))                           //> res2: scala.collection.immutable.IndexedSeq[Double] = Vector(1.0, 1.41421356
                                                  //| 23730951, 1.7320508075688772, 2.0, 2.23606797749979, 2.449489742783178, 2.64
                                                  //| 57513110645907, 2.8284271247461903, 3.0, 3.1622776601683795)

  6.*(7)                                          //> res3: Int(42) = 42
  
  
  
}