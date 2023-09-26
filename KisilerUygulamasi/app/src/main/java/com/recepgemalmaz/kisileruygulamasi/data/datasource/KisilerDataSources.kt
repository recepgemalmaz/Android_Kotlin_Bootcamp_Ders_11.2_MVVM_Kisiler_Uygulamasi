package com.recepgemalmaz.kisileruygulamasi.data.datasource

import android.util.Log
import com.recepgemalmaz.kisileruygulamasi.data.entity.Kisiler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KisilerDataSources {

    suspend fun kaydet(kisi_Ad : String, kisi_Tel : String){
        Log.e("Kisi Kaydet", "$kisi_Ad  -  $kisi_Tel")

    }
    suspend fun guncelle(kisi_id : Int, kisi_ad : String, kisi_tel : String){
        Log.e("Kisi Guncelle", "$kisi_id - $kisi_ad - $kisi_tel")
    }

    suspend fun sil(kisi_id : Int){
        Log.e("Kişi Sil", "${kisi_id.toString()}")
    }
    suspend fun kisileriYukle(): List<Kisiler> = withContext(Dispatchers.IO){
        val liste = ArrayList<Kisiler>()
        val k1 = Kisiler(1, "Recep", "0532 532 32 32")
        val k2 = Kisiler(2, "Ahmet", "0532 532 32 32")
        val k3 = Kisiler(3, "Mehmet", "0532 532 32 32")

        liste.add(k1)
        liste.add(k2)
        liste.add(k3)
        return@withContext liste

    }
    suspend fun ara(aramaKelimesi:String): List<Kisiler> = withContext(Dispatchers.IO){
        val liste = ArrayList<Kisiler>()
        val k1 = Kisiler(1, "Recep", "0532 532 32 32")

        liste.add(k1)

        return@withContext liste

    }
}