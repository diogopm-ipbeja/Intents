package pt.ipbeja.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 0

        val incrementBtn = findViewById<Button>(R.id.increment)
        val decrementBtn = findViewById<Button>(R.id.decrement)
        val counterView = findViewById<TextView>(R.id.counter)

        val nextBtn = findViewById<Button>(R.id.nextBtn)
        val inputText = findViewById<EditText>(R.id.textInput)

        incrementBtn.setOnClickListener {
            counter++
            counterView.text = "$counter"
        }


        decrementBtn.setOnClickListener {
            counter--
            counterView.text = "$counter"
        }

        nextBtn.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java).apply {
                putExtra("counter", counter)
                putExtra("name", inputText.text.toString())
            }

            startActivity(intent)
        }


    }
}