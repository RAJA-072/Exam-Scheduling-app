package com.ajarajeswarirsapplication.app.modules.seatingavailability.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ajarajeswarirsapplication.app.R
import com.ajarajeswarirsapplication.app.appcomponents.base.BaseActivity
import com.ajarajeswarirsapplication.app.databinding.ActivitySeatingAvailabilityBinding
import com.ajarajeswarirsapplication.app.modules.finalpage.ui.FinalPageActivity
import com.ajarajeswarirsapplication.app.modules.seatingavailability.`data`.viewmodel.SeatingAvailabilityVM
import kotlin.String
import kotlin.Unit

class SeatingAvailabilityActivity :
    BaseActivity<ActivitySeatingAvailabilityBinding>(R.layout.activity_seating_availability) {
  private val viewModel: SeatingAvailabilityVM by viewModels<SeatingAvailabilityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.seatingAvailabilityVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtGroupThirtyOne.setOnClickListener {
      val destIntent = FinalPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtGroupThirtyOne.setOnClickListener {
      val destIntent = FinalPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SEATING_AVAILABILITY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SeatingAvailabilityActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
