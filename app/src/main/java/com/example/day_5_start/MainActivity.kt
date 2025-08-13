package com.example.day_5_start

import android.os.Bundle
import androidx.compose.ui.Alignment
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons // Import the Icons class
import androidx.compose.material.icons.filled.ArrowDropDown // Import the specific icon
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon // Import the Icon composable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.day_5_start.ui.theme.Day_5_startTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()

        setContent {
            Day_5_startTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    day_5_start()
                }
            }

        }
    }
}

@Composable
fun day_5_start() {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
//        horizontalArrangment = Arrangement.Center
    ) {

        Text(text = "Unit Converter" , modifier = Modifier.padding(10.dp))
        Spacer(modifier = Modifier.padding(10.dp))  //dp=Dencity pixal
        OutlinedTextField(value = "", onValueChange = {

        })
        Spacer(modifier = Modifier.padding(10.dp))
        Row {
            Box{

                Button(onClick = { }) {
                    Text(text = "ClickMe!")
                    // Corrected Icon usage: Arrow drop down was we use
                    Icon(Icons.Filled.ArrowDropDown, contentDescription = "arrow down")
                }
                DropdownMenu(expanded =true ,onDismissRequest = { /*TODO*/ }) {
                    DropdownMenuItem(
                        text = { Text("Centimeter") },
                        onClick = {})
                    DropdownMenuItem(
                        text = { Text("meter") },
                        onClick = {})
                    DropdownMenuItem(
                        text = { Text("Kilometer") },
                        onClick = {})

                    DropdownMenuItem(
                        text = { Text("Miles") },
                        onClick = {})

                }
            }
            Spacer(modifier = Modifier.padding(17.dp))
            Box{
                Button(onClick = { }) {
                    Text(text = "ClickMe!")
                    // Corrected Icon usage: Arrow drop down was we use
                    Icon(Icons.Filled.ArrowDropDown, contentDescription = "arrow down")

                    DropdownMenu(expanded =true ,onDismissRequest = { /*TODO*/ }) {
                        DropdownMenuItem(
                            text = { Text("Centimeter") },
                            onClick = {})
                        DropdownMenuItem(
                            text = { Text("meter") },
                            onClick = {})
                        DropdownMenuItem(
                            text = { Text("Kilometer") },
                            onClick = {})

                        DropdownMenuItem(
                            text = { Text("Miles") },
                            onClick = {})

                    }
                }
            }
        }
        Text("Result")
    }
}

@Preview(showBackground = true)
@Composable
fun day_5_startPreview() {
    day_5_start()
}




//Day 5 80,81,82
//It is for only crate a textfield,button,text,Toast msg

//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            Day_5_startTheme {
//                day_5_start()
//            }
//        }
//    }
//}
//@Composable
//fun day_5_start() {
//    val context = LocalContext.current
//    Column {
//        Text(text = "Unit Converter")
//        OutlinedTextField(value = "", onValueChange = {
//
//        })
//        Row {
//            Button(onClick = {
//                Toast.makeText(context, "Thanks for clicking!", Toast.LENGTH_LONG).show()
//            }) {
//                Text(text = "ClickMe!")
//            }
//        }
//        Text("Result")
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun day_5_startPreview() {
//    day_5_start()
//}


////Day 5 83
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            Day_5_startTheme {
//                day_5_start()
//            }
//        }
//    }
//}
//
//@Composable
//fun day_5_start() {
//    val context = LocalContext.current
//    Column {
//        Text(text = "Unit Converter")
//        OutlinedTextField(value = "", onValueChange = {
//
//        })
//        Row {
//            Box{
//                Button(onClick = { }) {
//                    Text(text = "ClickMe!")
//                    // Corrected Icon usage: Arrow drop down was we use
//                    Icon(Icons.Filled.ArrowDropDown, contentDescription = "arrow down")
//                }
//            }
//            Box{
//                Button(onClick = { }) {
//                    Text(text = "ClickMe!")
//                    // Corrected Icon usage: Arrow drop down was we use
//                    Icon(Icons.Filled.ArrowDropDown, contentDescription = "arrow down")
//                }
//            }
//        }
//        Text("Result")
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun day_5_startPreview() {
//    day_5_start()
//}




////Day 5 84,85,
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
////        enableEdgeToEdge()
//
//        setContent {
//            Day_5_startTheme {
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    day_5_start()
//                }
//            }
//
//        }
//    }
//}
//
//@Composable
//fun day_5_start() {
//    val context = LocalContext.current
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
////        horizontalArrangment = Arrangement.Center
//    ) {
//
//        Text(text = "Unit Converter", modifier = Modifier.padding(10.dp))
//        Spacer(modifier = Modifier.padding(10.dp))  //dp=Dencity pixal
//        OutlinedTextField(value = "", onValueChange = {
//
//        })
//        Spacer(modifier = Modifier.padding(10.dp))  //dp=Dencity pixal
//        Row {
//            Box{
//                Button(onClick = { }) {
//                    Text(text = "ClickMe!")
//                    // Corrected Icon usage: Arrow drop down was we use
//                    Icon(Icons.Filled.ArrowDropDown, contentDescription = "arrow down")
//                }
//            }
//            Box{
//                Button(onClick = { }) {
//                    Text(text = "ClickMe!")
//                    // Corrected Icon usage: Arrow drop down was we use
//                    Icon(Icons.Filled.ArrowDropDown, contentDescription = "arrow down")
//                }
//            }
//        }
//        Text("Result")
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun day_5_startPreview() {
//    day_5_start()
//}