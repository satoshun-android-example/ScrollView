package com.github.satoshun.example.nestedscrollview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.NestedScrollViewActBinding

class NestedScrollViewActivity : AppCompatActivity() {

  private lateinit var binding: NestedScrollViewActBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.nested_scroll_view_act)
    setSupportActionBar(binding.toolbar)
  }
}
