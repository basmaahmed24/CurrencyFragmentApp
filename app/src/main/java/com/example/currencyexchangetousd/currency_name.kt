package com.example.currencyexchangetousd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast


class currency_name : Fragment() {
override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    val radioGroup = view.findViewById<RadioGroup>(R.id.group)
    radioGroup.setOnCheckedChangeListener { group, checkedId ->
        when (checkedId) {
            R.id.jod -> {
          val txt : TextView = view.findViewById(R.id.res)
                txt.text = ""
                txt.text = "The Jordanian dinar (Arabic: دينار أردني; code: JOD; unofficially abbreviated as JD) has been the currency of Jordan since 1950"
            }
            R.id.eur -> {
                val txt : TextView = view.findViewById(R.id.res)
                txt.text = ""
                txt.text = "The euro (symbol: €; code: EUR) is the official currency of 20 of the 27 member states of the European Union (EU)"
            }
            R.id.aed -> {
                val txt : TextView = view.findViewById(R.id.res)
                txt.text = ""
                txt.text = "The UAE dirham(Arabic: درهم اماراتي ) is the official national currency of the United Arab Emirates, and it is officially denoted in the English language by the letters AED, in addition to other unofficial abbreviations such as Dh and Dhs"
            }
            R.id.jpy -> {
                val txt : TextView = view.findViewById(R.id.res)
                txt.text = ""
                txt.text = "The yen (Japanese: 円, symbol: ¥; code: JPY) is the official currency of Japan. It is the third-most traded currency in the foreign exchange market"
            }
            // add more cases for other radio buttons if needed
        }
    }
}


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_currency_name, container, false)
    }


}