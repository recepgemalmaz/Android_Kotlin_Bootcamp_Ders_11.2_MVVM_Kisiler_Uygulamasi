package com.recepgemalmaz.kisileruygulamasi.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.recepgemalmaz.kisileruygulamasi.data.repo.KisilerRopository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class KisiKayitViewModel : ViewModel(){

    var krepo = KisilerRopository()

    fun kaydet(kisi_Ad : String, kisi_Tel : String){
        CoroutineScope(Dispatchers.Main).launch {
            krepo.kaydet(kisi_Ad, kisi_Tel)
        }

    }
}