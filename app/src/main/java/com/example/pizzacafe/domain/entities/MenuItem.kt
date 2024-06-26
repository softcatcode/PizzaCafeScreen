package com.example.pizzacafe.domain.entities

import android.graphics.Bitmap

data class MenuItem(
    val name: String = "",
    val price: Int = 0,
    val description: String = "",
    val categoryName: String = "",
    val image: Bitmap? = null,
    val id: Int = UNDEFINED_ID,
) {
    companion object {
        private const val UNDEFINED_ID = -1
    }
}
