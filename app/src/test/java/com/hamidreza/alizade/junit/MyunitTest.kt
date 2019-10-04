package com.hamidreza.alizade.junit

import android.util.Log
import org.junit.Assert.*
import org.junit.Test

class MyunitTest {
    @Test
    fun sumTest() {
        var nums = listOf<Int>(1, 2, 3)
        var outPut: Int = Myunit.sum(nums)
        var expect:Int = 6
        assertEquals(expect,outPut)

    }
    @Test
    fun FloatTest() {
        var nums = listOf<Int>(1, 2, 3)
        var outPut: Float = Myunit.sumFloat(nums)
        var expect:Float =2.0F
        assertEquals(expect,outPut)


    }
    @Test
    fun numExistsTest() {
        var nums = listOf<Int>(1, 2, 3)
        var outPut: Int = Myunit.search(nums,3)
        var expect:Int =10
        assertEquals(expect,outPut)


    }
}