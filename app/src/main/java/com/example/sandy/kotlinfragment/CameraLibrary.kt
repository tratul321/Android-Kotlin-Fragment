package com.example.sandy.kotlinfragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.camera_library.view.*

class CameraLibrary:Fragment()
{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v=inflater.inflate(R.layout.camera_library,container,false)

        v.button_cam.setOnClickListener({
            var fManager=activity!!.supportFragmentManager
            var tx =fManager.beginTransaction()
            tx.replace(R.id.frag,AllTaka())
            tx.addToBackStack(null)
            tx.commit()
        })


        return v
    }


}