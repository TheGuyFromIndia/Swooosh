package com.catchthe.android.swoosh.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.catchthe.android.swoosh.R
import com.catchthe.android.swoosh.model.Player
import com.catchthe.android.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class skillActivity : AppCompatActivity() {


    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun begOnClick(view: View) {

        ballerBtn.isChecked = false
        player.skill = "beginner"


    }

    fun ballerOnClick(view: View) {

        beginnerBtn.isChecked = false
        player.skill = "baller"

    }

    fun finishOnClick(view: View) {
        if (player.skill != "") {
            val gotoFinish = Intent(this, FinishActivity::class.java)
            gotoFinish.putExtra(EXTRA_PLAYER, player)

            startActivity(gotoFinish)
        } else
            Toast.makeText(this, "SELECT A SKILL", Toast.LENGTH_SHORT).show()

    }
}
