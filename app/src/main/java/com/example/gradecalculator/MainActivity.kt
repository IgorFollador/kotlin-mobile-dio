package com.example.gradecalculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculate = calculate
        val result = result
        result.setTextColor(Color.RED)
        btnCalculate.setOnClickListener{
            val grade1 = Integer.parseInt(grade1.text.toString())
            val grade2 = Integer.parseInt(grade2.text.toString())
            val average = (grade1+grade2)/2
            val absences = Integer.parseInt(absences.text.toString())

            if(average >= 7 && absences <= 10) {
                result.setText("The student was APPROVED!\n" + "Your average is: $average\n" + "Absences: $absences")
                result.setTextColor(Color.GREEN)
            }else if(average >=7 && absences > 10)  {
                result.setText("The student FAILED for absences!\n" + "Your average is: $average\n" + "Absences: $absences")
            }else if(average < 7 && absences <= 10) {
                result.setText("The student FAILED\nfor not achieving the average!\n" + "Your average is: $average\n" + "Absences: $absences")
            }else result.setText("The student FAILED!\n" + "Your average is: $average\n" + "Absences: $absences")
        }
    }
}