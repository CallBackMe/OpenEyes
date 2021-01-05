package com.callback.watch.logic.database.room

import androidx.room.*

@Dao//Dao类是一个 interface，其中定义了一系列的操作数据库的方法。通常我们操作数据库无非就是增删改查。
interface UserDao {

    //SQL语句引用传递的参数直接使用 ：符号进行引用。
    @Query("select * from user where user_id = :id")
    fun getUserById(id: Long): User

    //上面说的 @Query 查询接受的参数是一个字符串，
    //所以像删除或者更新我们也可以使用 @Query 注解来使用SQL语句来直接执行。
    //比如根据userid来查询某个用户或者根据userid更新某个用户的姓名
    @Query("delete  from user where user_id = :id ")
    fun deleteUserById(id: Long)

    @Query("update  user set user_name = :name where user_id =  :id")
    fun updateUserName(id: Long, name: String)

    //我们看到直接中有个参数onConflict，表示的是当插入的数据已经存在时候的处理逻辑，
    //有三种操作逻辑：REPLACE、ABORT和IGNORE。如果不指定则默认为ABORT终止插入数据。这里我们将其指定为REPLACE替换原有数据。
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User)

    //如果需要删除表的数据则使用 @Delete注解
    @Delete
    fun deleteUser(user: User)

    //如果需要修改某一条数据则使用 @Update注解
    @Update
    fun updateUser(user: User)

}