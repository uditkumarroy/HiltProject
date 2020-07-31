package com.hiltapplication.di

import com.hiltapplication.repository.post.remote.SamplePostApiHelper
import com.hiltapplication.repository.post.SamplePostRepository
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
    fun provideApiHelper(apiHelper: SamplePostRepository): SamplePostApiHelper = apiHelper


}