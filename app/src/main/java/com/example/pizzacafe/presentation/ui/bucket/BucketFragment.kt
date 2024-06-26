package com.example.pizzacafe.presentation.ui.bucket

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.pizzacafe.PizzaCafeApplication
import com.example.pizzacafe.databinding.FragmentBucketBinding
import com.example.pizzacafe.presentation.ViewModelFactory
import javax.inject.Inject

class BucketFragment : Fragment() {

    private var _binding: FragmentBucketBinding? = null
    private val binding: FragmentBucketBinding
        get() = _binding ?: throw RuntimeException("FragmentBucketBinding is null")

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[BucketViewModel::class.java]
    }

    private val component by lazy {
        (requireActivity().application as PizzaCafeApplication).component
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        component.inject(this)
        _binding = FragmentBucketBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}