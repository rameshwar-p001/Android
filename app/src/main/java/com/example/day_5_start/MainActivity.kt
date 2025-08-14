package com.example.day_5_start

import android.os.Bundle
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import kotlin.math.roundToInt

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

    var inputValue by remember { mutableStateOf("") }
    var outputValue by remember { mutableStateOf("") }
    var inputUnit by remember { mutableStateOf("Centimeter") }
    var outputUnit by remember { mutableStateOf("Meter") }
    var isExpanded by remember { mutableStateOf(false) }
    var oExpanded by remember { mutableStateOf(false) }
    val conversionFactor = remember { mutableStateOf(1.0) }
    val oconversionFactor = remember { mutableStateOf(1.0) }


    val customTextStyle = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontSize = 30.sp,
        color = Color.Blue,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Center
    )

    fun convertUnits(){
        val inputValueDouble = inputValue.toDoubleOrNull() ?: 0.0      //?: - it is elvis operator
        val result = (inputValueDouble * conversionFactor.value * 100.0/oconversionFactor.value).roundToInt() / 100.0
        outputValue = result.toString()
    }


    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Unit Converter" ,style = customTextStyle)
        Spacer(modifier = Modifier.padding(10.dp))  //dp=Dencity pixal


        OutlinedTextField(        // text field for input we will use outlintextfield
            value = inputValue,  // inputValue means it is cursor for input
            onValueChange = {
                inputValue = it // 'it' means input value
                convertUnits()
        },
        label = {Text("Enter Value") })


        Spacer(modifier = Modifier.padding(10.dp))

        Row {
//            input box
            Box{
//                input button
                Button(onClick = {isExpanded=true }) {
                    Text(text = inputUnit)
                    // Corrected Icon usage: Arrow drop down was we use
                    Icon(Icons.Filled.ArrowDropDown, contentDescription = "arrow down")
                }
                DropdownMenu(expanded =isExpanded ,onDismissRequest = { isExpanded=false }) {
                    DropdownMenuItem(
                        text = { Text("Centimeter") },
                        onClick = {
                            isExpanded=false
                            inputUnit="Centimeter"
                            conversionFactor.value=0.01
                            convertUnits()

                            })
                    DropdownMenuItem(
                        text = { Text("meter") },
                        onClick = {
                            isExpanded=false
                            inputUnit="meter"
                            conversionFactor.value=1.0
                            convertUnits()
                        })
                    DropdownMenuItem(
                        text = { Text("feet") },
                        onClick = {
                            isExpanded=false
                            inputUnit="feet"
                            conversionFactor.value=0.3048
                            convertUnits()
                        })

                    DropdownMenuItem(
                        text = { Text("milimeter") },
                        onClick = {
                            isExpanded=false
                            inputUnit="milimeter"
                            conversionFactor.value=0.001
                            convertUnits()
                        })

                }
            }
            Spacer(modifier = Modifier.padding(17.dp))
//           output
            Box{
//                output button
                Button(onClick = { oExpanded=true}) {
                    Text(text = outputUnit)
                    // Corrected Icon usage: Arrow drop down was we use
                    Icon(Icons.Filled.ArrowDropDown, contentDescription = "arrow down")

                    DropdownMenu(expanded = oExpanded, onDismissRequest = { oExpanded = false }) {
                        DropdownMenuItem(
                            text = { Text("Centimeter") },
                            onClick = {
                                oExpanded = false
                                outputUnit = "Centimeter"
                                oconversionFactor.value = 0.01
                                convertUnits()
                            }
                        )
                        DropdownMenuItem(
                            text = { Text("Meter") },
                            onClick = {
                                oExpanded = false
                                outputUnit = "Meter"
                                oconversionFactor.value = 1.0
                                convertUnits()
                            }
                        )
                        DropdownMenuItem(
                            text = { Text("feet") },
                            onClick = {
                                oExpanded=false
                                outputUnit="feet"
                                oconversionFactor.value=0.3048
                                convertUnits()
                            })

                        DropdownMenuItem(
                            text = { Text("milimeter") },
                            onClick = {
                                oExpanded=false
                                outputUnit="milimeter"
                                oconversionFactor.value=0.001
                                convertUnits()
                            })

                    }
                }
            }
        }
        Text(text = "Result: $outputValue $outputUnit",
            style = MaterialTheme.typography.headlineLarge)
//        Text("Result")
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


////day 95
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
//    //95
//    var inputValue by remember { mutableStateOf("") }
//    var outputValue by remember { mutableStateOf("") }
//    var inputUnit by remember { mutableStateOf("Centimeter") }
//    var outputUnit by remember { mutableStateOf("Meter") }
//    var isExpanded by remember { mutableStateOf(false) }
//    var oExpanded by remember { mutableStateOf(false) }
//    var conversionFactor by remember { mutableStateOf(1.0) }
//
//    val context = LocalContext.current
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//
//        Text(text = "Unit Converter" , modifier = Modifier.padding(10.dp))
//        Spacer(modifier = Modifier.padding(10.dp))  //dp=Dencity pixal
//
//// 95
//        OutlinedTextField(        // text field for input we will use outlintextfield
//            value = inputValue,  // inputValue means it is cursor for input
//            onValueChange = {
//                inputValue = it    // 'it' means input value
//            },
//            label = {Text("Enter Value") })
////95
//
//        Spacer(modifier = Modifier.padding(10.dp))
//        Row {
//            Box{
//
//                Button(onClick = { }) {
//                    Text(text = "ClickMe!")
//                    // Corrected Icon usage: Arrow drop down was we use
//                    Icon(Icons.Filled.ArrowDropDown, contentDescription = "arrow down")
//                }
//                DropdownMenu(expanded =false ,onDismissRequest = { /*TODO*/ }) {
//                    DropdownMenuItem(
//                        text = { Text("Centimeter") },
//                        onClick = {})
//                    DropdownMenuItem(
//                        text = { Text("meter") },
//                        onClick = {})
//                    DropdownMenuItem(
//                        text = { Text("Kilometer") },
//                        onClick = {})
//
//                    DropdownMenuItem(
//                        text = { Text("Miles") },
//                        onClick = {})
//
//                }
//            }
//            Spacer(modifier = Modifier.padding(17.dp))
//            Box{
//                Button(onClick = { }) {
//                    Text(text = "ClickMe!")
//                    // Corrected Icon usage: Arrow drop down was we use
//                    Icon(Icons.Filled.ArrowDropDown, contentDescription = "arrow down")
//
//                    DropdownMenu(expanded =false ,onDismissRequest = { /*TODO*/ }) {
//                        DropdownMenuItem(
//                            text = { Text("Centimeter") },
//                            onClick = {})
//                        DropdownMenuItem(
//                            text = { Text("meter") },
//                            onClick = {})
//                        DropdownMenuItem(
//                            text = { Text("Kilometer") },
//                            onClick = {})
//
//                        DropdownMenuItem(
//                            text = { Text("Miles") },
//                            onClick = {})
//
//                    }
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