package com.example.turbineexample

import app.cash.turbine.testIn
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.junit.Test

class TurbineTest {
    @Test
    fun turbineTest() =
        runTest {
            val turbine = flowOf("one", "two").testIn(backgroundScope)
            assertEquals("one", turbine.awaitItem())
        }
}