package com.ajarajeswarirsapplication.app.modules.student.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ajarajeswarirsapplication.app.modules.student.`data`.model.StudentModel
import org.koin.core.KoinComponent

class StudentVM : ViewModel(), KoinComponent {
  val studentModel: MutableLiveData<StudentModel> = MutableLiveData(StudentModel())

  var navArguments: Bundle? = null
}
