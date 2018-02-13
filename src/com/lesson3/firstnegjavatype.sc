import scala.collection.mutable.ArrayBuffer

object firstnegjavatype {

  val numbers = ArrayBuffer(-5 to 10: _*)         //> numbers  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(-5, -4, -
                                                  //| 3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

 
    var resultArray = new ArrayBuffer[Int]        //> resultArray  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
    var negativeAdded = false                     //> negativeAdded  : Boolean = false

  def getList(data: ArrayBuffer[Int]):ArrayBuffer[Int] =  {
    for(num <- data) {
      if (num < 0) {
        if (!negativeAdded) {
          resultArray += num
          negativeAdded = true
        }
      } else {
        resultArray += num
      }

    }
		return resultArray
  }                                               //> getList: (data: scala.collection.mutable.ArrayBuffer[Int])scala.collection.m
                                                  //| utable.ArrayBuffer[Int]

 val rr =  getList(numbers)                       //> rr  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(-5, 0, 1, 2, 3
                                                  //| , 4, 5, 6, 7, 8, 9, 10)
}