package com.lesson4.time

class Time(val hours:Int,val minutes:Int = 0) {
  if((this.hours>23 || this.hours <0) || (this.minutes > 59 || this.minutes<0)) throw new IllegalArgumentException
  println(f"Object created with hrs (${hours}) and mins ${minutes}")
  
  override def  toString() = f"((${hours},${minutes})"
  
  def before(other:Time):Boolean = {
    var isBefore = false
    if(this.hours < other.hours){
      isBefore = true
    }else{
      if((this.hours == other.hours) && (this.minutes <= other.minutes)){
        isBefore = true
      }
    }
     isBefore
  }
}