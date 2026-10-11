fun main(){
	val numlist = mutableListOf(1000)
	for(i in 1..10){
		numlist.add(i)
	}

	for(i in 0..10){
		println(numlist[i])
	}
}
