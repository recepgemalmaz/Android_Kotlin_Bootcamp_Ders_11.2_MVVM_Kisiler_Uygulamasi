package com.recepgemalmaz.kisileruygulamasi.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.recepgemalmaz.kisileruygulamasi.data.entity.Kisiler
import com.recepgemalmaz.kisileruygulamasi.data.repo.KisilerRopository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnasayfaViewModel:ViewModel() {

    var krepo = KisilerRopository()
    var kisilerListesi = MutableLiveData<List<Kisiler>>()
    init {
        kisileriYukle()
    }

     fun sil(kisi_id : Int){
         CoroutineScope(Dispatchers.Main).launch {
             krepo.sil(kisi_id)
         }
    }

    fun kisileriYukle(){
        CoroutineScope(Dispatchers.Main).launch {
            kisilerListesi.value = krepo.kisileriYukle()
        }
    }

    fun ara(aramaKelimesi:String){
        CoroutineScope(Dispatchers.Main).launch {
            kisilerListesi.value = krepo.ara(aramaKelimesi)
        }
    }
}