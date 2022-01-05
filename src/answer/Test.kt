package answer

class Test {
    var a:String?
        get() {
            return "1"
        }
        set(_) {}
}

fun main(){
    val test = Test()
    test.a = "1"
    test.a = null
}