package mx.unam.fi.certificadocurso

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.unam.fi.certificadocurso.ui.theme.CertificadoCursoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CertificadoCursoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CertificateCourse("Alan Dunzz Llampallas",20,"Mobile Apps")
                }
            }
        }
    }
}

@Composable
fun CertificateCourse(name: String, number:Int,course:String,modifier: Modifier = Modifier) {
    Row(
        modifier= modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ){
        Image(
            painter =
            painterResource(id = R.drawable.escudo_unam), contentDescription = null,
            modifier = modifier.size(50.dp,50.dp),
            alpha = 0.8f
        )
        Text(
            text = "Universidad Nacional\nAutónoma de México",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,

        )
        Image(
            painter =
            painterResource(id = R.drawable.escudo_fi), contentDescription = null,
            modifier = modifier.size(50.dp,50.dp),
            alpha = 0.8f
        )
    }
    Column (
        modifier= modifier
            .fillMaxSize()
            .padding(10.dp),
    verticalArrangement = Arrangement.Center
    ){
        Text(
            text = "This certificate is presented to: ",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = modifier.fillMaxWidth()
            )
        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier.fillMaxWidth()
        ) {
            Image(
                painter =
                painterResource(id = R.drawable.android_logo), contentDescription = null,
                modifier = modifier.fillMaxWidth(),
                alpha = 0.3f
            )
            Text(
                text = name,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier
                    .fillMaxWidth()
            )
        }
        Text(
            text = "Has completed a $number hours course on:\n $course\n",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.fillMaxWidth()
        )
        Row(
            modifier= modifier
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter =
                painterResource(id = R.drawable.firma1), contentDescription = null,
                modifier = modifier.size(100.dp,100.dp),
            )
            Spacer(modifier = Modifier.width(150.dp))
            Image(
                painter =
                painterResource(id = R.drawable.firma_2), contentDescription = null,
                modifier = modifier.size(100.dp,100.dp),
            )
        }
        Row(
            modifier= modifier
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Text(
                text = "Mark Zuckerberg                   Bill Gates",
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = modifier.fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CertificateCoursePreview() {
    CertificadoCursoTheme {
        CertificateCourse("Alan Dunzz Llampallas",20,"Mobile Apps")
    }
}
