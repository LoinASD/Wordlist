package io.cyanlab.wordlist.models.pdf

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class WordList {

    @PrimaryKey
    var id: Int? = null

    var maxWeight: Int = 0

    var currentWeight: Int = 0

    var wlName: String? = null


}