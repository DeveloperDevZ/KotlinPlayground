class Song(val title: String, val artist: String, val yearPublished: Int, var playCount: Int = 0){
	//Fields 
	var popular: Boolean = true

	fun summary(){
		println("[$title], performed by [$artist], was released in [$yearPublished]")
	}
}
fun main(){
	val useThisGospel = Song("Use this Gospel", "Eminem", 2023, 1000000)
	useThisGospel.summary()
}