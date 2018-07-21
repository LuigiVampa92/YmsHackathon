package com.luigivampa92.yms.timekiller.model

import com.luigivampa92.yms.timekiller.model.entity.GameField
import com.luigivampa92.yms.timekiller.model.entity.Letter
import java.util.*

class GameProviderImpl(val wordsProvider : WordsProvider) : GameProvider{

    private val gameFieldSize = 8
    private val allLettersString = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"


    private val uniqueGuard : MutableSet<String> = mutableSetOf()

    private val random = Random(Date().time)


    override fun restart() {

       uniqueGuard.clear()
    }

    override fun nextField(difficultyLevel: Int): GameField {
        var word : String
        val wordLen = difficultyLevel % 6 + 3
        val noiseCount = difficultyLevel / 6
        do {
            word = wordsProvider.getWordByLetterCount(wordLen)
        } while (!uniqueGuard.contains(word))

        uniqueGuard.add(word)

        val field : Array<Array<Letter>> = Array(gameFieldSize) { Array(gameFieldSize) { Letter(' ', true) } }

        val noiseSymbols = allLettersString.filter { it -> !word.contains(it)}

        val repositionGuard = mutableSetOf<Int>()

        var i = 0

        do {
            val x = random.nextInt(gameFieldSize)
            val y = random.nextInt(gameFieldSize)
            val guard = x * 1000 + y
            if (!repositionGuard.contains(guard)){

                val newLetter = Letter(word[i++].toUpperCase(), true)
                field[x][y] = newLetter
                repositionGuard.add(guard)
            }
        }while (i < word.length)

        do {
            val r = random.nextInt(noiseSymbols.length)
            val noise = noiseSymbols[r]
            val x = random.nextInt(gameFieldSize)
            val y = random.nextInt(gameFieldSize)
            val guard = x * 1000 + y
            if (!repositionGuard.contains(guard)){

                val newLetter = Letter(noise.toUpperCase(), true)
                field[x][y] = newLetter
                repositionGuard.add(guard)
                i++
            }
        }while (i < noiseCount)

        return GameField(field, word)
    }
}