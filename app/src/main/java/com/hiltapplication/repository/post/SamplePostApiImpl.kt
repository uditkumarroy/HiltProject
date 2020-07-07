package com.hiltapplication.repository.post

import com.hiltapplication.models.PlaceHolderPostsItem
import com.hiltapplication.repository.post.remote.SamplePostApiHelper
import com.hiltapplication.repository.post.remote.SamplePostsService
import javax.inject.Inject

class SamplePostApiImpl @Inject constructor(private  val samplePostsService: SamplePostsService):
    SamplePostApiHelper {
    override suspend fun getPosts(): List<PlaceHolderPostsItem> = samplePostsService.getPosts()

}