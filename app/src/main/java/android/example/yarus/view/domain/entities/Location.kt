package android.example.yarus.view.domain.entities

data class Location(
    val id: Int,
    val name: String,
    val type: String
) {
    lateinit var dimension: String
    lateinit var residents: List<Character>
    lateinit var url: String
    lateinit var created: String
}