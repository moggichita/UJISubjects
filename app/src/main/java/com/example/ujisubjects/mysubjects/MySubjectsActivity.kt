package com.example.ujisubjects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.ujisubjects.mysubjects.MySubjectPresenter

class MainActivity : AppCompatActivity() {

    lateinit var addSubjectButton: Button
    lateinit var recyclerViewMySubjects : RecyclerView

    lateinit var presenter : MySubjectPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "My Subjects"

        addSubjectButton = findViewById(R.id.buttonAddSubjects)
        recyclerViewMySubjects = findViewById(R.id.recyclerViewMySubjects)

        presenter = MySubjectPresenter( this )

        addSubjectButton.setOnClickListener { presenter.onAddSubject() }
    }
}