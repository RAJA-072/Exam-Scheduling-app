package com.ajarajeswarirsapplication.app.modules.homepage.`data`.model

import com.ajarajeswarirsapplication.app.R
import com.ajarajeswarirsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomePageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYourSchedules: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_your_schedules)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewSchedule: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_schedule)

)
