package com.ajarajeswarirsapplication.app.modules.faculty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ajarajeswarirsapplication.app.modules.faculty.`data`.model.FacultyModel
import com.ajarajeswarirsapplication.app.modules.faculty.`data`.model.FacultyRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FacultyVM : ViewModel(), KoinComponent {
  val facultyModel: MutableLiveData<FacultyModel> = MutableLiveData(FacultyModel())

  var navArguments: Bundle? = null

  val facultyList: MutableLiveData<MutableList<FacultyRowModel>> = MutableLiveData(mutableListOf())
}
