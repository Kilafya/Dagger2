package com.example.dependencyinjectionstart.example2.data

import android.content.Context
import android.util.Log
import javax.inject.Inject

class ExampleDatabase @Inject constructor(
    private val context: Context
) {

    fun method() {
        Log.d("EXAMPLE_TEST", "ExampleDatabase - $this context - $context")
    }
}
