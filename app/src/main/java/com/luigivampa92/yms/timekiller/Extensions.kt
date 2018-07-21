package com.luigivampa92.yms.timekiller

import android.util.Log
import android.view.View

fun log(message: String) {
    Log.d("TESTTEST", message)
}

fun View.setVisible(visible: Boolean) {
    this.visibility = if (visible) View.VISIBLE else View.GONE
}