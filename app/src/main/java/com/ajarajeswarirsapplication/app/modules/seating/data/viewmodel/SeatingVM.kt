package com.ajarajeswarirsapplication.app.modules.seating.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ajarajeswarirsapplication.app.modules.seating.`data`.model.SeatingModel
import org.koin.core.KoinComponent

class SeatingVM : ViewModel(), KoinComponent {
  val seatingModel: MutableLiveData<SeatingModel> = MutableLiveData(SeatingModel())

  var navArguments: Bundle? = null
}
