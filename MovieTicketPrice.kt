fun main(){
	//Variables 
	val child = 5
	val adult = 28
	val senior = 87
	val invalid = 101

	val isMonday = true
		
	println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
	println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
	println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
	println("The movie ticket price for a person aged $invalid is \$${ticketPrice(invalid, isMonday)}.")

}

fun ticketPrice(age: Int, isMonday: Boolean): Int{
	if(age < 1 || age > 100){
		return -1
	}else if(age < 13){
		return 15
	}else if(age < 60){
		return if(isMonday) 25 else 30
	}else{
		return 20
	}
}