package com.ajarajeswarirsapplication.app.modules.faculty.`data`.model

import com.ajarajeswarirsapplication.app.R
import com.ajarajeswarirsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FacultyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFacultyDetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_faculty_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSAVECONTINUE: String? = MyApp.getInstance().resources.getString(R.string.lbl_save_continue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_save_continue)

)
