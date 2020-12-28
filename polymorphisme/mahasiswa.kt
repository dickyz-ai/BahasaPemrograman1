package polymorphisme


class mahasiswa : orang() {

    var nim: String = ""
    var prodi: String = ""


    fun belajar(){
        println("Saya belajar di prodi $prodi")
    }

    override fun perkenalan(){
        println("Kenalin dong, Aku $nama dari $alamat")
    }
}