package com.example.loginregister_server_hw16.fragment

import androidx.navigation.fragment.findNavController
import com.example.chatlist_hw15.base.BaseFragment
import com.example.loginregister_server_hw16.databinding.FragmentRegisterBinding


class RegisterFragment : BaseFragment<FragmentRegisterBinding>(FragmentRegisterBinding::inflate) {

    override fun setListeners() {
        binding.btnRegister.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}