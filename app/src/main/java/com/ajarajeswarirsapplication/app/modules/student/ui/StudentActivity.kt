package com.ajarajeswarirsapplication.app.modules.student.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ajarajeswarirsapplication.app.R
import com.ajarajeswarirsapplication.app.appcomponents.base.BaseActivity
import com.ajarajeswarirsapplication.app.databinding.ActivityStudentBinding
import com.ajarajeswarirsapplication.app.modules.seatingavailability.ui.SeatingAvailabilityActivity
import com.ajarajeswarirsapplication.app.modules.student.`data`.viewmodel.StudentVM
import kotlin.String
import kotlin.Unit

class StudentActivity : BaseActivity<ActivityStudentBinding>(R.layout.activity_student) {
  private val viewModel: StudentVM by viewModels<StudentVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.studentVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtGroupThirtyOne.setOnClickListener {
      val destIntent = SeatingAvailabilityActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "STUDENT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, StudentActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
