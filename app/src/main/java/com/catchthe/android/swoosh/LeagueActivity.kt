package com.catchthe.android.swoosh

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var selectedleague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {

        womensB.isChecked = false
        coedb.isChecked = false

        selectedleague = "mens"

    }

    fun onWomensClicked(view: View) {

        mensB.isChecked = false
        coedb.isChecked = false

        selectedleague = "womens"

    }

    fun onCoedClicked(view: View) {
        womensB.isChecked = false
        mensB.isChecked = false

        selectedleague = "co-eds"

    }


    fun goToSkill(view: View) {
        if (selectedleague != "") {
            val skillactivity = Intent(this, skillActivity::class.java)
            skillactivity.putExtra(EXTRA_LEAGUE, selectedleague)
            startActivity(skillactivity)
        } else
            Toast.makeText(this, "SELECT THE LEAGUE", Toast.LENGTH_SHORT).show()
    }
}
