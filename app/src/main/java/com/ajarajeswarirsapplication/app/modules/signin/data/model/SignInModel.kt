package com.ajarajeswarirsapplication.app.modules.signin.`data`.model

import com.ajarajeswarirsapplication.app.R
import com.ajarajeswarirsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignInModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUserName: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_do_not_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etBoxValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etBoxOneValue: String? = null
)
