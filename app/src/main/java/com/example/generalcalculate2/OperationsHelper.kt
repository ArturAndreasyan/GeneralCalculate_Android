package com.example.generalcalculate2

class OperationsHelper {

    class OperationsHelper {

        companion object {

            fun add(left_hand_side: Double, right_hand_side: Double): Double {
                val sum = left_hand_side + right_hand_side
                return sum
            }

            fun subtract(left_hand_side: Double, right_hand_side: Double): Double {
                val subtract = left_hand_side - right_hand_side
                return subtract
            }

            fun divide(left_hand_side: Double, right_hand_side: Double): Double {
                val divide = left_hand_side / right_hand_side
                return divide
            }

            fun multiply(left_hand_side: Double, right_hand_side: Double): Double {
                val product = left_hand_side * right_hand_side
                return product
            }

            fun procent(left_hand_side: Double,right_hand_side: Double) : Double{
                val procent = (left_hand_side * right_hand_side) / 100
                return procent
            }
        }

    }
}