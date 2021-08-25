package com.demo.androidbasic.actionbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.core.content.ContextCompat
import com.demo.androidbasic.R
import com.demo.androidbasic.databinding.ActivityActionBarDemoBinding
import com.google.android.material.snackbar.Snackbar

/**
 * MaterialToolBar 在Activity中的使用
 */
class ActionBarDemoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityActionBarDemoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActionBarDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar1)
        // 设置toolbar显示默认返回按钮，在onOptionsItemSelected中通过onOptionsItemSelected - android.R.id.home进行事件拦截
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        //toolbar 的设置均可以在xml中进行设置
        binding.toolbar2.apply {
//        title = "DemoTitle"
//        setTitleTextColor(ContextCompat.getColor(this@ActionBarDemoActivity, R.color.teal_200))
//        isTitleCentered = true
//        setNavigationIcon(R.drawable.ic_close_vd_theme_24px)
//        setNavigationOnClickListener { finish() }
            setOnMenuItemClickListener {
                when(it.itemId) {
                    R.id.toolbar_menu_disable ->
                        showSnackBar("disable")
                }
                false
            }

        }
    }

    /**
     * 初始化添加menu
     */
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu1, menu)
        return super.onCreateOptionsMenu(menu)
    }

    /**
     * 筛选点击时间
     */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home ->
                finish()
            R.id.toolbar_menu_disable ->
                showSnackBar("disable")
            R.id.toolbar_menu_edit ->
                showSnackBar("edit")
            R.id.toolbar_menu_fav ->
                showSnackBar("favorite")
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showSnackBar(text: String) {
        Snackbar.make(binding.toolbar1, text, Snackbar.LENGTH_SHORT).show()
    }
}