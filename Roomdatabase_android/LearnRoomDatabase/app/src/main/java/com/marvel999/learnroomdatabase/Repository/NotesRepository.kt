package com.marvel999.learnroomdatabase.Repository

import androidx.lifecycle.LiveData
import com.marvel999.learnroomdatabase.Repository.RoomDatabase.Notes
import com.marvel999.learnroomdatabase.Repository.RoomDatabase.NotesDao

class NotesRepository(private val noteDoa: NotesDao) {

    fun gatAlldata():LiveData<List<Notes>>{
        return noteDoa.getAllData()
    }

    suspend fun insetdata(notes: Notes){
        noteDoa.insetNotes(notes)
    }
    suspend fun deleteData(notes: Notes){
        noteDoa.deleteNotes(notes)
    }

}