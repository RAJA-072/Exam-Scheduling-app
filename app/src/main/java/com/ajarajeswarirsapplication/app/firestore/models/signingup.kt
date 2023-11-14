package com.ajarajeswarirsapplication.app.firestore.models

import com.google.firebase.firestore.PropertyName
import kotlin.String
import kotlin.jvm.JvmField

public class signingup {
  @JvmField
  @PropertyName("username")
  public var username: String? = null

  @JvmField
  @PropertyName("password")
  public var password: String? = null

  @JvmField
  @PropertyName("email")
  public var email: String? = null
}
