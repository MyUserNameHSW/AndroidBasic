package com.demo.androidbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import com.demo.androidbasic.actionbar.ActionBarDemoActivity
import com.demo.androidbasic.constraint.ConstraintActivity
import com.demo.androidbasic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnActionBar.setOnClickListener { startActivity(Intent(this, ActionBarDemoActivity::class.java)) }
        binding.btnConstraint.setOnClickListener { startActivity(Intent(this, ConstraintActivity::class.java)) }
    }
}