package com.luigivampa92.yms.timekiller.model

import java.util.*

class StubWordsProviderImpl : WordsProvider {

    val wordsArray = arrayOf("дом", "дым", "еда", "кот", "кит", "жар",
            "стол", "стул", "клон", "клоп", "апач", "море",
            "паром", "шакал", "принц", "барон", "порка", "полка",
            "яндекс", "барион", "фараон", "доклад", "патрон", "флакон",
            "октагон", "шершень", "аксакал", "москвич", "жаровня", "теплица")

    val random = Random(Date().time)

    override fun getWordByLetterCount(count: Int): String {
        val filteredArray = wordsArray.filter {it.length == count}
        val targetSize = filteredArray.size
        val word = if (targetSize != 0) filteredArray[random.nextInt(targetSize)] else "армагеддон"
        return word

    }
}