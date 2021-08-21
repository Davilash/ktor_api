import kotlinx.serialization.Serializable


@Serializable
data class DataModel(
   // val accessibility: Int,
    val activity: String
//    val key: String,
//    val link: String,
//    val participants: Int,
//    val price: Double,
//    val type: String
)


//
//@Serializable
//data class UserEntity(
//    @SerialName("id")
//    val id: String,
//    @SerialName("name")
//    val name: String,
//    @SerialName("currentRank")
//    val currentRank: Int,
//    @SerialName("totalStars")
//    val totalStars: Int,
//    @SerialName("totalWordsMastered")
//    val totalWordsMastered: Int,
//)


//@Serializable
//data class Item(
//    val id: Int,
//    @SerialName(value = "title") val title: String? = null,
//    val description: String? = null,
//    @SerialName(value = "image_url") val imageUrl: String? = null,
//    @SerialName(value = "is_featured") val isFeatured: Boolean? = null,
//    @SerialName(value = "publication_date") val publicationDateString: String? = null,
//    @SerialName(value = "share_link") val shareUrl: String? = null
//)

/*
data class DataModel(
    val accessibility: Double,
    val activity: String,
    val key: String,
    val link: String,
    val participants: Int,
    val price: Double,
    val type: String
)*/
