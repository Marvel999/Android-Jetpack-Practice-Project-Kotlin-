package com.marvel999.learnroomdatabase.Repository.RoomDatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Notes::class),version = 1,exportSchema = false)
 abstract class NotesRoomDatabase: RoomDatabase() {
    abstract fun getnoteDoa():NotesDao;
    companion object{
        @Volatile
        private var notesRoomDatabase:NotesRoomDatabase?=null;
        fun getDataBaseInstance(context: Context):NotesRoomDatabase{
         return notesRoomDatabase?:synchronized(this){
             val instence= Room.databaseBuilder(context.applicationContext,
                                                 NotesRoomDatabase::class.java,
                                                "notes_Database").build();
             notesRoomDatabase=instence;
             instence
         }
        }
    }

}