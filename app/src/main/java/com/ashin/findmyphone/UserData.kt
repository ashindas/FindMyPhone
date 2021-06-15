package com.ashin.findmyphone

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences

class UserData {
    var context:Context?=null
    var sharedRefer:SharedPreferences?=null
    constructor(context:Context)
    {
        this.context=context
        this.sharedRefer=context.getSharedPreferences("UserData",Context.MODE_PRIVATE)
    }
    fun savePhone(phone:String)
    {
        val editor=sharedRefer!!.edit()
        editor.putString("phone",phone)
        editor.commit()
    }

    fun getPhone(): String {
       val phone=sharedRefer!!.getString("phone","empty")
        if(phone.equals("empty"))
        {
            val intent=Intent(context,LoginActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context!!.startActivity(intent)
        }
        return phone!!
    }
}