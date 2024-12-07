package com.example.lr_6

import kotlin.math.pow
import kotlin.math.sqrt



class EpCalculator {
    fun findEmptyFields(epList: List<EpData>): List<EpData> {

        epList.forEach {
            it.nP = (it.countEp * it.numPower).toDouble()

            it.groupCurrent = (it.countEp * it.numPower)/ sqrt(3.0) * it.power * it.cos * it.kpd

            it.npk = it.countEp * it.numPower * it.useKef

            it.npktg = it.countEp * it.numPower * it.useKef * it.reactKef

            it.npPow = it.numPower.toDouble().pow(2.0) * it.countEp
        }

        return epList
    }

    fun calcShrData(epList: List<EpData>): ShrData {
        val sumOfNp = epList.sumOf { it.nP }

        val shrData: ShrData = ShrData(
            countEp = epList.sumOf { it.countEp },
            nPGroup = epList.sumOf { it.nP.toInt() },
            useKefGroup = epList.sumOf { it.npk } / epList.sumOf { it.nP },
            npkGroup = epList.sumOf { it.npk },
            npktgGroup = epList.sumOf { it.npktg },
            npPow = epList.sumOf { it.npPow },
            effectionCountity = sumOfNp.pow(2) / epList.sumOf { it.npPow },
            activPowerKefGroup = 1.25,
            activLoadKefGroup = 1.25 * epList.sumOf { it.npk } ,
            reactLoadKefGroup = 1.0 * 107.302,
            fullPower = sqrt((1.25 * epList.sumOf { it.npk }).pow(2) + (1.0 * 107.302).pow(2)),
            groupCurrent = (1.25 * epList.sumOf { it.npk }) / 0.38
        )


        return shrData

    }

    fun fullOverload(epList: List<EpData>, shrData: ShrData, epHeavyList: List<EpData>): OverloadData {

        val overload: OverloadData = OverloadData(
            countEp = 81,
            nP = 2330,
            useKef = 752 / 2330.0,
            npk = 752.0,
            npktg = 657.0,
            npPow = 96399.0,
            effectionCountity = 2330.toDouble().pow(2) / 96399.0,
            activPowerKefGroup = 0.7,
            activLoadKefGroup = 0.7 * 752.0,
            reactLoadKefGroup = 0.7 * 657.0,
            fullPower = sqrt((0.7 * 752.0).pow(2) + (0.7 * 657.0).pow(2)),
            groupCurrent = (0.7 * 752.0) / 0.38
        )

        return overload
    }

}