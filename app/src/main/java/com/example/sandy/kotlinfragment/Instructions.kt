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
                v.note_right.visibility = View.INVISIBLE
                v.note_left.visibility = View.INVISIBLE
            }
            else if(i==1){
                v.instructions.setText(R.string.second_instruction)
                v.note_right.visibility = View.VISIBLE
                v.note_left.visibility = View.VISIBLE
                v.takanote.setImageResource(R.drawable.takanote)
                v.note_right.setImageResource(R.drawable.long_right)
                v.note_left.setImageResource(R.drawable.long_left)
            }
            else if (i == 2) {
                v.instructions.setText(R.string.third_instruction)
                v.takanote.setImageResource(R.drawable.phonehold)
                v.note_right.visibility = View.INVISIBLE
                v.note_left.visibility = View.INVISIBLE
            }

            else if (i == 3) {
                v.instructions.setText("")
                v.takanote.setImageResource(R.drawable.mosque)
                v.note_right.visibility = View.INVISIBLE
                v.note_left.visibility = View.INVISIBLE
            }
        })

        v.right_button.setOnClickListener(View.OnClickListener {
            if (i <4) i++;
            if(i==0){
                v.instructions.setText(R.string.take_note)
                v.takanote.setImageResource(R.drawable.takanote)
                v.note_right.visibility = View.INVISIBLE
                v.note_left.visibility = View.INVISIBLE
            }
            else if(i==1){
                v.instructions.setText(R.string.second_instruction)
                v.note_right.visibility = View.VISIBLE
                v.note_left.visibility = View.VISIBLE
                v.takanote.setImageResource(R.drawable.takanote)
                v.note_right.setImageResource(R.drawable.long_right)
                v.note_left.setImageResource(R.drawable.long_left)
            }
            else if (i == 2) {
                v.instructions.setText(R.string.third_instruction)
                v.takanote.setImageResource(R.drawable.phonehold)
                v.note_right.visibility = View.INVISIBLE
                v.note_left.visibility = View.INVISIBLE
            }

            else if (i == 3) {
                v.instructions.setText(R.string.third_instruction)
                v.takanote.setImageResource(R.drawable.mosque)
                v.note_right.visibility = View.INVISIBLE
                v.note_left.visibility = View.INVISIBLE
            }
        })




        return v
    }


}