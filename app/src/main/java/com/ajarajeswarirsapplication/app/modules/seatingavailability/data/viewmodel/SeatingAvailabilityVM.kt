package com.ajarajeswarirsapplication.app.modules.seatingavailability.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ajarajeswarirsapplication.app.modules.seatingavailability.`data`.model.SeatingAvailabilityModel
import org.koin.core.KoinComponent

class SeatingAvailabilityVM : ViewModel(), KoinComponent {
  val seatingAvailabilityModel: MutableLiveData<SeatingAvailabilityModel> =
      MutableLiveData(SeatingAvailabilityModel())

  var navArguments: Bundle? = null
}
