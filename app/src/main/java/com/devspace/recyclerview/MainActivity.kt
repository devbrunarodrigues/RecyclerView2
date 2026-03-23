package com.devspace.recyclerview

import android.annotation.SuppressLint
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val rvlist = findViewById<RecyclerView>(R.id.rv_list)
        val ivList = findViewById<ImageView>(R.id.iv_list)
        val ivGrid = findViewById<ImageView>(R.id.iv_grid)
        val adapter = ContactListAdapter()

        rvlist.adapter = adapter
        rvlist.layoutManager = LinearLayoutManager(this)
        adapter.submitList(contacts)

        ivGrid.setOnClickListener {
            rvlist.layoutManager = GridLayoutManager(this, 2)
        }

        ivList.setOnClickListener {
            rvlist.layoutManager = LinearLayoutManager(this)
        }
        adapter.setOnClickListener { contact ->

        }

    }
}

val contacts = listOf(
    Contact(
        "Maria",
        "(55) 11 935623765",
        R.drawable.sample1

    ),
    Contact(
        "Pedro",
        "(55) 11 937483095",
        R.drawable.sample2

    ),

    Contact(
        "Ana",
        "(55) 13 998642567",
        R.drawable.sample3

    ),
    Contact(
        "Marina",
        "(55) 11 908647382",
        R.drawable.sample4

    ),
    Contact(
        "Manuela",
        "(55) 11 947836542",
        R.drawable.sample5

    ),
    Contact(
        "Agata",
        "(55) 11 964786735",
        R.drawable.sample6

    ),
    Contact(
        "Joana",
        "(55) 11 934789654",
        R.drawable.sample7

    ),
    Contact(
        "Lucas",
        "(55) 11 934678734",
        R.drawable.sample8

    ),
    Contact(
        "Rui",
        "(55) 11 934567281",
        R.drawable.sample9

    ),
    Contact(
        "Paulo",
        "(55) 11 998987654",
        R.drawable.sample10

    ),
    Contact(
        "Liz",
        "(55) 11 998456341",
        R.drawable.sample11

    ),
    Contact(
        "Josue",
        "(55) 11 990765413",
        R.drawable.sample12

    ),
    Contact(
        "Beatriz",
        "(55) 11 998675413",
        R.drawable.sample13

    ),
    Contact(
        "Raphael",
        "(55) 11 997765432",
        R.drawable.sample14

    ),
    Contact(
        "Luana",
        "(55) 11 995643524",
        R.drawable.sample15

    ),
    Contact(
        "Marcia",
        "(55) 11 990785432",
        R.drawable.sample16

    ),
)