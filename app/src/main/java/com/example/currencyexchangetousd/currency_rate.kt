package com.example.currencyexchangetousd

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView


class currency_rate : Fragment() {
    private lateinit var rate: EditText
    private lateinit var res: TextView
    private lateinit var but: Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rate = view.findViewById(R.id.rate)
        res = view.findViewById(R.id.res)
        but = view.findViewById(R.id.but)

        val radioGroup = view.findViewById<RadioGroup>(R.id.group)
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.jod -> {
                    rate.requestFocus()
                    rate.setText("")
                    but.setOnClickListener {

                   val num1Str = rate.text.toString()
                   val num2Str = res.text.toString()
                   val num1 = num1Str.toDouble()
                   val result = calculat(num1,1.41)
                   res.text = result.toString() + " "+"USD"
               }

                    }
                R.id.eur -> {
                    rate.requestFocus()
                    rate.setText("")
                    but.setOnClickListener {

                        val num1Str = rate.text.toString()
                        val num2Str = res.text.toString()
                        val num1 = num1Str.toDouble()
                        val result = calculat(num1,1.11)
                        res.text = result.toString() + " "+"USD"
                    }
                    }
                R.id.aed -> {
                    rate.requestFocus()
                    rate.setText("")
                    but.setOnClickListener {

                        val num1Str = rate.text.toString()
                        val num2Str = res.text.toString()
                        val num1 = num1Str.toDouble()
                        val result = calculat(num1,0.27)
                        res.text = result.toString() + " "+"USD"
                    }
                     }
                R.id.jpy -> {
                    rate.requestFocus()
                    rate.setText("")
                    but.setOnClickListener {

                        val num1Str = rate.text.toString()
                        val num2Str = res.text.toString()
                        val num1 = num1Str.toDouble()
                        val result = calculat(num1,0.0075)
                        res.text = result.toString() + " "+"USD"
                    }
                    }
                // add more cases for other radio buttons if needed
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_currency_rate, container, false)
    }

    fun calculat(num1: Double, num2: Double): Double {
        return num1 * num2
    }


}