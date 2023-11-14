package com.ajarajeswarirsapplication.app.modules.faculty.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ajarajeswarirsapplication.app.R
import com.ajarajeswarirsapplication.app.databinding.RowFacultyBinding
import com.ajarajeswarirsapplication.app.modules.faculty.`data`.model.FacultyRowModel
import kotlin.Int
import kotlin.collections.List

class FacultyAdapter(
  var list: List<FacultyRowModel>
) : RecyclerView.Adapter<FacultyAdapter.RowFacultyVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFacultyVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_faculty,parent,false)
    return RowFacultyVH(view)
  }

  override fun onBindViewHolder(holder: RowFacultyVH, position: Int) {
    val facultyRowModel = FacultyRowModel()
    // TODO uncomment following line after integration with data source
    // val facultyRowModel = list[position]
    holder.binding.facultyRowModel = facultyRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<FacultyRowModel>) {
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
      item: FacultyRowModel
    ) {
    }
  }

  inner class RowFacultyVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowFacultyBinding = RowFacultyBinding.bind(itemView)
  }
}
