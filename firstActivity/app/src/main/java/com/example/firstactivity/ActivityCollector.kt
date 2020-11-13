package com.example.firstactivity

import android.app.Activity

object ActivityCollector {
    private val activities = ArrayList<Activity>()

    fun addAct(activity: Activity){
        activities.add(activity)
    }
    fun removeAct(activity: Activity){
        activities.remove(activity)
    }
    fun finishAll(){
        for (act in activities){
            if (!act.isFinishing){
                act.finish()
            }
        }
        activities.clear()
    }

}