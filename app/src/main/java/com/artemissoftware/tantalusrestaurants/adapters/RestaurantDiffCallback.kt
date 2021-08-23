package com.artemissoftware.tantalusrestaurants.adapters

import androidx.recyclerview.widget.DiffUtil
import com.artemissoftware.tantalusrestaurants.data.Restaurant

class RestaurantDiffCallback : DiffUtil.ItemCallback<Restaurant>() {
    override fun areItemsTheSame(oldItem: Restaurant, newItem: Restaurant) =
        oldItem.name == newItem.name

    override fun areContentsTheSame(oldItem: Restaurant, newItem: Restaurant) =
        oldItem == newItem
}