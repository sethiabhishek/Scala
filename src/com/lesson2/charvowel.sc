object charvowel {
 
  val vowelString = "aeiou"                       //> vowelString  : String = aeiou
  def isCharVowel(ch:Char):Boolean = {
     var result = false
     for (c <- vowelString if ch==c) {
      result = true
    }
     return result
  }                                               //> isCharVowel: (ch: Char)Boolean
  
  isCharVowel('b')                                //> res0: Boolean = false
 
}