package co.edu.udea.compumovil.gr04_20201.proyectoFinal.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T>(itemView: View): RecyclerView.ViewHolder(itemView){
    abstract fun bind(item: T,position:Int)
}