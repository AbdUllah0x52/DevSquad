package com.example.devsquad.presentation.viewmodels

import androidx.lifecycle.ViewModel

class AuthViewModel:ViewModel() {
    private val _isAuth = false
    public fun isAuthenticated () : Boolean = _isAuth
}