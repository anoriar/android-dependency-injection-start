package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
//Можно использовать Binds для оптимизации
interface DataModule {

    @Binds
    fun provideLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun provideRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}