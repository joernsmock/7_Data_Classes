fun main() {
    data class Recipe(val title: String, val isVegetarian: Boolean) {
    }

    var r1 = Recipe("chicken bhuna", false)
    var r2 = Recipe("falafel", true)
    var r3 = Recipe("puttanesa sauce", false)
    var r4 = Recipe("chicken bhuna", false)

    val recipes = arrayOf(r1, r2, r3, r4)
    var n = 0
    var m = 0
    for (i in recipes) {
        for (j in recipes) {
            if (!(i === j) and (i == j)) {
                // because 2 recipes have same content, 2 are printed?
                // can I find-out/print the name of the r-variable too?
                val hash1 = i.hashCode().toString().takeLast(3)
                val hash2 = j.hashCode().toString().takeLast(3)
                println("n=$n/m=$m => ${i.title} === ${j.title};  hashes: ..$hash1, ..$hash2")
            }
            m = m + 1
        }
        n = n + 1
        m = 0
    }
}
