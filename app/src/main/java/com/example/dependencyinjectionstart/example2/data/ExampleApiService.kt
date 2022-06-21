package com.example.dependencyinjectionstart.example2.data

import android.content.Context
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleApiService @Inject constructor(
    private val context: Context,
    private val currentTime: Long
    ) {

    fun method() {
        Log.d("EXAMPLE_TEST", "ExampleApiService - $this context - $context current time - $currentTime")
    }
}
