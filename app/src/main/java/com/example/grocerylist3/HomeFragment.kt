package com.example.grocerylist3
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.grocerylist3.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container,false)
        val rootView = binding.root

        binding.startListButton.setOnClickListener{
            val message = "Welcome " + binding.nameEdit.text.toString()+"!"
            val action = HomeFragmentDirections.actionHomeFragmentToGroceryListFragment(message)
            rootView.findNavController().navigate(action)
        }

        return rootView

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}