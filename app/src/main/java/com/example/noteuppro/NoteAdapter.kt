package com.example.noteuppro

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.item_row.view.*

class NoteAdapter(private val list : ArrayList<Notes?>):RecyclerView.Adapter<NoteAdapter.Noteholder>()
{
  inner class Noteholder(itemView :View) : RecyclerView.ViewHolder(itemView) {

      init {
          itemView.setOnClickListener {
              Toast.makeText(ctx,list[adapterPosition]?.title,Toast.LENGTH_SHORT).show()
          }
      }

    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): NoteAdapter.Noteholder {
        ctx = parent.context
        val inflatedView = LayoutInflater.from(ctx)
            .inflate(R.layout.item_row,parent,false)
        return Noteholder(inflatedView)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(p0: NoteAdapter.Noteholder, p1: Int) {
        val currentNote = list[p1]
        with(p0.itemView)
        {
            tvtitle.text = currentNote?.title
            tvdesc.text = currentNote?.description
        }
    }

    lateinit var ctx : Context


}