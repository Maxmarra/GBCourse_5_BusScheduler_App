package com.example.busschedule

import android.widget.TextView
import androidx.databinding.BindingAdapter
import java.text.SimpleDateFormat
import java.util.*

@BindingAdapter("unixTime")
fun convertFromUnix(textView: TextView, arrivalTime: Int){
            textView.text = SimpleDateFormat("h:mm a").format(
                    Date(arrivalTime.toLong() * 1000)
                )
}