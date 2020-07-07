package com.hiltapplication.repository.post.remote


import com.hiltapplication.models.PlaceHolderPostsItem
import retrofit2.http.GET

interface SamplePostsService {
    @GET("posts")
    suspend fun getPosts(): List<PlaceHolderPostsItem>

}