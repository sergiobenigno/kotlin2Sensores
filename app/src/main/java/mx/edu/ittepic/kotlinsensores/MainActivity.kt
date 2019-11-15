package mx.edu.ittepic.kotlinsensores

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var sensorManager: SensorManager ?= null
    var oyenteProximidad : OyenteProximidad ?= null
    var oyenteAcelerometro : OyenteAcelerometro ?= null
    var campo1 : EditText ?= null
    var campo2 : EditText ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campo1 = findViewById(R.id.editText)
        campo2 = findViewById(R.id.editText2)

        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager

        oyenteProximidad = OyenteProximidad(this)
        oyenteAcelerometro = OyenteAcelerometro(this)

        sensorManager?.registerListener(oyenteProximidad,sensorManager?.getDefaultSensor(Sensor.TYPE_PROXIMITY),
            SensorManager.SENSOR_DELAY_NORMAL)

        sensorManager?.registerListener(oyenteAcelerometro,sensorManager?.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
            SensorManager.SENSOR_DELAY_NORMAL)
    }
}
