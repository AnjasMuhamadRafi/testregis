package com.example.androidexerciseil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidexerciseil.adapter.ViewPagerAdapter
import com.example.androidexerciseil.databinding.ActivityMainBinding
import com.example.androidexerciseil.fragment.HomeFragment
import com.example.androidexerciseil.fragment.UserFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupTab()
    }

    private fun setupTab() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(UserFragment(), "User")

        binding.viewPager.adapter = adapter
        binding.tabs.setupWithViewPager(binding.viewPager)

        binding.tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        binding.tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_person_24)
    }
}