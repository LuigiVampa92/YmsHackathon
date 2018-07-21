package com.luigivampa92.yms.timekiller.model

import com.luigivampa92.yms.timekiller.model.entity.GameField

interface GameProvider {
    fun restart()
    fun nextField(difficultyLevel: Int) : GameField
}