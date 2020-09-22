fun main() {
    data class Recipe(val title: String, val isVegetarian: Boolean) {
    }
    var r1 = Recipe("chicken bhuna", false)
    var r2 = Recipe("falafel", true)
    var r3 = Recipe("puttanesa sauce", false)
    var r4 = Recipe("chicken bhuna", false)

    val recipes = arrayOf( r1, r2, r3, r4)
    for (i in recipes) {
        println(i.hashCode())
        if (r1 == r4) {
            println("r1 equals r4")
        }
    }
}
