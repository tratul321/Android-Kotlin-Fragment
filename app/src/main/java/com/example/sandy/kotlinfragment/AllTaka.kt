package com.example.sandy.kotlinfragment

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.all_taka.view.*

class AllTaka:Fragment()
{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v=inflater.inflate(R.layout.all_taka,container,false)


        v.testing.setOnClickListener(View.OnClickListener {
            val builder = AlertDialog.Builder(this.context)
            builder.setTitle(R.string.five_taka_title)
            builder.setMessage(R.string.five_takah)
//builder.setPositiveButton("OK", DialogInterface.OnClickListener(function = x))

            builder.setPositiveButton(android.R.string.yes) { dialog, which ->
            }

            builder.show()
        })

        v.twenty_history.setOnClickListener(View.OnClickListener {
            val builder_twenty = AlertDialog.Builder(this.context)
            builder_twenty.setTitle(R.string.twenty_takat)
            builder_twenty.setMessage(R.string.twenty_takah)
//builder.setPositiveButton("OK", DialogInterface.OnClickListener(function = x))

            builder_twenty.setPositiveButton(android.R.string.yes) { dialog, which ->
            }

            builder_twenty.show()
        })

        v.hundred_history.setOnClickListener(View.OnClickListener {
            val builder_twenty = AlertDialog.Builder(this.context)
            builder_twenty.setTitle(R.string.hundred_takat)
            builder_twenty.setMessage(R.string.hundred_takah)
//builder.setPositiveButton("OK", DialogInterface.OnClickListener(function = x))

            builder_twenty.setPositiveButton(android.R.string.yes) { dialog, which ->
            }

            builder_twenty.show()
        })
        return v


    }





}