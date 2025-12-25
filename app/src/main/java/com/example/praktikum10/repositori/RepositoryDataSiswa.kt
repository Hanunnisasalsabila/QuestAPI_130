package com.example.praktikum10.repositori

import com.example.praktikum10.apiservice.ServiceApiSiswa
import com.example.praktikum10.modeldata.DataSiswa

interface RepositoryDataSiswa {
    suspend fun getDataSiswa() : List<DataSiswa>
}

class JaringanRepositoryDataSiswa(
    private val serviceApiSiswa: ServiceApiSiswa
): RepositoryDataSiswa{

    override suspend fun getDataSiswa() : List<DataSiswa> = serviceApiSiswa.getSiswa()

}