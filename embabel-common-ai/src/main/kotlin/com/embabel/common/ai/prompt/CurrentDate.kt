/*
 * Copyright 2024-2025 Embabel Software, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.embabel.common.ai.prompt

import java.time.LocalDate
import java.time.format.DateTimeFormatter

/**
 * Expose the current date as a prompt contributor.
 * Added by Embabel agent platform.
 */
class CurrentDate(
    private val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
) : PromptContributor {

    /**
     * Based on ChatGPT default system prompt
     */
    override fun contribution() = "Current date: ${LocalDate.now().format(formatter)}\n"

    override val role = PromptContribution.CURRENT_DATE_ROLE

    override fun toString(): String = "CurrentDate: [${contribution()}]"

}
