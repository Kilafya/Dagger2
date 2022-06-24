package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.*
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

	@ProdQualifier
	@Binds
	@ApplicationScope
	fun bindExampleRemoteDataSource(
		impl: ExampleRemoteDataSourceImpl
	): ExampleRemoteDataSource

	@TestQualifier
	@Binds
	@ApplicationScope
	fun bindTestRemoteDataSource(
		impl: TestRemoteDataSourceImpl
	): ExampleRemoteDataSource
}