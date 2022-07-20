package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

/**
 * This will roll the dice and see the result
 * on screen
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }
    /**
     * This will roll the dice and see the result
     * on screen
     */
    private fun rollDice() {
        //Creates six side dice and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        //Updates the screen with dice rolled
        val diceImage: ImageView = findViewById(R.id.imageView)
        //determines which dice picture to show based on the dice roll
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //sets the imageview with the correct dice image
        diceImage.setImageResource(drawableResource)
        //sets description to the imageview
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()


        //2nd Dice
        val dice2 = Dice2(6)
        val diceRoll2 = dice2.roll()
        val diceImage2: ImageView = findViewById(R.id.imageView2)

        val drawableResource2 = when (diceRoll2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //sets the imageview with the correct dice image
        diceImage2.setImageResource(drawableResource2)
        val resultTextView3: TextView = findViewById(R.id.textView3)
        resultTextView3.text = diceRoll2.toString()
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
class Dice2(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}