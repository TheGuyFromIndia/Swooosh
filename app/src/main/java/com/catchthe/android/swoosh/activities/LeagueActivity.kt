package com.catchthe.android.swoosh.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.catchthe.android.swoosh.R
import com.catchthe.android.swoosh.model.Player
import com.catchthe.android.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {


    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {

        womensB.isChecked = false
        coedb.isChecked = false

        player.league = "mens"

    }

    fun onWomensClicked(view: View) {

        mensB.isChecked = false
        coedb.isChecked = false

        player.league = "womens"

    }

    fun onCoedClicked(view: View) {
        womensB.isChecked = false
        mensB.isChecked = false

        player.league = "co-eds"

    }


    fun goToSkill(view: View) {
        if (player.league != "") {
            val skillactivity = Intent(this, skillActivity::class.java)
            skillactivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillactivity)
        } else
            Toast.makeText(this, "SELECT THE LEAGUE", Toast.LENGTH_SHORT).show()
    }
}
