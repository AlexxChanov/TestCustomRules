package com.example.customrules

import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.RuleSet
import io.gitlab.arturbosch.detekt.api.RuleSetProvider

class CustomRuleSetProvider : RuleSetProvider {
  override val ruleSetId: String = "synthetic-import-rule"
  override fun instance(config: Config): RuleSet = RuleSet(ruleSetId,
    listOf(NoSyntheticImportRule(), SingleExpressionFunRule()))
}