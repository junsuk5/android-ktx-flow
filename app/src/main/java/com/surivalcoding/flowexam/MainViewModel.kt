package com.surivalcoding.flowexam

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MainViewModel: ViewModel() {
    // 데이터 스트림
    //
    private var count = 0

    val countFlow : Flow<Int> = flow {
        while (count <= 10) {
            count++
            emit(count)
            delay(1000)
        }
    }
}