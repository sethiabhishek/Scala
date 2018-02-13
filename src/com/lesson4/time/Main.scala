package com.lesson4.time

object Main extends App{
  
  val t1 = new Time(23)
  val t2 = new Time(23,54)
  
  println(t1 before(t2))
  
  println(t2 before(t1))
  
  //val t3 = new Time(24)
  
  println("Time t1:"+ t1)
  println("Time t2:"+ t2)
  
}