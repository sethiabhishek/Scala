object varargsP {

def performSum(value:Int*) = {
			var result = 0
			for(i<-value) result = result + i
			result
		}                                 //> performSum: (value: Int*)Int
		
 performSum(1 to 10:_*)                           //> res0: Int = 55
}