package com.example.grocerylist3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.findNavController
import com.example.grocerylist3.databinding.FragmentChooseItemBinding


class ChooseItemFragment : Fragment() {
    private var _binding: FragmentChooseItemBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChooseItemBinding.inflate(inflater, container,false)
        val rootView = binding.root
        binding.button1.setOnClickListener{
            val item = binding.button1.text.toString()
            setFragmentResult("requestKey", bundleOf("bundleKey" to item))

            rootView.findNavController().navigateUp()
        }
        binding.button2.setOnClickListener{
            val item = binding.button2.text.toString()
            setFragmentResult("requestKey", bundleOf("bundleKey" to item))

            rootView.findNavController().navigateUp()
        }
        binding.button3.setOnClickListener{
            val item = binding.button3.text.toString()
            setFragmentResult("requestKey", bundleOf("bundleKey" to item))

            rootView.findNavController().navigateUp()
        }
        binding.button4.setOnClickListener{
            val item = binding.button4.text.toString()
            setFragmentResult("requestKey", bundleOf("bundleKey" to item))

            rootView.findNavController().navigateUp()
        }
        binding.button5.setOnClickListener{
            val item = binding.button5.text.toString()
            setFragmentResult("requestKey", bundleOf("bundleKey" to item))

            rootView.findNavController().navigateUp()
        }
        binding.button6.setOnClickListener{
            val item = binding.button6.text.toString()
            setFragmentResult("requestKey", bundleOf("bundleKey" to item))

            rootView.findNavController().navigateUp()
        }
        binding.button7.setOnClickListener{
            val item = binding.button7.text.toString()
            setFragmentResult("requestKey", bundleOf("bundleKey" to item))

            rootView.findNavController().navigateUp()
        }
        binding.button8.setOnClickListener{
            val item = binding.button8.text.toString()
            setFragmentResult("requestKey", bundleOf("bundleKey" to item))

            rootView.findNavController().navigateUp()
        }

        return rootView
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}