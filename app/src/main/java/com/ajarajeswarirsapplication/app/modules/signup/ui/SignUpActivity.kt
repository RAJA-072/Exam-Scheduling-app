package com.ajarajeswarirsapplication.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ajarajeswarirsapplication.app.R
import com.ajarajeswarirsapplication.app.appcomponents.base.BaseActivity
import com.ajarajeswarirsapplication.app.databinding.ActivitySignUpBinding
import com.ajarajeswarirsapplication.app.firestore.models.signingup
import com.ajarajeswarirsapplication.app.modules.signin.ui.SignInActivity
import com.ajarajeswarirsapplication.app.modules.signup.`data`.viewmodel.SignUpVM
import com.ajarajeswarirsapplication.app.modules.welcomepage.ui.WelcomePageActivity
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.lang.Exception
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
  private val viewModel: SignUpVM by viewModels<SignUpVM>()

  private val firestoreRef: FirebaseFirestore = Firebase.firestore


  private val REQUEST_CODE_SIGN_IN_ACTIVITY: Int = 180


  private val REQUEST_CODE_WELCOME_PAGE_ACTIVITY: Int = 691


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.viewBoxTwo.setOnClickListener {
      firestoreRef
      .collection("signingup")
      .add(signingup().apply {
        this.username = viewModel.signUpModel.value?.etValueValue
        this.password = viewModel.signUpModel.value?.etBoxOneValue
        this.email = viewModel.signUpModel.value?.etBoxValue
        })
        .addOnSuccessListener { documentReference ->
          onSuccessViewBoxTwoStore(documentReference)
        }
        .addOnFailureListener { exception ->
          onErrorViewBoxTwoStore(exception)
        }
      }
      binding.btnSignUp.setOnClickListener {
        val destIntent = SignInActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    private fun onSuccessViewBoxTwoStore(result: DocumentReference?): Unit {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_IN_ACTIVITY)
    }

    private fun onErrorViewBoxTwoStore(exception: Exception): Unit {
      when(exception) {
      }
      val destIntent = WelcomePageActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_WELCOME_PAGE_ACTIVITY)
    }

    companion object {
      const val TAG: String = "SIGN_UP_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SignUpActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
