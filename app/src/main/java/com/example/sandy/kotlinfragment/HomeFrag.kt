package com.example.sandy.kotlinfragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.homefrag.view.*

class HomeFrag:Fragment()
{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v=inflater.inflate(R.layout.homefrag,container,false)



        v.button_ar.setOnClickListener({

            var fManager=activity!!.supportFragmentManager

            var tx =fManager.beginTransaction()
            tx.replace(R.id.frag,CameraLibrary())
            tx.addToBackStack(null)
            tx.commit()
        })

        v.button_how.setOnClickListener({

            var fManager=activity!!.supportFragmentManager

            var tx =fManager.beginTransaction()
            tx.replace(R.id.frag,Instructions())
            tx.addToBackStack(null)
            tx.commit()
        })

        v.button_about.setOnClickListener({

            var fManager=activity!!.supportFragmentManager

            var tx =fManager.beginTransaction()
            tx.replace(R.id.frag,About())
            tx.addToBackStack(null)
            tx.commit()
        })


        return v
    }


}