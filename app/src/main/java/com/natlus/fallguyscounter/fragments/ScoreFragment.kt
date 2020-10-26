package com.natlus.fallguyscounter.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.natlus.fallguyscounter.R
import com.natlus.fallguyscounter.databinding.ScoreFragmentBinding
import com.natlus.fallguyscounter.viewmodels.ScoreViewModel

class ScoreFragment : Fragment() {
    private lateinit var viewModel: ScoreViewModel
    private lateinit var binding: ScoreFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.score_fragment, container, false)
        viewModel = ViewModelProvider(this).get(ScoreViewModel::class.java)
        binding.scoreViewModel = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }
}