package com.firehawk.surveyapp

import androidx.compose.runtime.Composable

typealias ComposableFun = @Composable () -> Unit


sealed class TabItem(var icon: Int, var title: String, var screen: ComposableFun) {
    object CompletedSurveys : TabItem(R.drawable.survey, "Completed Surveys", { CompletedSurveys() })
    object PendingSurveys : TabItem(R.drawable.survey_2, "Pending Surveys", { PendingSurveys () })
}
