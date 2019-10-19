package com.company.myapplication

import FilmDataClass
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterFilm(var list: List<FilmDataClass>) : RecyclerView.Adapter<AdapterFilm.RecyclerViewHolder>() {


    lateinit var mClickListener: ClickListener

    fun setOnItemClickListener(aClickListener: ClickListener) {
        mClickListener = aClickListener
    }

    interface ClickListener {
        fun onClick(pos: Int, aView: View)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return RecyclerViewHolder(inflater, parent)
    }


    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val filmDataClass: FilmDataClass = list[position]
        holder.bind(filmDataClass)
    }


    override fun getItemCount(): Int = list.size




    inner class RecyclerViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
        RecyclerView.ViewHolder(inflater.inflate(R.layout.one_item, parent, false)), View.OnClickListener{

        override fun onClick(v: View) {
            mClickListener.onClick(adapterPosition, v)
        }

        private var name_film: TextView? = null
        private var country_film: TextView? = null
        private var year_film: TextView? = null
        private var age_film: TextView? = null

        init {
            name_film = itemView.findViewById(R.id.name_film)
            country_film = itemView.findViewById(R.id.country_film)
            year_film = itemView.findViewById(R.id.year_film)
            age_film = itemView.findViewById(R.id.age_film)

            itemView.setOnClickListener(this)

        }

        fun bind(filmDataClass: FilmDataClass) {

            name_film?.text = filmDataClass.name
            country_film?.text = filmDataClass.countries
            year_film?.text = filmDataClass.year.toString()
            age_film?.text = filmDataClass.age
        }



    }
}
