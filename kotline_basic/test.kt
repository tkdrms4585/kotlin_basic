class Position(n1:Int, n2:Int) {
    var x=n1
    var y=n2
    init { println ("($x, $y)") }
}

fun main() {
    val p1 = Position(0,0)
    val p2 = Position(10,10)
}