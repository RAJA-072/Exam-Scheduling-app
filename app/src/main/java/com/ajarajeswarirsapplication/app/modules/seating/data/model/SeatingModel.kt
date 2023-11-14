package com.ajarajeswarirsapplication.app.modules.seating.`data`.model

import com.ajarajeswarirsapplication.app.R
import com.ajarajeswarirsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SeatingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsmakeour: String? = MyApp.getInstance().resources.getString(R.string.msg_let_s_make_our)

)
