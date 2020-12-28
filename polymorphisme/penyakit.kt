package polymorphisme

class penyakit :pasien(){

    var tgl_periksa: String = ""

    fun diderita(){
        println("Pasien periksa pada tanggal $tgl_periksa dan didiagnosis sakit $nama")
    }
}