package com.duv.mvvmnotesapp.di

import android.app.Application
import androidx.room.Room
import com.duv.mvvmnotesapp.feature_notes.data.data_source.NoteDatabase
import com.duv.mvvmnotesapp.feature_notes.data.repository.NoteRepositoryImpl
import com.duv.mvvmnotesapp.feature_notes.domain.repository.NoteRepository
import com.duv.mvvmnotesapp.feature_notes.domain.use_cases.AddNoteUC
import com.duv.mvvmnotesapp.feature_notes.domain.use_cases.DeleteNoteUC
import com.duv.mvvmnotesapp.feature_notes.domain.use_cases.GetNotesUC
import com.duv.mvvmnotesapp.feature_notes.domain.use_cases.NoteUsecases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUsecases(repository: NoteRepository): NoteUsecases{
        return NoteUsecases(
            getNotes = GetNotesUC(repository),
            deleteNote = DeleteNoteUC(repository),
            addNote = AddNoteUC(repository)
        )
    }
}