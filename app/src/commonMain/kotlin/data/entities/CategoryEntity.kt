package data.entities

import kotlinx.serialization.Serializable

@Serializable
data class CategoryEntity(
    val id: String,
    val name: String,
    val categoryItems: CategoryItemsEntity,
    val sort: String)