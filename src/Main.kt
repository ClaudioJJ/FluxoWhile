fun ex1w() {
    val caixaDagua = 2000
    val balon = 7

    var numBaloes = 0

    while (numBaloes * balon + balon < caixaDagua) {
        numBaloes++
    }
    println("cabem $numBaloes na caixa!")

}


fun main() {
 ex1w()
}