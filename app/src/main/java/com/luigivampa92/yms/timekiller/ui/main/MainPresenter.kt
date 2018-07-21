package com.luigivampa92.yms.timekiller.ui.main

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.luigivampa92.yms.timekiller.TimeKillerApplication
import com.luigivampa92.yms.timekiller.log
import com.luigivampa92.yms.timekiller.model.*
import com.luigivampa92.yms.timekiller.model.entity.GameField
import com.luigivampa92.yms.timekiller.model.entity.Letter
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch


@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {

    private val gamePreferences: GamePreferences = GamePreferencesImpl(TimeKillerApplication.INSTANCE)
    private val gameProvider: GameProvider = GameProviderImpl(StubWordsProviderImpl())

    private lateinit var currentField: GameField
    private var wordCurrent: String? = null
    private var wordToFill: String? = null

    private var currentDifficulty = 20

    private var time = 60

    fun updateViewState() {
        val wordsStr = currentField.word

        val word = ArrayList<Letter>()
        for (i in 0 until wordsStr!!.length) {
            word.add(Letter(wordsStr!![i], wordCurrent!!.length < i + 1, i))
        }

        viewState.setWord(word)
        viewState.setField(currentField.field)
    }

    fun start() {
        currentField = gameProvider.nextField(currentDifficulty)
        wordToFill = currentField.word
        wordCurrent = ""

        updateViewState()
        startTicker()
    }

    fun wordLetterClicked(letter: Letter) {
        log("letter ${letter.char.toString()} in word clicked")

    }

    fun fieldLetterClicked(letter: Letter) {
        if (wordToFill!![wordCurrent!!.length] == letter.char) {
            log("valid letter")
            viewState.playValid()
            // remove clicked letter from field
            val newLetter = letter.copy(isEmpty = true)
            (currentField.field as ArrayList).set(letter.position, newLetter)

            wordCurrent += letter.char

            if (wordCurrent!!.length == wordToFill!!.length) {
                currentDifficulty += 7
                time += 10
                viewState.playSuccess()
                start()
            }
        }
        else {
            log("invalid letter") // todo
            time -= 3
            viewState.playInvalid()
        }
        updateViewState()
    }

    fun startTicker() {
        launch {
            repeat(100000) {
                time--
                viewState.setTime(time)
                delay(1000L)
            }
        }
    }

    fun testWord() {
//        viewState.setWord(getTestWord())
//        viewState.setField(getTestField())
    }







//    private fun getTestWord() : List<Letter> {
//        val l1 = Letter('С', false, 0)
//        val l2 = Letter('Л', false, 1)
//        val l3 = Letter('О', false, 2)
//        val l4 = Letter('В', false, 3)
//        val l5 = Letter('О', false, 4)
//
//        return listOf(l1, l2, l3, l4, l5)
//    }
//
//    private fun getTestField() : List<Letter> {
//        val l01 = Letter('С', false, 0)
//        val l02 = Letter('Л', false, 1)
//        val l03 = Letter('О', false, 2)
//        val l04 = Letter('В', false, 3)
//        val l05 = Letter('О', true, 4)
//        val l06 = Letter('С', true, 5)
//        val l07 = Letter('Л', false, 6)
//        val l08 = Letter('О', true, 7)
//        val l09 = Letter('В', false,8)
//        val l10 = Letter('О', true,9)
//
//        val l11 = Letter('С', true,10)
//        val l12 = Letter('Л', false,11)
//        val l13 = Letter('О', true,12)
//        val l14 = Letter('В', false,13)
//        val l15 = Letter('О', true,14)
//        val l16 = Letter('С', true,15)
//        val l17 = Letter('Л', false,16)
//        val l18 = Letter('О', true,17)
//        val l19 = Letter('В', true,18)
//        val l20 = Letter('О', false,19)
//
//        val l21 = Letter('С', true)
//        val l22 = Letter('Л', true)
//        val l23 = Letter('О', true)
//        val l24 = Letter('В', false)
//        val l25 = Letter('О', true)
//        val l26 = Letter('С', true)
//        val l27 = Letter('Л', false)
//        val l28 = Letter('О', true)
//        val l29 = Letter('В', true)
//        val l30 = Letter('О', true)
//
//        val l31 = Letter('С', true)
//        val l32 = Letter('Л', true)
//        val l33 = Letter('О', false)
//        val l34 = Letter('В', true)
//        val l35 = Letter('О', true)
//        val l36 = Letter('С', false)
//        val l37 = Letter('Л', false)
//        val l38 = Letter('О', false)
//        val l39 = Letter('В', true)
//        val l40 = Letter('О', true)
//
//        val l41 = Letter('С', true)
//        val l42 = Letter('Л', true)
//        val l43 = Letter('О', true)
//        val l44 = Letter('В', false)
//        val l45 = Letter('О', true)
//        val l46 = Letter('С', false)
//        val l47 = Letter('Л', false)
//        val l48 = Letter('О', true)
//        val l49 = Letter('В', false)
//        val l50 = Letter('О', true)
//
//        val l51 = Letter('С', false)
//        val l52 = Letter('Л', false)
//        val l53 = Letter('О', false)
//        val l54 = Letter('В', true)
//        val l55 = Letter('О', false)
//        val l56 = Letter('С', true)
//        val l57 = Letter('Л', false)
//        val l58 = Letter('О', true)
//        val l59 = Letter('В', false)
//        val l60 = Letter('О', false)
//
//        val l61 = Letter('С', false)
//        val l62 = Letter('Л', false)
//        val l63 = Letter('О', false)
//        val l64 = Letter('В', false)
//
//        return arrayListOf(
//                l01,l02,l03,l04,l05,l06,l07,l08,l09,l10,
//                l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,
//                l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,
//                l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,
//                l41,l42,l43,l44,l45,l46,l47,l48,l49,l50,
//                l51,l52,l53,l54,l55,l56,l57,l58,l59,l60,
//                l61,l62,l63,l64
//        )
//    }
}