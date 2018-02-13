object vowelusingcontains {
  val vowelString = "aeiou"                       //> vowelString  : String = aeiou
  def isCharVowel(ch:Char):Boolean = {
     val result = vowelString contains(ch)
     return result
  }                                               //> isCharVowel: (ch: Char)Boolean
  
  isCharVowel('a')                                //> res0: Boolean = true
  isCharVowel('b')                                //> res1: Boolean = false
  
  
  def vowels(s:String) = for( st <- s.toLowerCase if isCharVowel(st)) yield st
                                                  //> vowels: (s: String)String
  
  vowels("Abhishek")                              //> res2: String = aie
  
  
  def vowels2(s:String):String = {
    
    if((s length) == 0) ""
    else{
      val part = s(0)
      val rest = vowels2(s.substring(1))
      if (isCharVowel(part)) part + rest else rest
    }
  }                                               //> vowels2: (s: String)String

  vowels2("Abhishek Sethi")                       //> res3: String = ieei
  
}