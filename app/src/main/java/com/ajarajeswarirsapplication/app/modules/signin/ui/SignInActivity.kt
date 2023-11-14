package com.ajarajeswarirsapplication.app.modules.signin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ajarajeswarirsapplication.app.R
import com.ajarajeswarirsapplication.app.appcomponents.base.BaseActivity
import com.ajarajeswarirsapplication.app.appcomponents.di.MyApp
import com.ajarajeswarirsapplication.app.databinding.ActivitySignInBinding
import com.ajarajeswarirsapplication.app.extensions.alert
import com.ajarajeswarirsapplication.app.extensions.isJSONObject
import com.ajarajeswarirsapplication.app.extensions.neutralButton
import com.ajarajeswarirsapplication.app.modules.homepage.ui.HomePageActivity
import com.ajarajeswarirsapplication.app.modules.signin.`data`.viewmodel.SignInVM
import com.ajarajeswarirsapplication.app.modules.signup.ui.SignUpActivity
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.QuerySnapshot
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.lang.Exception
import kotlin.Int
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class SignInActivity : BaseActivity<ActivitySignInBinding>(R.layout.activity_sign_in) {
  private val viewModel: SignInVM by viewModels<SignInVM>()

  private val REQUEST_CODE_SIGN_UP_ACTIVITY: Int = 297


  private val firestoreRef: FirebaseFirestore = Firebase.firestore


  private val REQUEST_CODE_HOME_PAGE_ACTIVITY: Int = 869


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtSignUp.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_UP_ACTIVITY)
    }
    binding.txtSignUp.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnvector.setOnClickListener {
      val queryLinearColumnvector = firestoreRef
      .collection("signingup")
      queryLinearColumnvector.orderBy("username", Query.Direction.ASCENDING)
      queryLinearColumnvector.limit(5)
      queryLinearColumnvector.get()
      .addOnSuccessListener { document ->
        onSuccessLinearColumnvectorQuery(document)
      }
      .addOnFailureListener { exception ->
        onErrorLinearColumnvectorQuery(exception)
      }
    }
    binding.btnLogin.setOnClickListener {
      val destIntent = HomePageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun onSuccessLinearColumnvectorQuery(result: QuerySnapshot?): Unit {
    if (result == null) return
    val signInModelValue = viewModel.signInModel.value
    viewModel.signInModel.value = signInModelValue
    val destIntent = HomePageActivity.getIntent(this, null)
    startActivityForResult(destIntent, REQUEST_CODE_HOME_PAGE_ACTIVITY)
  }

  private fun onErrorLinearColumnvectorQuery(exception: Exception): Unit {
    when(exception) {
      is HttpException -> {
        val errorBody = exception.response()?.errorBody()?.string()
        val errorObject = if (errorBody != null  && errorBody.isJSONObject()) JSONObject(errorBody)
        else JSONObject()
        val errMessage = MyApp.getInstance().getString(R.string.msg_invalid_username_and_pa)
        this@SignInActivity.alert(MyApp.getInstance().getString(R.string.lbl_error),errMessage) {
          neutralButton {
          }
        }
      }
    }
  }

  companion object {
    const val TAG: String = "SIGN_IN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignInActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
