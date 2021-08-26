package com.artemissoftware.tantalusrestaurants.repository

import androidx.room.withTransaction
import com.artemissoftware.tantalusrestaurants.api.RestaurantApi
import com.artemissoftware.tantalusrestaurants.data.RestaurantDatabase
import com.artemissoftware.tantalusrestaurants.util.networkBoundResource
import kotlinx.coroutines.delay
import javax.inject.Inject

class RestaurantRepository @Inject constructor(
    private val api: RestaurantApi,
    private val db: RestaurantDatabase
) {
    private val restaurantDao = db.restaurantDao()

    fun getRestaurants() = networkBoundResource(
        query = { restaurantDao.getAllRestaurants() },
        fetch = {
            delay(2000)  // ONLY FOR TESTING - REMOVE IN REAL APP
            api.getRestaurants()
        },
        saveFetchResult = { restaurants ->
            db.withTransaction {
                restaurantDao.deleteAllRestaurants()
                restaurantDao.insertRestaurants(restaurants)
            }
        }
    )
}