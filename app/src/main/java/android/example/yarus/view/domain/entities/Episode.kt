package android.example.yarus.view.domain.entities

data class Episode(
    val id: Int, val name: String, val air_date: String
) {
    lateinit var episode: String
    lateinit var characters: List<Character>
    lateinit var url: String
    lateinit var created: String
}