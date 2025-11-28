package com.example.roomdb.repositori

import com.example.roomdb.room.Siswa
import com.example.roomdb.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa{
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}