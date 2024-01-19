fun main(){
	printFinalTemperature(27.0, "Celsius", celsiusToFahrenheit)
	

	val celciusToFahrenheit: (Double) -> Double = { celsius ->
		(celsius * (9.0/5.0) + 32.0)  
	}

	
}

fun printFinalTemperature(initialMeasurement: Double, initialUnit: String, conversionFormula: (Double) -> Double){
	
	val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) //Two decimal point precision 
	println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees Fahrenheit.")

}