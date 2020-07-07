package com.hiltapplication.ui

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.hiltapplication.repository.post.remote.SamplePostsService
import com.hiltapplication.utils.NetworkHelper
import kotlinx.coroutines.launch

class SampleViewModel @ViewModelInject
constructor(
    private val samplePostsService: SamplePostsService,
    private val networkHelper: NetworkHelper,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {


    init {
        fetchPost()
    }

    fun fetchPost(){
        viewModelScope.launch {
            if (networkHelper.isNetworkConnected()){
                samplePostsService.getPosts().let {

                }
            }
        }
    }


}