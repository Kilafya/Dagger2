package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.ExampleRepositoryImpl
import com.example.dependencyinjectionstart.example2.domain.ExampleRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

	@Provides
	fun provideExampleRepository(
		repositoryImpl: ExampleRepositoryImpl
	): ExampleRepository = repositoryImpl
}