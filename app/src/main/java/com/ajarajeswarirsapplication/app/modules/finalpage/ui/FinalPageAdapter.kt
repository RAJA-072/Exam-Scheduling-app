package com.ajarajeswarirsapplication.app.modules.finalpage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ajarajeswarirsapplication.app.R
import com.ajarajeswarirsapplication.app.databinding.RowFinalPageBinding
import com.ajarajeswarirsapplication.app.modules.finalpage.`data`.model.FinalPageRowModel
import kotlin.Int
import kotlin.collections.List

class FinalPageAdapter(
  var list: List<FinalPageRowModel>
) : RecyclerView.Adapter<FinalPageAdapter.RowFinalPageVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFinalPageVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_final_page,parent,false)
    return RowFinalPageVH(view)
  }

  override fun onBindViewHolder(holder: RowFinalPageVH, position: Int) {
    val finalPageRowModel = FinalPageRowModel()
    // TODO uncomment following line after integration with data source
    // val finalPageRowModel = list[position]
    holder.binding.finalPageRowModel = finalPageRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<FinalPageRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: FinalPageRowModel
    ) {
    }
  }

  inner class RowFinalPageVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowFinalPageBinding = RowFinalPageBinding.bind(itemView)
  }
}
