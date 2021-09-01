package com.demo.androidbasic.constraint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewAnimationUtils
import androidx.constraintlayout.widget.ConstraintLayout
import com.demo.androidbasic.R
import android.animation.Animator
import android.graphics.Color
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat


class ConstraintActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_constraint)
        val iv2 = findViewById<ImageView>(R.id.iv_2)
        var secondView = findViewById<ConstraintLayout>(R.id.cl_3)
        iv2.setOnClickListener { v ->
            // 获取FloatingActionButton的中心点的坐标
            val centerX = (v.left + v.right) / 2
            val centerY = (v.top + v.bottom) / 2
            // Math.hypot(x,y):  返回sqrt(x2 +y2)
            // 获取扩散的半径
            // Math.hypot(x,y):  返回sqrt(x2 +y2)
            // 获取扩散的半径
            val finalRadius = Math.hypot(centerX.toDouble(), centerY.toDouble()).toFloat()
            // 定义揭露动画
            val mCircularReveal = ViewAnimationUtils.createCircularReveal(
                secondView, 0, 0, 0f, finalRadius
            )
            // 设置动画持续时间，并开始动画
            // 设置动画持续时间，并开始动画
            mCircularReveal.setDuration(4000).start()
        }
    }
}