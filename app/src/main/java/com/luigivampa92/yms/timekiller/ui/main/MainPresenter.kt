package com.luigivampa92.yms.timekiller.ui.main

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.luigivampa92.yms.timekiller.log
import com.luigivampa92.yms.timekiller.model.entity.Letter

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {

    fun wordLetterClicked(letter: Letter) {
        log("letter ${letter.char.toString()} in word clicked")
    }

    fun fieldLetterClicked(letter: Letter) {
        log("letter ${letter.char.toString()} in field clicked")
    }

    fun testWord() {
        showTestWord()
        showTestField()
    }




    private fun showTestWord() {
        val l1 = Letter('С', false)
        val l2 = Letter('Л', false)
        val l3 = Letter('О', false)
        val l4 = Letter('В', false)
        val l5 = Letter('О', false)

        viewState.setWord(listOf(l1, l2, l3, l4, l5))
    }

    private fun showTestField() {
        val l01 = Letter('С', false)
        val l02 = Letter('Л', false)
        val l03 = Letter('О', false)
        val l04 = Letter('В', false)
        val l05 = Letter('О', true)
        val l06 = Letter('С', true)
        val l07 = Letter('Л', false)
        val l08 = Letter('О', true)
        val l09 = Letter('В', false)
        val l10 = Letter('О', true)

        val l11 = Letter('С', true)
        val l12 = Letter('Л', false)
        val l13 = Letter('О', true)
        val l14 = Letter('В', false)
        val l15 = Letter('О', true)
        val l16 = Letter('С', true)
        val l17 = Letter('Л', false)
        val l18 = Letter('О', true)
        val l19 = Letter('В', true)
        val l20 = Letter('О', false)

        val l21 = Letter('С', true)
        val l22 = Letter('Л', true)
        val l23 = Letter('О', true)
        val l24 = Letter('В', false)
        val l25 = Letter('О', true)
        val l26 = Letter('С', true)
        val l27 = Letter('Л', false)
        val l28 = Letter('О', true)
        val l29 = Letter('В', true)
        val l30 = Letter('О', true)

        val l31 = Letter('С', true)
        val l32 = Letter('Л', true)
        val l33 = Letter('О', false)
        val l34 = Letter('В', true)
        val l35 = Letter('О', true)
        val l36 = Letter('С', false)
        val l37 = Letter('Л', false)
        val l38 = Letter('О', false)
        val l39 = Letter('В', true)
        val l40 = Letter('О', true)

        val l41 = Letter('С', true)
        val l42 = Letter('Л', true)
        val l43 = Letter('О', true)
        val l44 = Letter('В', false)
        val l45 = Letter('О', true)
        val l46 = Letter('С', false)
        val l47 = Letter('Л', false)
        val l48 = Letter('О', true)
        val l49 = Letter('В', false)
        val l50 = Letter('О', true)

        val l51 = Letter('С', false)
        val l52 = Letter('Л', false)
        val l53 = Letter('О', false)
        val l54 = Letter('В', true)
        val l55 = Letter('О', false)
        val l56 = Letter('С', true)
        val l57 = Letter('Л', false)
        val l58 = Letter('О', true)
        val l59 = Letter('В', false)
        val l60 = Letter('О', false)

        val l61 = Letter('С', false)
        val l62 = Letter('Л', false)
        val l63 = Letter('О', false)
        val l64 = Letter('В', false)

        viewState.setField(
                arrayListOf(
                        l01,l02,l03,l04,l05,l06,l07,l08,l09,l10,
                        l11,l12,l13,l14,l05,l06,l07,l08,l09,l10,
                        l01,l02,l03,l04,l05,l06,l07,l08,l09,l10,
                        l01,l02,l03,l04,l05,l06,l07,l08,l09,l10,
                        l01,l02,l03,l04,l05,l06,l07,l08,l09,l10,
                        l01,l02,l03,l04,l05,l06,l07,l08,l09,l10,
                        l01,l02,l03,l04
                )
        )
    }
}