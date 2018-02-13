package com.lesson4.secondtime

class SecondTime(h: Int, m: Int) {
  private var minutesSinceMidNight = h*60 + m
  
  if (this.h > 23 || this.h < 0 || this.m > 59 || this.m < 0) throw new IllegalArgumentException
  
  def hours = minutesSinceMidNight/60
  
  def minutes = minutesSinceMidNight % 60
  
  def minutes_= (newVal:Int) {minutesSinceMidNight = hours*60 + newVal}

  override def toString() = f"${hours}:${minutes}%02d"

  def before(other: SecondTime): Boolean =  minutesSinceMidNight < other.minutesSinceMidNight

}

   object SecondTime{
    
    def apply(h:Int,m:Int = 0)= new  SecondTime(h,m)
  }
 