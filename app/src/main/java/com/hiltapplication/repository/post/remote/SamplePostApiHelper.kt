package com.hiltapplication.repository.post.remote

import com.hiltapplication.models.PlaceHolderPosts
import com.hiltapplication.models.PlaceHolderPostsItem
import com.hiltapplication.utils.Resource
import com.hiltapplication.utils.Result
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped
import retrofit2.Response

interface SamplePostApiHelper {

    suspend fun getPosts(): List<PlaceHolderPostsItem>
}