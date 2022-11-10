package com.ipsoft.kmmsampleproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform