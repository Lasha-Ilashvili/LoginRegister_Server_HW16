package com.example.loginregister_server_hw16.fragment

import androidx.navigation.fragment.findNavController
import com.example.chatlist_hw15.base.BaseFragment
import com.example.loginregister_server_hw16.databinding.FragmentLoginBinding


class LoginFragment : BaseFragment<FragmentLoginBinding>(FragmentLoginBinding::inflate) {

    override fun setListeners() {
        binding.btnLogin.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}