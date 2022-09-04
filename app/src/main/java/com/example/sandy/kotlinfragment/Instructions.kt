package com.example.sandy.kotlinfragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.instructions.view.*

class Instructions:Fragment()
{

    var i=0;

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v=inflater.inflate(R.layout.instructions,container,false)


        v.left_button.setOnClickListener(View.OnClickListener {
            if (i >0)
                i--;
            if(i==0){
                v.instructions.setText(R.string.take_note)
                v.takanote.setImageResource(R.drawable.takanote)
            }
            else if (i == 1) {
                v.instructions.setText(R.string.second_instruction)
                v.takanote.setImageResource(R.drawable.mosque)
            }

            else if (i == 2) {
                v.instructions.setText(R.string.third_instruction)
                v.takanote.setImageResource(R.drawable.phonehold)
            }
        })

        v.right_button.setOnClickListener(View.OnClickListener {
            if (i <3) i++;
            if(i==0){
                v.instructions.setText(R.string.take_note)
                v.takanote.setImageResource(R.drawable.takanote)
            }
            else if (i == 1) {
                v.instructions.setText(R.string.second_instruction)
                v.takanote.setImageResource(R.drawable.mosque)
            }

            else if (i == 2) {
                v.instructions.setText(R.string.third_instruction)
                v.takanote.setImageResource(R.drawable.phonehold)
            }
        })




        return v
    }


}