package com.ajarajeswarirsapplication.app.modules.welcomepage.`data`.model

import com.ajarajeswarirsapplication.app.R
import com.ajarajeswarirsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class WelcomePageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWELCOME: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGettingYourSe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_getting_your_se)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_in)

)
