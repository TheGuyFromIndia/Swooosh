package com.catchthe.android.swoosh

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class skillActivity : AppCompatActivity() {

    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }
}
