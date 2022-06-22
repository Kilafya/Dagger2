package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.ExampleLocalDataSource
import com.example.dependencyinjectionstart.example2.data.ExampleLocalDataSourceImpl
import com.example.dependencyinjectionstart.example2.data.ExampleRemoteDataSource
import com.example.dependencyinjectionstart.example2.data.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

	@Binds
	@ApplicationScope
	fun bindExampleLocalDataSource(
		impl: ExampleLocalDataSourceImpl
	): ExampleLocalDataSource

	@Binds
	@ApplicationScope
	fun bindExampleRemoteDataSource(
		impl: ExampleRemoteDataSourceImpl
	): ExampleRemoteDataSource
}