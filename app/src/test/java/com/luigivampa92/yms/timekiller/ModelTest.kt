package com.luigivampa92.yms.timekiller

import com.luigivampa92.yms.timekiller.model.GameProviderImpl
import com.luigivampa92.yms.timekiller.model.StubWordsProviderImpl
import com.luigivampa92.yms.timekiller.model.entity.Letter
import org.junit.Assert.*
import org.junit.Test

class StabWordsProviderImplTest {

    fun arraysToString(array : Array<Array<Letter>> ): String {
        var out = StringBuilder()
        for (a in array){
            for (letter in a){
                out.append(letter.char)
            }
        }
        return out.toString()
    }

    @Test
    fun testWordGetter() {
        val stub = StubWordsProviderImpl()
        val w3 = stub.getWordByLetterCount(3)
        assertEquals(3, w3.length)
        val w4 = stub.getWordByLetterCount(4)
        assertEquals(4, w4.length)
        val w5 = stub.getWordByLetterCount(5)
        assertEquals(5, w5.length)
        val w6 = stub.getWordByLetterCount(6)
        assertEquals(6, w6.length)
        val w7 = stub.getWordByLetterCount(7)
        assertEquals(7, w7.length)
    }

    @Test
    fun testFieldDiff1() {
        val stub = StubWordsProviderImpl()
        val game = GameProviderImpl(stub)

        game.restart()
        val f1 = game.nextField(1)
        assertEquals(4, f1.word.length);
        val s1 = arraysToString(f1.field)
        val s1c = s1.filter { it != ' ' }
        assertEquals(4, s1c.length)

        val f2 = game.nextField(70)
        assertEquals(7, f2.word.length);
        val s2 = arraysToString(f2.field)
        val s2c = s2.filter { it != ' ' }
        assertEquals(18, s2c.length)


    }
}