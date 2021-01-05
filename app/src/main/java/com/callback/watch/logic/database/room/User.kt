package com.callback.watch.logic.database.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "user", ignoredColumns = ["age"])//@Entity注解中我们传入了一个参数 tableName用来指定表的名称。
data class User(
    @PrimaryKey(autoGenerate = true)//@PrimaryKey注解用来标注表的主键，并且使用autoGenerate = true 来指定了主键自增长。
    @ColumnInfo(name = "user_id")
    var userId: Long,
    @ColumnInfo(name = "user_name")
    var userName: String,
    @ColumnInfo(name = "address", defaultValue = "中国")//@ColumnInfo注解用来标注表对应的列的信息比如表名、默认值等等。
    var address: String,
    @Ignore//@Ignore 注解顾名思义就是忽略这个字段，使用了这个注解的字段将不会在数据库中生成对应的列信息。todo:ignoredColumns
    var sex: Boolean,
    var age: Long
) {
    constructor() : this(0, "", "", true, 0)
}



