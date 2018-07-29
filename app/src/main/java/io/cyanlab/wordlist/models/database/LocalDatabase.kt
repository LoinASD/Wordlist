package io.cyanlab.wordlist.models.database

import androidx.room.Database
import androidx.room.RoomDatabase
import io.cyanlab.wordlist.models.pdf.Node
import io.cyanlab.wordlist.models.pdf.WordList


@Database(entities = arrayOf(WordList::class, Node::class), version = 1)
abstract class LocalDatabase : RoomDatabase() {

    abstract fun listDao(): ListDao

    abstract fun nodeDao(): NodeDao

}