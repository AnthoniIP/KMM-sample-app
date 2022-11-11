package com.ipsoft.kmmsampleproject.viewmodels

import kotlinx.coroutines.CoroutineScope

expect abstract class BaseSharedViewModel() {
    val scope: CoroutineScope
    protected fun onCleared()
}