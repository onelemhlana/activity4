package com.example.healthyhabits

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import vcmsa.ci.icetask4.R

class DetailActivity() : AppCompatActivity(), Parcelable {
    constructor() : this()

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DetailActivity> {
        override fun createFromParcel(parcel: Parcel): DetailActivity {
            return DetailActivity()
        }

        override fun newArray(size: Int): Array<DetailActivity?> {
            return arrayOfNulls(size)
        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        findViewById<TextView>(R.id.detailText)

        intent.getIntArrayExtra("water")
        intent.getIntArrayExtra("exercise")
        intent.getIntArrayExtra("sleep")
        intent.getStringArrayExtra("notes")
        arrayOf(
            "2024-04-02",
            "2024-04-03",
            "2024-04-04",
            "2024-04-05",
            "2024-04-06",
            "2024-04-07",
            "2024-04-08"
        )
    }
