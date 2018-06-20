/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.kotlin.dsl.samples

import org.gradle.samples.test.normalizer.FileSeparatorOutputNormalizer
import org.gradle.samples.test.normalizer.JavaObjectSerializationOutputNormalizer
import org.gradle.samples.test.runner.GradleSamplesRunner
import org.gradle.samples.test.runner.SamplesOutputNormalizers
import org.gradle.samples.test.runner.SamplesRoot

import org.junit.runner.RunWith


@RunWith(GradleSamplesRunner::class)
@SamplesRoot("../../samples")
@SamplesOutputNormalizers(value = [JavaObjectSerializationOutputNormalizer::class, FileSeparatorOutputNormalizer::class])
class ExemplarSamplesTest {
    init {
        println("=====")
        System.getProperty("integTest.gradleHomeDir", "NOT HERE").let { println(it) }
        println("=====")
    }
}
