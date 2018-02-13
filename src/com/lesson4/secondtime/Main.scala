package com.lesson4.secondtime

object Main extends App {
  var t1 =   SecondTime(23)
  var t2 =   SecondTime(23,54)
  
  println("Time t1:--"+ t1)
  println("Time t2:--"+ t2)
  
  println(t1.before(t2))
  println(t2.before(t1))
   
  t1.minutes =55 
  println("Time t1:--"+ t1)
  println("Time t2:--"+ t2)
  
  println(t1.before(t2))
  println(t2.before(t1))
}