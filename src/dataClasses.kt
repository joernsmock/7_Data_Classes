fun main() {
    data class Recipe(val title: String, val isVegetarian: Boolean) {
    }

    var r1 = Recipe("chicken bhuna", false)
    var r2 = Recipe("falafel", true)
    var r3 = Recipe("puttanesa sauce", false)
    var r4 = Recipe("chicken bhuna", false)

    val recipes = arrayOf(r1, r2, r3, r4)
    for (i in recipes) {
        for (j in recipes) {
            if (i !== j) {
                val iLen = i.hashCode().toString().length
                val h1 = i.hashCode().toString().takeLast(6)

                val jLen = j.hashCode().toString().length
                val h2 = j.hashCode().toString().takeLast(6)
                println("$h1 !== $h2")
            }
        }
    }
}
