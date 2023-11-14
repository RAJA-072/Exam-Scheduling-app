package com.ajarajeswarirsapplication.app.modules.student.`data`.model

import com.ajarajeswarirsapplication.app.R
import com.ajarajeswarirsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class StudentModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_student_detail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoofDepartmen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_no_of_departmen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStudentName: String? = MyApp.getInstance().resources.getString(R.string.lbl_student_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalNoofStu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_total_no_of_stu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_save_continue)

)
