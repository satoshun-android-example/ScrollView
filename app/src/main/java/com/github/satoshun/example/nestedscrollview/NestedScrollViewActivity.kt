package com.github.satoshun.example.nestedscrollview

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.NestedScrollViewActBinding

class NestedScrollViewActivity : AppCompatActivity() {

  private lateinit var binding: NestedScrollViewActBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.nested_scroll_view_act)

    binding.hoge.setOnClickListener {
      binding.container.scrollTo(0, 0)
    }
    binding.hoge2.setOnClickListener {
      binding.container.scrollTo(0, 10000)
    }

    binding.hoge3.setOnClickListener {
      scrollToTargetView(binding.hoge2)
    }
  }

  private fun scrollToTargetView(targetView: View) {
    binding.container.scrollTo(0, targetView.top + binding.container.height)
  }
}
