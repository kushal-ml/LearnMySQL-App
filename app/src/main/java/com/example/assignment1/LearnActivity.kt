package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class LearnActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private lateinit var selectedTopic: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)

        val topicSpinner: Spinner = findViewById(R.id.topicSpinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.topics_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            topicSpinner.adapter = adapter
        }
        topicSpinner.onItemSelectedListener = this

        val selectTopicButton: Button = findViewById(R.id.selectTopicButton)
        selectTopicButton.setOnClickListener {
            val intent = Intent(this, TopicDetailActivity::class.java).apply {
                putExtra("TOPIC", selectedTopic)
            }
            startActivity(intent)
        }
    }

    override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
        selectedTopic = parent.getItemAtPosition(position) as String
    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        // Do nothing
    }
}
