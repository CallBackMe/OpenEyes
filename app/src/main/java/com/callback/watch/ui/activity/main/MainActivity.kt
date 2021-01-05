package com.callback.watch.ui.activity.main

import android.os.Bundle
import com.callback.watch.R
import com.callback.watch.WatchApplication
import com.callback.watch.extension.logE
import com.callback.watch.logic.database.room.AppRoomDataBase
import com.callback.watch.logic.database.room.User
import com.callback.watch.ui.activity.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppRoomDataBase.getInstance().userDao().
        insertUser(User(1, "ocean.z", "China", true, 30))

        val user = AppRoomDataBase.getInstance().userDao().getUserById(1)
        logE(TAG_CLASS, " +++++++++ user name = ${user.userName}")

        //跟目录-->/storage/emulated/0/Android/data/cn.xdf.lespeaking/files
        val baseDir: File? = WatchApplication.context.getExternalFilesDir(null)
        val baseDirPath = baseDir?.absolutePath
        logE(TAG_CLASS, " +++++++++ user baseDir path = $baseDirPath")

    }
}