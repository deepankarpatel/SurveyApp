package com.firehawk.surveyapp

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.firehawk.surveyapp.data.ListD
import java.text.SimpleDateFormat
import java.util.*


@SuppressLint("SimpleDateFormat")
@Composable
fun SurveyListItem(list: ListD) {
    val sdf = SimpleDateFormat("dd-MM-yyyy")
    val currentDate = sdf.format(Date())
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Row {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = list.title, style = typography.h6)
                Text(text = list.description, style = typography.caption)
                Text(text = currentDate, modifier = Modifier.align(Alignment.End) )
            }

        }
    }
}