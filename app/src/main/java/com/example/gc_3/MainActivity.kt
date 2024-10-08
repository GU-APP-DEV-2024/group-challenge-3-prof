package com.example.gc_3

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import memorygame.Board

class MainActivity : AppCompatActivity() {
    private lateinit var card1: ImageView
    private lateinit var card2: ImageView
    private lateinit var card3: ImageView
    private lateinit var card4: ImageView
    private lateinit var card5: ImageView
    private lateinit var card6: ImageView

    private lateinit var board: Board

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        board = Board()



        card1 = findViewById(R.id.card_1)
        card1.setOnClickListener { view:View ->
            onClick(view)
        }
        card2 = findViewById(R.id.card_2)
        card2.setOnClickListener { view:View ->
            onClick(view)
        }
        card3 = findViewById(R.id.card_3)
        card3.setOnClickListener { view:View ->
            onClick(view)
        }
        card4 = findViewById(R.id.card_4)
        card4.setOnClickListener { view:View ->
            onClick(view)
        }
        card5 = findViewById(R.id.card_5)
        card5.setOnClickListener { view:View ->
            onClick(view)
        }
        card6 = findViewById(R.id.card_6)
        card6.setOnClickListener { view:View ->
            onClick(view)
        }
    }

    fun getCardID(view: View): Int {
        when (view) {
            card1 -> return 0
            card2 -> return 1
            card3 -> return 2
            card4 -> return 3
            card5 -> return 4
            else -> return 5
        }
    }

    fun onClick(view: View) {
        view as ImageView
        Snackbar.make(view, "Button ${resources.getResourceEntryName(view.id)} was clicked", Snackbar.LENGTH_SHORT).show()
        var card =  board.getValueAt(getCardID(view))
        view.setImageResource(getImageID(card))
    }

    fun getImageID(card: Board.Card) : Int {
        when (card) {
            Board.Card('c', "a") -> return R.drawable.card_clubs_a
            Board.Card('h', "10") -> return R.drawable.card_hearts_10
            Board.Card('d', "3") -> return R.drawable.card_diamonds_3
            else -> return R.drawable.card_back_green
        }
    }
}