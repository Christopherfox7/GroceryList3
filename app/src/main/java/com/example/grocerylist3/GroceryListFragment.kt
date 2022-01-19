package com.example.grocerylist3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.findNavController
import com.example.grocerylist3.databinding.FragmentGroceryListBinding



class GroceryListFragment : Fragment() {
    private var _binding: FragmentGroceryListBinding? = null
    private val binding get() = _binding!!
    var index = 0
    var result = ""
    var text1 = ""
    var text2 = ""
    var text3 = ""
    var text4 = ""
    var text5 = ""
    var titletext = ""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGroceryListBinding.inflate(inflater, container,false)
        val rootView = binding.root
        binding.textView.text = text1
        binding.textView2.text = text2
        binding.textView3.text = text3
        binding.textView4.text = text4
        binding.textView5.text = text5



        setFragmentResultListener("requestKey"){ requestKey, bundle ->
            result = bundle.getString("bundleKey") +""

            if(index==1){
                binding.textView.text = result
                text1 = result
            }
            if(index==2){
                binding.textView2.text = result
                text2 = result
            }
            if(index==3){
                binding.textView3.text = result
                text3 = result
            }
            if(index==4){
                binding.textView4.text = result
                text4 = result
            }
            if(index==5){
                binding.textView5.text = result
                text5 = result
            }
        }


        val args = GroceryListFragmentArgs.fromBundle(requireArguments())
        binding.welcomeText.text = args.messageArg
        titletext = args.messageArg
        binding.pickItemButton.setOnClickListener{
            val action = GroceryListFragmentDirections.actionGroceryListFragmentToChooseItemFragment()
            rootView.findNavController().navigate(action)

            index = index + 1
        }

        return rootView

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}