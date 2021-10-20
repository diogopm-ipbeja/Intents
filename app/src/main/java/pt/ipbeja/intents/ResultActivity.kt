package pt.ipbeja.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        val name = intent.getStringExtra("name")
        val counter = intent.getIntExtra("counter", -1)

        val nameView = findViewById<TextView>(R.id.name)
        val counterView = findViewById<TextView>(R.id.counter)


        nameView.text = name
        counterView.text = "$counter"
    }
}