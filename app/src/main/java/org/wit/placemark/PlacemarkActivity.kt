package org.wit.placemark

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class PlacemarkActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        info("Placemark Activity started ...")
    }
}
