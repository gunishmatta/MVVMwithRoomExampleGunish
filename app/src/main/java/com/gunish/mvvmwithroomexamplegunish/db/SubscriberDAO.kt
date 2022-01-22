package com.gunish.mvvmwithroomexamplegunish.db

import androidx.room.*

@Dao
interface SubscriberDAO {
    @Insert
    suspend fun insertSubscriber(subscriber:Subscriber):Long
    @Update
    suspend fun updateSubscriber(subscriber: Subscriber):Int
    @Delete
    suspend fun deleteSubscriber(subscriber: Subscriber):Int
    @Query("DELETE FROM subscriber_data_table")
    suspend fun deleteAll():Int

}