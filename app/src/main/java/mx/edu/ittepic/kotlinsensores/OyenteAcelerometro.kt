package mx.edu.ittepic.kotlinsensores

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener

class OyenteAcelerometro (p:MainActivity): SensorEventListener {
    var puntero = p
    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }

    override fun onSensorChanged(event: SensorEvent?) {
        puntero.campo2?.setText("X: ${event!!.values[0]} Y: ${event!!.values[1]} Z: ${event!!.values[2]}")
    }

}