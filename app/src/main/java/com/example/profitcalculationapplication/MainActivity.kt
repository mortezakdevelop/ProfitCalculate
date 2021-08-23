package com.example.profitcalculationapplication

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.profitcalculationapplication.databinding.ActivityMainBinding
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    // view binding
    lateinit var binding : ActivityMainBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var result : Long
        //calculate profit
        binding.calculateButton.setOnClickListener{
            try {
                result = ( binding.enterPriceEditText.text.toString().toLong() *
                        (binding.enterMountEditText.text.toString().toInt() * 30) *
                        binding.enterProfitEditText.text.toString().toInt()) / 36500

                binding.resultTextView.text = result.toString()
                binding.resultTextView.visibility = View.VISIBLE
            }catch (e:NumberFormatException){
                binding.resultTextView.text = "لطفا همه ی موارد را پر کنید"
                binding.resultTextView.visibility = View.VISIBLE
            }


        }
    }
}