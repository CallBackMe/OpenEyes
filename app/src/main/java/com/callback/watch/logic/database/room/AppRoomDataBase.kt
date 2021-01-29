package com.callback.watch.logic.database.room

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.callback.watch.WatchApplication
import com.callback.watch.common.util.logE
import com.callback.watch.logic.file.FileManager

@Database(
    entities = [User::class],
    version = 1
)
abstract class AppRoomDataBase : RoomDatabase() {

    companion object {

        private const val DATABASE_NAME: String = "open_eyes.db"

        private var instance: AppRoomDataBase? = null

        fun getInstance(): AppRoomDataBase {

            if(instance == null){
                val dbPath = FileManager.getBaseDir() + "/" + DATABASE_NAME
                logE("ocean", " ++++++++++++++ dbPath = $dbPath");
                instance = Room.databaseBuilder(
                    WatchApplication.context,
                    AppRoomDataBase::class.java,
                    dbPath
                ).allowMainThreadQueries().build()
            }

            return instance as AppRoomDataBase
        }

    }

    abstract fun userDao(): UserDao

}