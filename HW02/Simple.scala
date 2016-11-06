object Simple extends App {
	
  val Arr = Array[Int](10,25,30)

	Arr.foreach((arg: Int) => 
	if(arg%2 == 1){
		println(3*arg)
	}

	else if(arg%2== 0){
		println(2*arg)
	}
)	

}