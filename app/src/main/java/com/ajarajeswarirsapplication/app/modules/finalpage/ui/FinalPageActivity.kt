package com.ajarajeswarirsapplication.app.modules.finalpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ajarajeswarirsapplication.app.R
import com.ajarajeswarirsapplication.app.appcomponents.base.BaseActivity
import com.ajarajeswarirsapplication.app.databinding.ActivityFinalPageBinding
import com.ajarajeswarirsapplication.app.modules.finalpage.`data`.model.FinalPageRowModel
import com.ajarajeswarirsapplication.app.modules.finalpage.`data`.viewmodel.FinalPageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FinalPageActivity : BaseActivity<ActivityFinalPageBinding>(R.layout.activity_final_page) {
  private val viewModel: FinalPageVM by viewModels<FinalPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val finalPageAdapter = FinalPageAdapter(viewModel.finalPageList.value?:mutableListOf())
    binding.recyclerFinalPage.adapter = finalPageAdapter
    finalPageAdapter.setOnItemClickListener(
    object : FinalPageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FinalPageRowModel) {
        onClickRecyclerFinalPage(view, position, item)
      }
    }
    )
    viewModel.finalPageList.observe(this) {
      finalPageAdapter.updateData(it)
    }
    binding.finalPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerFinalPage(
    view: View,
    position: Int,
    item: FinalPageRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FINAL_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FinalPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
