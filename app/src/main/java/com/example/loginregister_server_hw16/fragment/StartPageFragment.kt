package com.example.loginregister_server_hw16.fragment

import androidx.navigation.fragment.findNavController
import com.example.chatlist_hw15.base.BaseFragment
import com.example.loginregister_server_hw16.databinding.FragmentStartPageBinding

class StartPageFragment :
    BaseFragment<FragmentStartPageBinding>(FragmentStartPageBinding::inflate) {


    override fun setListeners() {
        binding.btnStartRegister.setOnClickListener {
            findNavController().navigate(
                StartPageFragmentDirections.actionStartPageFragmentToRegisterFragment()
            )
        }
        binding.btnStartLogin.setOnClickListener {
            findNavController().navigate(
                StartPageFragmentDirections.actionStartPageFragmentToLoginFragment()
            )
        }
    }
}