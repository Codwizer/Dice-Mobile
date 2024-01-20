package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.lang.reflect.Array
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollButtton : Button = findViewById(R.id.roll_button)
        rollButtton.setOnClickListener {
            Toast.makeText(
                this,
                "Dice is Rolled!",
                Toast.LENGTH_SHORT
            ).show()

            rollDice()
        }
    }

    private fun rollDice() {
        var result : TextView = findViewById(R.id.result_text)
        var resImage: ImageView = findViewById(R.id.resImage)
        var rnd : Int = Random().nextInt(6) + 1
        var dices = arrayOf(
            R.drawable.dice_1, 
            R.drawable.dice_2, 
            R.drawable.dice_3, 
            R.drawable.dice_4, 
            R.drawable.dice_5, 
            R.drawable.dice_6
        );

        resImage.setImageResource(dices[rnd - 1]);
        result.setText("Dice Result is ${rnd}");
    }
}
