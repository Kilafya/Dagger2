package com.example.dependencyinjectionstart.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dependencyinjectionstart.R
import com.example.dependencyinjectionstart.example2.ExampleApp
import com.example.dependencyinjectionstart.example2.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy {
        (application as ExampleApp).component
    }

        override fun onCreate(savedInstanceState: Bundle?) {
            component.inject(this)
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            viewModel.method()
//            Log.d("SINGLETON_TEST", "Database - ${viewModel.method()}")
//            Log.d("SINGLETON_TEST", "Database - ${component.getDatabase()}")
//            Log.d("SINGLETON_TEST", "Api Service - ${component.getApiService()}")
//            Log.d("SINGLETON_TEST", "Api Service - ${component.getApiService()}")
        }
}