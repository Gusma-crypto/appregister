package com.example.registerapp.register.presenter

interface RegisterView {
    fun onSuccessRegister(msg : String?)
    fun onErrorRegister(msg : String?)
}