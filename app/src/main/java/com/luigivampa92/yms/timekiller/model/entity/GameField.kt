package com.luigivampa92.yms.timekiller.model.entity

import java.util.*

data class GameField (
        val field: Array<Array<Letter>>,
        val word: String
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GameField

        if (!Arrays.equals(field, other.field)) return false

        return true
    }

    override fun hashCode(): Int {
        return Arrays.hashCode(field)
    }
}