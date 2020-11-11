package com.marvel999.learnroomdatabase.ViewModel

import android.app.Application
import android.provider.ContactsContract
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.marvel999.learnroomdatabase.Repository.NotesRepository
import com.marvel999.learnroomdatabase.Repository.RoomDatabase.Notes
import com.marvel999.learnroomdatabase.Repository.RoomDatabase.NotesRoomDatabase

class NoteViewModel(application: Application):AndroidViewModel(application){
 var allNote:LiveData<List<Notes>>;

init {
        val dao=NotesRoomDatabase.getDataBaseInstance(application).getnoteDoa()
       val databaseRepo:NotesRepository= NotesRepository(dao);
        allNote= databaseRepo.gatAlldata()

    }
}