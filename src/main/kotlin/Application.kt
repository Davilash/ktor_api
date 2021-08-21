import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*
import io.ktor.client.features.observer.*
import io.ktor.client.request.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject


suspend fun main(args: Array<String>) {

    val client = createHttpClient()

    val items: JsonObject = client.get("https://www.boredapi.com/api/activity")

    println(items)
    client.close()

}

fun createHttpClient(): HttpClient {

    return HttpClient(OkHttp) {

        install(JsonFeature) {
            serializer = KotlinxSerializer(json)

        }
        install(Logging) {

            logger = object : Logger {
                override fun log(message: String) {
                    println("Log msg $message")
                }

            }
            level = LogLevel.ALL
        }

        install(ResponseObserver) {
            onResponse { response ->
                println("HTTP status: ${response.status.value}")
            }
        }

//        // Timeout
//        install(HttpTimeout) {
//            requestTimeoutMillis = 15000L
//            connectTimeoutMillis = 15000L
//            socketTimeoutMillis = 15000L
//        }

    }
}

private val json = Json {
    ignoreUnknownKeys = true
    isLenient = true
    allowSpecialFloatingPointValues = true
}

