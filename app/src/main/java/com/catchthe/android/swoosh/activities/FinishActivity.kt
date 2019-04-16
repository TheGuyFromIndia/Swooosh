package com.catchthe.android.swoosh.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.catchthe.android.swoosh.R
import com.catchthe.android.swoosh.model.Player

import com.catchthe.android.swoosh.utilities.EXTRA_PLAYER

import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        lateinit var player: Player
        player = intent.getParcelableExtra(EXTRA_PLAYER)

        searchingText.text = "Looking for a ${player.league} ${player.skill} league near you"
    }
}
