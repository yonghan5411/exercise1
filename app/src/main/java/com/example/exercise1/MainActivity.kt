package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener() {

            //car loan
            val price = editTextCarPrice.text.toString()
            val priceValue = price.toDouble()
            val downPrice = editTextDownPayment.text.toString()
            val downValue = downPrice.toDouble()
            val amount:Double = priceValue - downValue

           //interest
            val loanPeriod = editTextLoanPeriod.text.toString()
            val periodValue = Integer.parseInt(loanPeriod)
            val interestRate = editTextInterestRate.text.toString()
            val interestValue = interestRate.toDouble()
            val interest:Double = amount * interestValue * periodValue
           //Monthly payment
            val monthly:Double = ((amount + interest) / periodValue /12)

            textViewLoan.text = "Loan: RM" + "%.2f".format(amount)
            textViewInterest.text = "Interest: RM" + "%.2f".format(interest)
            textViewMonthlyRepayment.text = "Monthly Repayment: RM" + "%.2f".format(monthly)

        

        }





    }





}


