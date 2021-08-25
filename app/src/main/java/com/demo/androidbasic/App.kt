package com.demo.androidbasic

import android.app.Application

/**
 * @author: hsw
 * @date: 2021/8/25
 * @desc:
 */
class App: Application() {
    companion object {
        private var ins: App? = null
        fun getInstance()  = ins!!
    }

    override fun onCreate() {
        super.onCreate()
        ins = this
    }
}