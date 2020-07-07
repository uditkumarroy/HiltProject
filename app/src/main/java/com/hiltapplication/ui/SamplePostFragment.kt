package com.hiltapplication.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.hiltapplication.R
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import kotlinx.android.synthetic.main.fragment_sample_post.*

@AndroidEntryPoint
class SamplePostFragment : Fragment() {

    private val sampleViewModel:SampleViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sample_post, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("SamplePostInstance: ",""+sampleViewModel.hashCode())
        button.setOnClickListener { view->
            view.findNavController().navigate(R.id.action_samplePostFragment_to_nextFragment)
        }

    }
}