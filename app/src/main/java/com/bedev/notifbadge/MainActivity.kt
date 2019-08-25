package com.bedev.notifbadge

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nex3z.notificationbadge.NotificationBadge
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var notificationBadge: NotificationBadge
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        notificationBadge = NotificationBadge(this@MainActivity)

        btnNotif1.setOnClickListener {
            notificationBadge.setNumber(++count)
            badge.setNumber(count, true)
       }
        btnNotif99.setOnClickListener {
            val number = 99
            badge.setNumber(number, true)
        }
        btnNotifClear.setOnClickListener {
            badge.clear(true)
            count = 0
        }

    }
}
