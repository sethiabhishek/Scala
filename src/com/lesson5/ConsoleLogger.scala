package com.lesson5

trait ConsoleLogger extends Logged{
  
  override def log(msg: String) { println(msg) }
}