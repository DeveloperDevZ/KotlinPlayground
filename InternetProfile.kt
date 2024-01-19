fun main(){
	val amanda = Person("Amanda", 33, "play tennis", null)
	val ati = Person("Ati", 28, null, amanda)

	amanda.showProfile()
	ati.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?){
	fun showProfile(){
		//Optional Wrapping 

		val hobbyStatement = if(hobby != null){
			"Likes to $hobby."
		}else{
			"Does not have a hobby."
		}


		val referringStatement  = if(referrer != null){
			"Has a referrer named ${referrer.name}, $hobbyStatement"
		}else{
			"Does NOT have a referrer."
		}	

		println("Name: $name")
		println("Age: $age")
		println("$hobbyStatement $referringStatement\n")
	}

	//Getter 
	fun showName(): String{
		return name
	}
}
