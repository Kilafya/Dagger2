package com.example.dependencyinjectionstart.example2.data

import com.example.dependencyinjectionstart.example2.di.ProdQualifier
import com.example.dependencyinjectionstart.example2.di.TestQualifier
import com.example.dependencyinjectionstart.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    @ProdQualifier private val remoteDataSource: ExampleRemoteDataSource
) : ExampleRepository {

    override fun method() {
        localDataSource.method()
        remoteDataSource.method()
    }
}
