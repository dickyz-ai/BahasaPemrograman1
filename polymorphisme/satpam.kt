package polymorphisme

class satpam : karyawan() {

    var pos: String = ""

    fun menjaga(){
        println("Saya menjaga di $pos")
        println(pos)
        println(this.pos)
        println(this.perkenalan())

        println(nama)
        println(super.nama)
    }

    override fun perkenalan(){
        println("Siap dan 86, saya $nama dari $alamat")
    }
}