package com.hiltapplication.di

import com.hiltapplication.repository.post.remote.SamplePostApiHelper
import com.hiltapplication.repository.post.SamplePostApiImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped

@Module
@InstallIn(FragmentComponent::class)
object SamplePostsModule {

    @Provides
    @FragmentScoped
    fun provideApiHelper(apiHelper: SamplePostApiImpl): SamplePostApiHelper = apiHelper


}