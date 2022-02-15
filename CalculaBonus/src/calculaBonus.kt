fun calculaBonus(a:Int, b: Int , c:Int) {
    println ("O bonus é :${a+b*c*2}")
}
fun hello (nome: String) : String {
    return "olá, $nome"
}
fun hello2 (nome: String) : String {
    return "olá, $nome"
}

fun main() {
    val a = 10
    val b = 20
    val c = 30

    calculaBonus(a,b,c)
    println(hello("jp"))
}