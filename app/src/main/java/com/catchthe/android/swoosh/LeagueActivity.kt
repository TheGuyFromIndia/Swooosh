package com.catchthe.android.swoosh

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class LeagueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun goToSkill(view: View) {
        val skillactivity = Intent(this, skillActivity::class.java)
        startActivity(skillactivity)
    }
}
