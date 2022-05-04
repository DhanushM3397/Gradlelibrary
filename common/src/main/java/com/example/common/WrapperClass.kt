package com.example.common

import android.app.Application

open class WrapperClass :Application() {
 lateinit  var wrapperClass:WrapperClass
    override fun onCreate() {
        super.onCreate()
        wrapperClass=this
    }
 fun getWrapperApplication():WrapperClass{

     return  wrapperClass;
 }
}