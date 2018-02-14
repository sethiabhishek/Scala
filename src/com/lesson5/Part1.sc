package com.lesson5

import java.awt._


object Part1 {
  var rect = new Rectangle(5,10,20,30)            //> rect  : java.awt.Rectangle = java.awt.Rectangle[x=5,y=10,width=20,height=30]
                                                  //| 
  
   rect.translate(10, 20)
   
   rect                                           //> res0: java.awt.Rectangle = java.awt.Rectangle[x=15,y=30,width=20,height=30]
                                                  //| 
  
  val ellipse = new geom.Ellipse2D.Double(5,10,20,30) with RectangleLike
                                                  //> ellipse  : java.awt.geom.Ellipse2D.Double with com.lesson5.RectangleLike = c
                                                  //| om.lesson5.Part1$$anonfun$main$1$$anon$1@19660000
 
  ellipse.translate(10,20)
  
  ellipse                                         //> res1: java.awt.geom.Ellipse2D.Double with com.lesson5.RectangleLike = com.le
                                                  //| sson5.Part1$$anonfun$main$1$$anon$1@1d420000
 
}