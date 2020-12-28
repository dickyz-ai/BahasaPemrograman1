package inheritance

import inheritance1.ayah

open class ibu_rumah_tangga : ayah(){
    var merapihkan: String = ""
    var perlengkapan: String = ""

    fun merapihkan(){
        println("ibu biasanya merapihkan $merapihkan" +
                " dan mempersiapkan $perlengkapan untuk ayah ")
    }
}