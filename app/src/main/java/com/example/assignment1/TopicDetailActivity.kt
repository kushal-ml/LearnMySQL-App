package com.example.assignment1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TopicDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topic_detail)

        val topic = intent.getStringExtra("TOPIC")
        val topicDetailTextView: TextView = findViewById(R.id.topicDetailTextView)
        topicDetailTextView.text = getTopicDetail(topic)
    }

    private fun getTopicDetail(topic: String?): String {
        return when (topic) {
            "Introduction" -> "MySQL is a relational database management system\n" +
                    "MySQL is open-source\n" +
                    "MySQL is free\n" +
                    "MySQL is ideal for both small and large applications\n" +
                    "MySQL is very fast, reliable, scalable, and easy to use\n" +
                    "MySQL is cross-platform\n" +
                    "MySQL is compliant with the ANSI SQL standard\n" +
                    "MySQL was first released in 1995\n" +
                    "MySQL is developed, distributed, and supported by Oracle Corporation\n" +
                    "Reference - https://www.w3schools.com/mysql/mysql_intro.asp"

            "MySQL SELECT Statement" -> "The SELECT statement is used to select data from a database.\n" +
                    "SELECT Syntax\n" +
                    "SELECT column1, column2, ...\n" +
                    "FROM table_name;\n" +
                    "Reference -https://www.w3schools.com/mysql/mysql_select.asp  "
            
            "MySQL WHERE Clause" -> "The WHERE clause is used to filter records.\n"+
                    "WHERE Syntax\n" +
                    "SELECT column1, column2, ...\n" +
                    "FROM table_name\n" +
                    "WHERE condition;\n" +
                    "Reference - https://www.w3schools.com/mysql/mysql_where.asp"

            "MySQL UPDATE Statement" -> "The UPDATE statement is used to modify the existing records in a table.\n"+
                    "UPDATE Syntax\n" +
                    "UPDATE table_name\n" +
                    "SET column1 = value1, column2 = value2, ...\n" +
                    "WHERE condition;\n" +
                    "Reference - https://www.w3schools.com/mysql/mysql_update.asp"

            else -> "No details available."
        }
    }
}
