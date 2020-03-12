package com.github.satoshun.example

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.github.satoshun.example.nestedscrollview.NestedScrollViewActivity
import com.github.satoshun.example.databinding.AppActBinding
import com.github.satoshun.example.nestedscrollview.NestedNestScrollViewActivity

class AppActivity : AppCompatActivity() {
  private lateinit var binding: AppActBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.app_act)

    binding.nestedScroll.setOnClickListener {
      startActivity(
        Intent(this@AppActivity, NestedScrollViewActivity::class.java)
      )
    }

    binding.nestedNestScroll.setOnClickListener {
      startActivity(
        Intent(this@AppActivity, NestedNestScrollViewActivity::class.java)
      )
    }
  }
}
