package com.example.services

abstract class CRUDService<T>(private val list: MutableList<T> = mutableListOf()){
    fun add(entity: T) {
        list.add(entity)    
    }
    abstract fun update(id: Int, entity: T)
    abstract fun delete(id: Int)
    abstract fun read(id: Int): T?
    fun readAll(): List<T> = list
}