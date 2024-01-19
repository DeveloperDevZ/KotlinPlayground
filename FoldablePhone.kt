fun main(){
	var xiaomi = Phone(true)
	xiaomi.checkPhoneScreenLight()

	var moto = FoldablePhone(true)
	moto.checkPhoneScreenLight()
	moto.switchOn()
	moto.checkPhoneScreenLight()
	
}


open class Phone(var isScreenLightOn: Boolean = false){
	open fun switchOn(){
		isScreenLightOn = true
		
	}

	fun switchOff(){
		isScreenLightOn = false 

	}

	fun checkPhoneScreenLight(){
		val phoneScreenLight = if (isScreenLightOn) "On" else "Off"
		println("The phone screen light is $phoneScreenLight.")

	}
}


class FoldablePhone(var isFolded: Boolean): Phone(){

	fun toggleFold(){
		isFolded = !isFolded
	}

	override fun switchOn(){
		if(!isFolded){
			isScreenLightOn = true
		}
	}

}



