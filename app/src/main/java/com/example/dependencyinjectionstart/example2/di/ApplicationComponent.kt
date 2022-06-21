package com.example.dependencyinjectionstart.example2.di

import android.content.Context
import com.example.dependencyinjectionstart.example2.data.ExampleApiService
import com.example.dependencyinjectionstart.example2.data.ExampleDatabase
import com.example.dependencyinjectionstart.example2.presentation.ExampleViewModel
import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

	fun getViewModel(): ExampleViewModel

	fun getDatabase(): ExampleDatabase

	fun getApiService(): ExampleApiService

	fun inject(activity: MainActivity)

//	@Component.Builder
//	interface ApplicationComponentBuilder {
//
//		@BindsInstance
//		fun context(context: Context): ApplicationComponentBuilder
//
//		@BindsInstance
//		fun currentTime(time: Long): ApplicationComponentBuilder
//
//		fun build(): ApplicationComponent
//	}

	@Component.Factory
	interface ApplicationComponentFactory {

		fun create(
			@BindsInstance context: Context,
			@BindsInstance currentTime: Long
		): ApplicationComponent
	}
}