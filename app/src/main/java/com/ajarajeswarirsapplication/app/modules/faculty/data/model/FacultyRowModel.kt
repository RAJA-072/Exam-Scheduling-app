package com.ajarajeswarirsapplication.app.modules.faculty.`data`.model

import com.ajarajeswarirsapplication.app.R
import com.ajarajeswarirsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FacultyRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNoofDepartmen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_no_of_departmen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoofDepartmenOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_no_of_departmen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoofDepartmenTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_no_of_departmen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoofDepartmenThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_no_of_departmen)

)
