package com.ajarajeswarirsapplication.app.modules.seatingavailability.`data`.model

import com.ajarajeswarirsapplication.app.R
import com.ajarajeswarirsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SeatingAvailabilityModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_room_availabili)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalNoofRoo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_total_no_of_roo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRoomName: String? = MyApp.getInstance().resources.getString(R.string.lbl_room_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeatingAvailab: String? =
      MyApp.getInstance().resources.getString(R.string.msg_seating_availab)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_save_continue)

)
