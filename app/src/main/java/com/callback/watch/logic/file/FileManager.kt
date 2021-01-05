package com.callback.watch.logic.file

import com.callback.watch.WatchApplication
import java.io.File

object FileManager {

    fun getBaseDir(): String? {
        val baseDir: File? = WatchApplication.context.getExternalFilesDir(null)
        return baseDir?.absolutePath
    }


}