import java.util.Scanner
import java.net.URL
import scala.collection.mutable.Map

object filereadmutable {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  val in = new Scanner(new URL("http://horstmann.com/presentations/livelessons-scala-2016/alice30.txt").openStream())
                                                  //> in  : java.util.Scanner = java.util.Scanner[delimiters=\p{javaWhitespace}+][
                                                  //| position=0][match valid=false][need input=false][source closed=false][skippe
                                                  //| d=false][group separator=\,][decimal separator=\.][positive prefix=][negativ
                                                  //| e prefix=\Q-\E][positive suffix=][negative suffix=][NaN string=\Qï¿½\E][infi
                                                  //| nity string=\Qâˆž\E]
                                                  
 val count = Map[String,Int]()                    //> count  : scala.collection.mutable.Map[String,Int] = Map()
 while(in.hasNext){
 val word:String = in.next
 count(word) = count.getOrElse(word, 0) + 1
 
 }
 count("Alice")                                   //> res0: Int = 223
 
}