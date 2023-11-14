package com.ajarajeswarirsapplication.app.modules.seating.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ajarajeswarirsapplication.app.R
import com.ajarajeswarirsapplication.app.appcomponents.base.BaseActivity
import com.ajarajeswarirsapplication.app.databinding.ActivitySeatingBinding
import com.ajarajeswarirsapplication.app.modules.faculty.ui.FacultyActivity
import com.ajarajeswarirsapplication.app.modules.seating.`data`.viewmodel.SeatingVM
import com.ajarajeswarirsapplication.app.modules.seatingavailability.ui.SeatingAvailabilityActivity
import com.ajarajeswarirsapplication.app.modules.student.ui.StudentActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SeatingActivity : BaseActivity<ActivitySeatingBinding>(R.layout.activity_seating) {
  private val viewModel: SeatingVM by viewModels<SeatingVM>()

  private val REQUEST_CODE_SEATING_AVAILABILITY_ACTIVITY: Int = 129


  private val REQUEST_CODE_STUDENT_ACTIVITY: Int = 686


  private val REQUEST_CODE_FACULTY_ACTIVITY: Int = 628


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.seatingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSeats.setOnClickListener {
      val destIntent = SeatingAvailabilityActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SEATING_AVAILABILITY_ACTIVITY)
    }
    binding.btnStudent.setOnClickListener {
      val destIntent = StudentActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_STUDENT_ACTIVITY)
    }
    binding.btnFaculty.setOnClickListener {
      val destIntent = FacultyActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_FACULTY_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "SEATING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SeatingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
