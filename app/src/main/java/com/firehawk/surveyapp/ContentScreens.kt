package com.firehawk.surveyapp

import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items
import com.firehawk.surveyapp.data.DataProvider
import com.firehawk.surveyapp.data.DataProvider2

class ContentScreens: ComponentActivity()


    @Composable
    fun CompletedSurveys() {
        val lists = remember { DataProvider.surveyListCompleted }
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            items(
                items = lists,
                itemContent = {
                    SurveyListItem(list = it)
                }
            )
        }
    }

    @Preview
    @Composable
    fun CompletedSurveysPreview() {
        CompletedSurveys()
    }

    @Composable
    fun PendingSurveys() {
        val lists = remember { DataProvider2.surveyListPending }
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            items(
                items = lists,
                itemContent = {
                    SurveyListItem(list = it)
                }
            )
        }
    }

    @Preview
    @Composable
    fun PendingSurveysPreview() {
        PendingSurveys()
    }
