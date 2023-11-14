package com.ajarajeswarirsapplication.app.modules.finalpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ajarajeswarirsapplication.app.modules.finalpage.`data`.model.FinalPageModel
import com.ajarajeswarirsapplication.app.modules.finalpage.`data`.model.FinalPageRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FinalPageVM : ViewModel(), KoinComponent {
  val finalPageModel: MutableLiveData<FinalPageModel> = MutableLiveData(FinalPageModel())

  var navArguments: Bundle? = null

  val finalPageList: MutableLiveData<MutableList<FinalPageRowModel>> =
      MutableLiveData(mutableListOf())
}
