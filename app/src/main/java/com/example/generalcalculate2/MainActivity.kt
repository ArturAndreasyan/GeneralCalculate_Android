package com.example.generalcalculate2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.generalcalculate2.OperationsHelper.OperationsHelper.Companion.subtract

class MainActivity : AppCompatActivity() {

    var digit_on_screen = StringBuilder()
    var operation: Char = ' '
    var leftHandSide: Double = 0.0
    var rightHandSide: Double = 0.0

    val button1 = findViewById<Button>(R.id.one)
    val button2 = findViewById<Button>(R.id.two)
    val button3 = findViewById<Button>(R.id.three)
    val button4 = findViewById<Button>(R.id.four)
    val button5 = findViewById<Button>(R.id.five)
    val button6 = findViewById<Button>(R.id.six)
    val button7 = findViewById<Button>(R.id.seven)
    val button8 = findViewById<Button>(R.id.eight)
    val button9 = findViewById<Button>(R.id.nine)
    val buttonDel = findViewById<Button>(R.id.del)
    val button0 = findViewById<Button>(R.id.zero)
    val answer = findViewById<Button>(R.id.answer)
    val minus = findViewById<Button>(R.id.minus)
    val plus = findViewById<Button>(R.id.plus)
    val x = findViewById<Button>(R.id.x)
    val drop = findViewById<Button>(R.id.drop)
    val doub = findViewById<Button>(R.id.doub)
    val procent = findViewById<Button>(R.id.procent)
    val result_id = findViewById<TextView>(R.id.result_id)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        initializeButtons()
    }

    private fun initializeButtons() {
        functionalButtons()
        operationButtons()
        numericalButtons()
    }

    private fun numericalButtons() {
        button1.setOnClickListener {
            appendToDigitOnScreen("1")
        }
        button2.setOnClickListener {
            appendToDigitOnScreen("2")
        }
        button3.setOnClickListener {
            appendToDigitOnScreen("3")
        }
        button4.setOnClickListener {
            appendToDigitOnScreen("4")
        }
        button5.setOnClickListener {
            appendToDigitOnScreen("5")
        }
        button6.setOnClickListener {
            appendToDigitOnScreen("6")
        }
        button7.setOnClickListener {
            appendToDigitOnScreen("7")
        }
        button8.setOnClickListener {
            appendToDigitOnScreen("8")
        }
        button9.setOnClickListener {
            appendToDigitOnScreen("9")
        }
        button0.setOnClickListener {
            appendToDigitOnScreen("0")
        }
        doub.setOnClickListener {
            appendToDigitOnScreen(".")
        }
    }

    private fun appendToDigitOnScreen(digit: String) {
        digit_on_screen.append(digit)
        result_id.text = digit_on_screen.toString()

    }

    private fun operationButtons() {
        plus.setOnClickListener {
            selectOperation('A')
        }
        minus.setOnClickListener {
            selectOperation('B')
        }
        drop.setOnClickListener {
            selectOperation('C')
        }
        x.setOnClickListener {
            selectOperation('M')
        }
        procent.setOnClickListener {
            selectOperation('P')
        }

    }

    private fun selectOperation(c: Char) {
        operation = c
        leftHandSide = digit_on_screen.toString().toDouble()
        digit_on_screen.clear()
        result_id.text = "0"
    }


    private fun functionalButtons() {
        buttonDel.setOnClickListener {
            digit_on_screen.clear()
        }
        answer.setOnClickListener {
            performMathOperation()
        }
    }

    private fun performMathOperation() {
        rightHandSide = digit_on_screen.toString().toDouble()
        digit_on_screen.clear()

        when (operation) {
            'A' -> {
                val sum = OperationsHelper.OperationsHelper.add(leftHandSide, rightHandSide)
                result_id.text = sum.toString()
                digit_on_screen.append(sum)
            }
            'S' -> {
                val subtract =
                    OperationsHelper.OperationsHelper.subtract(leftHandSide, rightHandSide)
                result_id.text = subtract.toString()
                digit_on_screen.append(subtract)
            }
            'M' -> {
                val multiply =
                    OperationsHelper.OperationsHelper.multiply(leftHandSide, rightHandSide)
                result_id.text = multiply.toString()
                digit_on_screen.append(multiply)
            }
            'D' -> {
                val divide = OperationsHelper.OperationsHelper.divide(leftHandSide, rightHandSide)
                result_id.text = divide.toString()
                digit_on_screen.append(divide)

            }
            'P' ->{
                val proc =
                    OperationsHelper.OperationsHelper.procent(leftHandSide,rightHandSide)
                result_id.text = proc.toString()
                digit_on_screen.append(proc)
            }
        }

    }

    private fun clearDigit() {
        val length = digit_on_screen.length

        digit_on_screen.deleteCharAt(length - 1)
        result_id.text = digit_on_screen.toString()
    }


}




