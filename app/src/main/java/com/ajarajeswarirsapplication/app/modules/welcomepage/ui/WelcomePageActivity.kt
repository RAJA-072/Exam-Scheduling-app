package com.ajarajeswarirsapplication.app.modules.welcomepage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ajarajeswarirsapplication.app.R
import com.ajarajeswarirsapplication.app.appcomponents.base.BaseActivity
import com.ajarajeswarirsapplication.app.databinding.ActivityWelcomePageBinding
import com.ajarajeswarirsapplication.app.modules.signin.ui.SignInActivity
import com.ajarajeswarirsapplication.app.modules.signup.ui.SignUpActivity
import com.ajarajeswarirsapplication.app.modules.welcomepage.`data`.viewmodel.WelcomePageVM
import kotlin.String
import kotlin.Unit

class WelcomePageActivity : BaseActivity<ActivityWelcomePageBinding>(R.layout.activity_welcome_page)
    {
  private val viewModel: WelcomePageVM by viewModels<WelcomePageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.welcomePageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLogIn.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSignUp.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowconfirmation.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "WELCOME_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WelcomePageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
