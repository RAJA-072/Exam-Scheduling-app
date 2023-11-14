package com.ajarajeswarirsapplication.app.modules.faculty.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ajarajeswarirsapplication.app.R
import com.ajarajeswarirsapplication.app.appcomponents.base.BaseActivity
import com.ajarajeswarirsapplication.app.databinding.ActivityFacultyBinding
import com.ajarajeswarirsapplication.app.modules.faculty.`data`.model.FacultyRowModel
import com.ajarajeswarirsapplication.app.modules.faculty.`data`.viewmodel.FacultyVM
import com.ajarajeswarirsapplication.app.modules.student.ui.StudentActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FacultyActivity : BaseActivity<ActivityFacultyBinding>(R.layout.activity_faculty) {
  private val viewModel: FacultyVM by viewModels<FacultyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val facultyAdapter = FacultyAdapter(viewModel.facultyList.value?:mutableListOf())
    binding.recyclerFaculty.adapter = facultyAdapter
    facultyAdapter.setOnItemClickListener(
    object : FacultyAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FacultyRowModel) {
        onClickRecyclerFaculty(view, position, item)
      }
    }
    )
    viewModel.facultyList.observe(this) {
      facultyAdapter.updateData(it)
    }
    binding.facultyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtGroupTen.setOnClickListener {
      val destIntent = StudentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerFaculty(
    view: View,
    position: Int,
    item: FacultyRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FACULTY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FacultyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
