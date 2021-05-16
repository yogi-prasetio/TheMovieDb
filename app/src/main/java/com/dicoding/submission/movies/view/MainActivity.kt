package com.dicoding.submission.movies.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.submission.movies.databinding.ActivityMainBinding
import com.dicoding.submission.movies.view.adapter.SectionPagerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        val sectionsPagerAdapter = SectionPagerAdapter(this, supportFragmentManager)
        activityMainBinding.viewpager.adapter = sectionsPagerAdapter
        activityMainBinding.tabs.setupWithViewPager(activityMainBinding.viewpager)

        supportActionBar?.elevation = 0f
    }
}