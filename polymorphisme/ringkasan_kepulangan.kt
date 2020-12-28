package polymorphisme

class ringkasan_kepulangan : pasien(){
    var tgl_pulang: String = ""
    var keadaan_pulang: String = ""

    fun dicatat(){
        println("Pasien dibolehkan untuk pulang pada tanggal $tgl_pulang dalam kondisi $keadaan_pulang")
    }
}