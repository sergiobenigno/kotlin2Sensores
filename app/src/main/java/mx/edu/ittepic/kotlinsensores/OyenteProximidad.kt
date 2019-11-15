package mx.edu.ittepic.kotlinsensores

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener

class OyenteProximidad (p:MainActivity): SensorEventListener {
    var puntero = p
    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }

    override fun onSensorChanged(event: SensorEvent?) {
        puntero.campo1?.setText("X: ${event!!.values[0]}")
    }

}