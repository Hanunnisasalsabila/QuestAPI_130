package com.example.praktikum10.repositori

import com.example.praktikum10.modeldata.DataSiswa

interface RepositoryDataSiswa {
    suspend fun getDataSiswa() : List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa) :retrofit2.Response<Void>
    //suspend fun SatuSiswa(id: Int) : DataSiswa
    //suspend fun editSatuSiswa(id: Int, dataSiswa: DataSiswa):retrofit2.Response<Void>
    //suspend fun hapusSatuSiswa(id: Int):retrofit2.Response<Void>
}
