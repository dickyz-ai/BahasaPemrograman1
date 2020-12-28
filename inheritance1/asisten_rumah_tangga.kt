package inheritance

class asisten_rumah_tangga : ibu_rumah_tangga() {

        var tugas: String = ""
    var nama: String = ""

        fun membantu(){
            println("Ibu dibantu oleh asisten bernama $nama yang untuk mengerjakan $tugas")
        }
    }
