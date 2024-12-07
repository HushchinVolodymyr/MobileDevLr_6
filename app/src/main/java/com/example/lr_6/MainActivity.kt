package com.example.lr_6

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val resultOutput: TextView = findViewById(R.id.resultOutput)

        val calcButton: Button = findViewById(R.id.calculateButton)

        val grindingNnInput: EditText = findViewById(R.id.grindingNnInput)
        val grindingCosInput: EditText = findViewById(R.id.grindingCosInput)
        val grindingUnInput: EditText = findViewById(R.id.grindingUnInput)
        val grindingNInput: EditText = findViewById(R.id.grindingNInput)
        val grindingPnInput: EditText = findViewById(R.id.grindingPnInput)
        val grindingKvInput: EditText = findViewById(R.id.grindingKvInput)
        val grindingTgInput: EditText = findViewById(R.id.grindingTgInput)

        val drilledNnInput: EditText = findViewById(R.id.drilledNnInput)
        val drilledCosInput: EditText = findViewById(R.id.drilledCosInput)
        val drilledUnInput: EditText = findViewById(R.id.drilledUnInput)
        val drilledNInput: EditText = findViewById(R.id.drilledNInput)
        val drilledPnInput: EditText = findViewById(R.id.drilledPnInput)
        val drilledKvInput: EditText = findViewById(R.id.drilledKvInput)
        val drilledTgInput: EditText = findViewById(R.id.drilledTgInput)

        val jointingNnInput: EditText = findViewById(R.id.jointingNnInput)
        val jointingCosInput: EditText = findViewById(R.id.jointingCosInput)
        val jointingUnInput: EditText = findViewById(R.id.jointingUnInput)
        val jointingNInput: EditText = findViewById(R.id.jointingNInput)
        val jointingPnInput: EditText = findViewById(R.id.jointingPnInput)
        val jointingKvInput: EditText = findViewById(R.id.jointingKvInput)
        val jointingTgInput: EditText = findViewById(R.id.jointingTgInput)

        val circularSawNnInput: EditText = findViewById(R.id.circularSawNnInput)
        val circularSawCosInput: EditText = findViewById(R.id.circularSawCosInput)
        val circularSawUnInput: EditText = findViewById(R.id.circularSawUnInput)
        val circularSawNInput: EditText = findViewById(R.id.circularSawNInput)
        val circularSawPnInput: EditText = findViewById(R.id.circularSawPnInput)
        val circularSawKvInput: EditText = findViewById(R.id.circularSawKvInput)
        val circularSawTgInput: EditText = findViewById(R.id.circularSawTgInput)

        val pressNnInput: EditText = findViewById(R.id.pressNnInput)
        val pressCosInput: EditText = findViewById(R.id.pressCosInput)
        val pressUnInput: EditText = findViewById(R.id.pressUnInput)
        val pressNInput: EditText = findViewById(R.id.pressNInput)
        val pressPnInput: EditText = findViewById(R.id.pressPnInput)
        val pressKvInput: EditText = findViewById(R.id.pressKvInput)
        val pressTgInput: EditText = findViewById(R.id.pressTgInput)

        val polishingNnInput: EditText = findViewById(R.id.polishingNnInput)
        val polishingCosInput: EditText = findViewById(R.id.polishingCosInput)
        val polishingUnInput: EditText = findViewById(R.id.polishingUnInput)
        val polishingNInput: EditText = findViewById(R.id.polishingNInput)
        val polishingPnInput: EditText = findViewById(R.id.polishingPnInput)
        val polishingKvInput: EditText = findViewById(R.id.polishingKvInput)
        val polishingTgInput: EditText = findViewById(R.id.polishingTgInput)

        val shaperNnInput: EditText = findViewById(R.id.shaperNnInput)
        val shaperCosInput: EditText = findViewById(R.id.shaperCosInput)
        val shaperUnInput: EditText = findViewById(R.id.shaperUnInput)
        val shaperNInput: EditText = findViewById(R.id.shaperNInput)
        val shaperPnInput: EditText = findViewById(R.id.shaperPnInput)
        val shaperKvInput: EditText = findViewById(R.id.shaperKvInput)
        val shaperTgInput: EditText = findViewById(R.id.shaperTgInput)

        val fanNnInput: EditText = findViewById(R.id.fanNnInput)
        val fanCosInput: EditText = findViewById(R.id.fanCosInput)
        val fanUnInput: EditText = findViewById(R.id.fanUnInput)
        val fanNInput: EditText = findViewById(R.id.fanNInput)
        val fanPnInput: EditText = findViewById(R.id.fanPnInput)
        val fanKvInput: EditText = findViewById(R.id.fanKvInput)
        val fanTgInput: EditText = findViewById(R.id.fanTgInput)

        val weldingNnInput: EditText = findViewById(R.id.weldingTransformerNInput)
        val weldingCosInput: EditText = findViewById(R.id.weldingTransformerCosInput)
        val weldingUnInput: EditText = findViewById(R.id.weldingTransformerUnInput)
        val weldingNInput: EditText = findViewById(R.id.weldingTransformerNInput)
        val weldingPnInput: EditText = findViewById(R.id.weldingTransformerPnInput)
        val weldingKvInput: EditText = findViewById(R.id.weldingTransformerKvInput)
        val weldingTgInput: EditText = findViewById(R.id.weldingTransformerTgInput)

        val dryerNnInput: EditText = findViewById(R.id.dryerWardrobeNnInput)
        val dryerCosInput: EditText = findViewById(R.id.dryerWardrobeCosInput)
        val dryerUnInput: EditText = findViewById(R.id.dryerWardrobeUnInput)
        val dryerNInput: EditText = findViewById(R.id.dryerWardrobeNInput)
        val dryerPnInput: EditText = findViewById(R.id.dryerWardrobePnInput)
        val dryerKvInput: EditText = findViewById(R.id.dryerWardrobeKvInput)
        val dryerTgInput: EditText = findViewById(R.id.dryerWardrobeTgInput)

        calcButton.setOnClickListener {
            val epGrinding: EpData = EpData(
                kpd = grindingNnInput.text.toString().toDouble(),
                cos = grindingCosInput.text.toString().toDouble(),
                power = grindingUnInput.text.toString().toDouble(),
                countEp = grindingNInput.text.toString().toInt(),
                numPower = grindingPnInput.text.toString().toInt(),
                useKef = grindingKvInput.text.toString().toDouble(),
                reactKef = grindingTgInput.text.toString().toDouble(),
            )

            val epDrilled: EpData = EpData(
                kpd = drilledNnInput.text.toString().toDouble(),
                cos = drilledCosInput.text.toString().toDouble(),
                power = drilledUnInput.text.toString().toDouble(),
                countEp = drilledNInput.text.toString().toInt(),
                numPower = drilledPnInput.text.toString().toInt(),
                useKef = drilledKvInput.text.toString().toDouble(),
                reactKef = drilledTgInput.text.toString().toDouble(),
            )

            val epJointing: EpData = EpData(
                kpd = jointingNnInput.text.toString().toDouble(),
                cos = jointingCosInput.text.toString().toDouble(),
                power = jointingUnInput.text.toString().toDouble(),
                countEp = jointingNInput.text.toString().toInt(),
                numPower = jointingPnInput.text.toString().toInt(),
                useKef = jointingKvInput.text.toString().toDouble(),
                reactKef = jointingTgInput.text.toString().toDouble(),
            )

            val epCircularSaw: EpData = EpData(
                kpd = circularSawNnInput.text.toString().toDouble(),
                cos = circularSawCosInput.text.toString().toDouble(),
                power = circularSawUnInput.text.toString().toDouble(),
                countEp = circularSawNInput.text.toString().toInt(),
                numPower = circularSawPnInput.text.toString().toInt(),
                useKef = circularSawKvInput.text.toString().toDouble(),
                reactKef = circularSawTgInput.text.toString().toDouble(),
            )

            val epPress: EpData = EpData(
                kpd = pressNnInput.text.toString().toDouble(),
                cos = pressCosInput.text.toString().toDouble(),
                power = pressUnInput.text.toString().toDouble(),
                countEp = pressNInput.text.toString().toInt(),
                numPower = pressPnInput.text.toString().toInt(),
                useKef = pressKvInput.text.toString().toDouble(),
                reactKef = pressTgInput.text.toString().toDouble(),
            )

            val epPolishing: EpData = EpData(
                kpd = polishingNnInput.text.toString().toDouble(),
                cos = polishingCosInput.text.toString().toDouble(),
                power = polishingUnInput.text.toString().toDouble(),
                countEp = polishingNInput.text.toString().toInt(),
                numPower = polishingPnInput.text.toString().toInt(),
                useKef = polishingKvInput.text.toString().toDouble(),
                reactKef = polishingTgInput.text.toString().toDouble(),
            )

            val epShaper: EpData = EpData(
                kpd = shaperNnInput.text.toString().toDouble(),
                cos = shaperCosInput.text.toString().toDouble(),
                power = shaperUnInput.text.toString().toDouble(),
                countEp = shaperNInput.text.toString().toInt(),
                numPower = shaperPnInput.text.toString().toInt(),
                useKef = shaperKvInput.text.toString().toDouble(),
                reactKef = shaperTgInput.text.toString().toDouble(),
            )

            val epFan: EpData = EpData(
                kpd = fanNnInput.text.toString().toDouble(),
                cos = fanCosInput.text.toString().toDouble(),
                power = fanUnInput.text.toString().toDouble(),
                countEp = fanNInput.text.toString().toInt(),
                numPower = fanPnInput.text.toString().toInt(),
                useKef = fanKvInput.text.toString().toDouble(),
                reactKef = fanTgInput.text.toString().toDouble(),
            )

            val epWelding: EpData = EpData(
                kpd = weldingNnInput.text.toString().toDouble(),
                cos = weldingCosInput.text.toString().toDouble(),
                power = weldingUnInput.text.toString().toDouble(),
                countEp = weldingNInput.text.toString().toInt(),
                numPower = weldingPnInput.text.toString().toInt(),
                useKef = weldingKvInput.text.toString().toDouble(),
                reactKef = weldingTgInput.text.toString().toDouble(),
            )

            val epDryer: EpData = EpData(
                kpd = dryerNnInput.text.toString().toDouble(),
                cos = dryerCosInput.text.toString().toDouble(),
                power = dryerUnInput.text.toString().toDouble(),
                countEp = dryerNInput.text.toString().toInt(),
                numPower = dryerPnInput.text.toString().toInt(),
                useKef = dryerKvInput.text.toString().toDouble(),
                reactKef = dryerTgInput.text.toString().toDouble(),
            )

            var epList: List<EpData> = listOf(epGrinding, epDrilled, epJointing, epCircularSaw, epPress, epPolishing, epShaper, epFan, )

            var heavyMachines: List<EpData> = listOf(epWelding, epDryer)

            val epCalculator = EpCalculator()

            var updatedEpList: List<EpData> = epCalculator.findEmptyFields(epList)
            var updatedHeavyMachines: List<EpData> = epCalculator.findEmptyFields(heavyMachines)


            var shrData = epCalculator.calcShrData(updatedEpList)
            var shrDataList: List<ShrData> = listOf(shrData, shrData, shrData)

            var updatedOverloadData = epCalculator.fullOverload(updatedEpList, shrData, updatedHeavyMachines)

            resultOutput.text = epData(updatedEpList) + "\n" + shrData(shrDataList) +
                    "\n" + epHeavyData(updatedHeavyMachines) + "\n" + overloadData(updatedOverloadData)
        }
    }

    fun epData(epList: List<EpData>): String {
        val epDataNames: List<String> = listOf("Шліфувальний", "Свердлильний верстат", "Фугувальний верстат",
            "Циркулярна пила", "Пресс", "Полірувальний верстат", "Фрезерний верстат", "Вентилятор")

        var resultString = ""

        for (i in 0 until epList.size) {
            resultString += """
            ${epDataNames[i]}:
            Номіальне КПД: ${epList[i].kpd}
            Коефіціент потужності: ${epList[i].cos}
            Напруга: ${epList[i].power}
            Кількість електроприймачів: ${epList[i].countEp}
            Номінальна потужність: ${epList[i].numPower}
            n * P: ${epList[i].nP}
            Коефіціент використання: ${epList[i].useKef}
            n * P * k: ${epList[i].npk}
            n * P * k * tg: ${epList[i].npktg}
            nP^2: ${epList[i].npPow}
            Груповий струм: ${epList[i].groupCurrent}
        """.trimIndent()

            resultString += "\n\n"
        }

        return resultString
    }

    fun epHeavyData(epList: List<EpData>): String {
        val epDataNames: List<String> = listOf("Зварювальний трансформатор", "Сушарка-шафа")

        var resultString = ""

        for (i in 0 until epList.size) {
            resultString += """
            ${epDataNames[i]}:
            Номіальне КПД: ${epList[i].kpd}
            Коефіціент потужності: ${epList[i].cos}
            Напруга: ${epList[i].power}
            Кількість електроприймачів: ${epList[i].countEp}
            Номінальна потужність: ${epList[i].numPower}
            n * P: ${epList[i].nP}
            Коефіціент використання: ${epList[i].useKef}
            n * P * k: ${epList[i].npk}
            n * P * k * tg: ${epList[i].npktg}
            nP^2: ${epList[i].npPow}
            Груповий струм: ${epList[i].groupCurrent}
        """.trimIndent()

            resultString += "\n"
        }

        return resultString
    }

    fun shrData(ShrDataList: List<ShrData>): String {
        val shrDataNames: List<String> = listOf("Група 1", "Група 2", "Група 3")

        var resultString = ""

        for (i in 0 until ShrDataList.size) {
            resultString += """
            ${shrDataNames[i]}:
            Кількість електроприймачів: ${ShrDataList[i].countEp}
            n * P: ${ShrDataList[i].nPGroup}
            Коефіцієнт використання: ${ShrDataList[i].useKefGroup}
            n * P * k: ${ShrDataList[i].npkGroup}
            n * P * k * tg: ${ShrDataList[i].npktgGroup}
            nP^2 групи: ${ShrDataList[i].npPow}
            Ефективна кількість: ${ShrDataList[i].effectionCountity}
            Коефіцієнт активної потужності: ${ShrDataList[i].activPowerKefGroup}
            Коефіцієнт активного навантаження: ${ShrDataList[i].activLoadKefGroup}
            Коефіцієнт реактивного навантаження: ${ShrDataList[i].reactLoadKefGroup}
            Повна потужність: ${ShrDataList[i].fullPower}
            Груповий струм: ${ShrDataList[i].groupCurrent}
        """.trimIndent()
        }

        return resultString
    }

    fun overloadData(overloadData: OverloadData): String {
        var result = """
            Кількість електроприймачів: ${overloadData.countEp}
            n * P: ${overloadData.nP}
            Коефіцієнт використання: ${overloadData.useKef}
            n * p * K: ${overloadData.npk}
            n * P * k * tg: ${overloadData.npktg}
            nP^2: ${overloadData.npPow}
            Ефективна кількість: ${overloadData.effectionCountity}
            Коефіцієнт активної потужності: ${overloadData.activPowerKefGroup}
            Коефіцієнт активного навантаження: ${overloadData.activLoadKefGroup}
            Коефіцієнт реактивного навантаження: ${overloadData.reactLoadKefGroup}
            Повна потужність: ${overloadData.fullPower}
            Груповий струм: ${overloadData.groupCurrent}
        """.trimIndent()

        return result
    }
}