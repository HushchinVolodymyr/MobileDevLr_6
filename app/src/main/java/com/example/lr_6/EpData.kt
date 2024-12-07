package com.example.lr_6

data class EpData (
    val kpd: Double,
    val cos: Double,
    val power: Double,
    val countEp: Int,
    val numPower: Int,
    var nP: Double = 0.0,
    val useKef: Double,
    val reactKef: Double,
    var npk: Double = 0.0,
    var npktg: Double = 0.0,
    var npPow: Double = 0.0,
    var groupCurrent: Double =0.0,
)