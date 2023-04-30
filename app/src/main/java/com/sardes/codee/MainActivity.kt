package com.sardes.codee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sardes.codee.data.Question
import com.sardes.codee.data.QuestionsDataProvider
import com.sardes.codee.ui.theme.CodeeBlue
import com.sardes.codee.ui.theme.CodeeGray
import com.sardes.codee.ui.theme.CodeeGreen
import com.sardes.codee.ui.theme.CodeeRed
import com.sardes.codee.ui.theme.CodeeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodeeTheme {
                App()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = CodeeBlue
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(
                start = 20.dp, end = 20.dp, top = 40.dp
            )
        ) {
            Text(
                "Codee",
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                color = CodeeGray
            )

            Spacer(modifier = Modifier.height(10.dp))
            var currentQuestion by remember {
                mutableStateOf(QuestionsDataProvider.questions.random())
            }

            var isFinished by remember { mutableStateOf(false) }

            var progressNumber by remember { mutableStateOf(1) }
            var score by remember { mutableStateOf(0) }

            var selected by remember { mutableStateOf(0) }
            var selectedAnswer by remember { mutableStateOf("") }

            var answered by remember { mutableStateOf(-1) }
            var clicked by remember { mutableStateOf(false) }

            var questionsStatus = remember {
                mutableListOf(
                    ProgressStatus.Current,
                    ProgressStatus.Next,
                    ProgressStatus.Next,
                    ProgressStatus.Next,
                    ProgressStatus.Next,
                    ProgressStatus.Next,
                    ProgressStatus.Next,
                    ProgressStatus.Next,
                    ProgressStatus.Next,
                    ProgressStatus.Next,
                )
            }

            val answeredQuestions = remember { mutableListOf<Question>() }

            when (!isFinished) {
                true -> {
                    MainContent(
                        score,
                        progressNumber,
                        questionsStatus,
                        currentQuestion,
                        answered,
                        selectedAnswer,
                        answeredQuestions,
                        isFinished
                    )
                }

                else -> {
                    EndScreen(
                        score,
                        currentQuestion,
                        questionsStatus,
                        progressNumber,
                        isFinished,
                        answered
                    )
                }
            }
        }
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun MainContent(
    score: Int,
    progressNumber: Int,
    questionsStatus: MutableList<ProgressStatus>,
    currentQuestion: Question,
    answered: Int,
    selectedAnswer: String,
    answeredQuestions: MutableList<Question>,
    isFinished: Boolean
) {
    var answered1 = answered
    var selectedAnswer1 = selectedAnswer
    Text(
        "Score $score/10",
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        color = Color.White
    )

    Spacer(modifier = Modifier.height(10.dp))

    Text(
        "Question $progressNumber/10",
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        color = Color.White
    )

    Spacer(modifier = Modifier.height(10.dp))

    ProgressLinesRow(questionsStatus)

    Spacer(modifier = Modifier.height(30.dp))

    Text(
        currentQuestion.statement,
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        color = Color.White
    )

    Spacer(modifier = Modifier.height(50.dp))

    Column(verticalArrangement = Arrangement.spacedBy(20.dp)) {

        currentQuestion.propositions.forEachIndexed() { index, proposition ->
            AnswerCard(answered1, index, selectedAnswer1, proposition, currentQuestion)
        }

        NextButton(
            answered1,
            currentQuestion,
            selectedAnswer1,
            score,
            questionsStatus,
            progressNumber,
            answeredQuestions,
            isFinished,
            modifier = Modifier
                .align(Alignment.End)
                .fillMaxWidth(0.5f)
        )
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun AnswerCard(
    answered1: Int,
    index: Int,
    selectedAnswer1: String,
    proposition: String,
    currentQuestion: Question
) {
    var answered11 = answered1
    var selectedAnswer11 = selectedAnswer1

    Card(
        onClick = {
            if (answered11 == -1) {
                answered11 = index
                selectedAnswer11 = proposition
            }
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(intrinsicSize = IntrinsicSize.Max),
        border = BorderStroke(
            width = 2.dp,
            color =
            if ((answered11 == index) && (currentQuestion.response == proposition)) CodeeGreen
            else if ((answered11 == index) && (currentQuestion.response != proposition)) CodeeRed
            else CodeeGray
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent,
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp)
                .wrapContentHeight(Alignment.CenterVertically)
        ) {
            Text(
                text = proposition,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Start,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                softWrap = true
            )

            if ((answered11 == index) && (currentQuestion.response == proposition)) {
                Icon(
                    imageVector = Icons.Filled.CheckCircle,
                    contentDescription = null,
                    tint = CodeeGreen
                )
            } else if ((answered11 == index) && (currentQuestion.response != proposition)) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = null,
                    tint = CodeeRed
                )
            } else {
                Icon(
                    painter = painterResource(id = R.drawable.outline_circle),
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }
    }
}

@Composable
private fun NextButton(
    answered: Int,
    currentQuestion: Question,
    selectedAnswer: String,
    score: Int,
    questionsStatus: MutableList<ProgressStatus>,
    progressNumber: Int,
    answeredQuestions: MutableList<Question>,
    isFinished: Boolean,
    modifier: Modifier = Modifier
) {
    var answered1 = answered
    var currentQuestion1 = currentQuestion
    var score1 = score
    var progressNumber1 = progressNumber
    var isFinished1 = isFinished

    Button(
        enabled = answered1 != -1,
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            disabledContainerColor = CodeeGray,
            contentColor = CodeeGray,
        ),
        modifier = modifier,
        onClick = {
            if (currentQuestion1.response == selectedAnswer) {
                score1++
                questionsStatus[progressNumber1 - 1] = ProgressStatus.Good
            } else {
                questionsStatus[progressNumber1 - 1] = ProgressStatus.Bad
            }

            if (progressNumber1 != 10) {
                answeredQuestions.add(currentQuestion1)
                questionsStatus[progressNumber1] = ProgressStatus.Current
                progressNumber1++
                currentQuestion1 = QuestionsDataProvider.questions.random()

                /*
                                    currentQuestion = QuestionsDataProvider.questions.random()
                                        .takeIf { question -> answeredQuestions.contains(question) }!!
*/

            } else {
                isFinished1 = true
            }

            answered1 = -1

        }
    ) {
        Text(text = if (progressNumber1 != 10) "Suivant" else "Terminer")
    }
}

@Composable
private fun EndScreen(
    score: Int,
    currentQuestion: Question,
    questionsStatus: MutableList<ProgressStatus>,
    progressNumber: Int,
    isFinished: Boolean,
    answered: Int
) {
    var score1 = score
    var currentQuestion1 = currentQuestion
    var progressNumber1 = progressNumber
    var isFinished1 = isFinished
    var answered1 = answered

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(50.dp)
    ) {

        Messages(score1)

        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = CodeeGray,
            ),
            modifier = Modifier
                .align(Alignment.End)
                .fillMaxWidth(0.5f),
            onClick = {
                currentQuestion1 = QuestionsDataProvider.questions.random()
                questionsStatus.replaceAll { ProgressStatus.Next }
                questionsStatus[0] = ProgressStatus.Current
                progressNumber1 = 1
                isFinished1 = false
                answered1 = -1
                score1 = 0
            }
        ) {
            Text(text = "Recommencer")
        }
    }
}

