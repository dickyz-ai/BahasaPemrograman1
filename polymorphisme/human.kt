package polymorphisme

open class human {
    var nama: String = ""
    var alamat: String = ""

    open fun perkenalan(){
        println("Perkenalkan nama saya $nama dari $alamat")
    }
}