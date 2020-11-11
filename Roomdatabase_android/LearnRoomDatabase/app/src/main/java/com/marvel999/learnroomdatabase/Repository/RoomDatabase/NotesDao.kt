package com.marvel999.learnroomdatabase.Repository.RoomDatabase

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NotesDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insetNotes(notes:Notes)

    @Delete
    suspend fun deleteNotes(notes: Notes)  // suspend used for corutines

    @Query("SELECT * FROM Notes ORDER BY Id ASC")
    fun getAllData():LiveData<List<Notes>>


}