@Composable
private fun Messages(score1: Int) {
    Text(
        "Tu termines cette partie avec un score de $score1/10",
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        color = Color.White,
    )

    Text(
        text = when {
            score1 == 0 -> "Tu etes nul, pour ne pas dire null"
            score1 in 1..5 -> "C'est quoi ce score tout pouri"
            score1 in 6..8 -> "Tu t'ensort quand meme"
            score1 == 9 -> "On frolle la perfection. Bravo!"
            else -> "Parfait!. Tu es une machine"
        },
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        color = Color.White
    )
}


//@Preview
@Composable
fun ProgressLinesRow(statusList: List<ProgressStatus>) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(10.dp)) {
        repeat(10) {
            ProgressLine(status = statusList[it], modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun ProgressLine(status: ProgressStatus, modifier: Modifier = Modifier) {
    Spacer(
        modifier
            .height(5.dp)
            .clip(CircleShape)
            .background(
                when (status) {
                    ProgressStatus.Good -> CodeeGreen
                    ProgressStatus.Bad -> CodeeRed
                    ProgressStatus.Current -> Color.White
                    else -> CodeeGray
                }
            )
    )
}

@Preview(showBackground = true, name = "Codee App")
@Composable
fun AppPreview() {
    CodeeTheme {
        App()
    }
}