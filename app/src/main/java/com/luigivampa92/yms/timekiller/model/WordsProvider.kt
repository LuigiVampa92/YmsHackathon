package com.luigivampa92.yms.timekiller.model

interface WordsProvider {
    fun getWordByLetterCount(count: Int): String
}