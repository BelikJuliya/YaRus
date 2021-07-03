package android.example.yarus.view.domain.entities


data  class Character(
    val id: Int,
    val name: String,
    val species: String,
    val gender: String,
    val image: String
) {
    //val id: Int
    lateinit var status: String
    lateinit var type: String
    lateinit var origin: Location
    lateinit var location: Location
    lateinit var episode: List<Episode>
    lateinit var url: String
    lateinit var created: String
}



