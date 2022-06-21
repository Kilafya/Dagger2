package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.ExampleLocalDataSource
import com.example.dependencyinjectionstart.example2.data.ExampleLocalDataSourceImpl
import com.example.dependencyinjectionstart.example2.data.ExampleRemoteDataSource
import com.example.dependencyinjectionstart.example2.data.ExampleRemoteDataSourceImpl
import dagger.Module
import dagger.Provides

@Module
class DataModule {

	@Provides
	fun provideExampleLocalDataSource(
		impl: ExampleLocalDataSourceImpl
	): ExampleLocalDataSource = impl

	@Provides
	fun provideExampleRemoteDataSource(
		impl: ExampleRemoteDataSourceImpl
	): ExampleRemoteDataSource = impl
}