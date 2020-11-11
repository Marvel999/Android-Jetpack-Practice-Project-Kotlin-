package com.marvel999.learnroomdatabase.Repository.RoomDatabase

import android.view.inputmethod.InlineSuggestionsRequest
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Notes(@ColumnInfo(name = "Notes") var notes_text:String) {
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "Id")val id=0;
}