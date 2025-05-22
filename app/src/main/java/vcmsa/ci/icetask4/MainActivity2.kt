package vcmsa.ci.icetask4

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.healthyhabits.DetailActivity

class MainActivity : AppCompatActivity() {
    private val days = arrayOf("2024-04-02", "2024-04-03", "2024-04-04", "2024-04-05", "2024-04-06", "2024-04-07", "2024-04-08")
    private val waterIntake = IntArray(7)
    private val exerciseMinutes = IntArray(7)
    private val sleepHours = IntArray(7)
    private val notes = Array<String?>(7) { null }
    private var currentDayIndex = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val waterInput = findViewById<EditText>(R.id.inputWater)
        val exerciseInput = findViewById<EditText>(R.id.inputExercise)
        val sleepInput = findViewById<EditText>(R.id.inputSleep)
        val notesInput = findViewById<EditText>(R.id.inputNotes)
        val dayText = findViewById<TextView>(R.id.dayText)
        val saveButton = findViewById<Button>(R.id.btnSave)
        val clearButton = findViewById<Button>(R.id.btnClear)
        val detailButton = findViewById<Button>(R.id.btnViewDetail)

        updateDayLabel(dayText)

        saveButton.setOnClickListener {
            try {
                val water = waterInput.text.toString().toInt()
                val exercise = exerciseInput.text.toString().toInt()
                val sleep = sleepInput.text.toString().toInt()
                val note = notesInput.text.toString()

                if (water < 0 || water > 20 || exercise < 0 || sleep < 0 || sleep > 24) {
                    Toast.makeText(this, "Invalid input range!", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                waterIntake[currentDayIndex] = water
                exerciseMinutes[currentDayIndex] = exercise
                sleepHours[currentDayIndex] = sleep
                notes[currentDayIndex] = note

                currentDayIndex++
                if (currentDayIndex < days.size) {
                    updateDayLabel(dayText)
                    waterInput.text.clear()
                    exerciseInput.text.clear()
                    sleepInput.text.clear()
                    notesInput.text.clear()
                } else {
                    Toast.makeText(this, "All days recorded!", Toast.LENGTH_SHORT).show()
                }

            } catch (e: NumberFormatException) {
                Toast.makeText(this, "Please enter numeric values.", Toast.LENGTH_SHORT).show()
            }
        }

        clearButton.setOnClickListener {
            waterIntake.fill(0)
            exerciseMinutes.fill(0)
            sleepHours.fill(0)
            notes.fill(null)
            currentDayIndex = 0
            updateDayLabel(dayText)
        }

        detailButton.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("water", waterIntake)
            intent.putExtra("exercise", exerciseMinutes)
            intent.putExtra("sleep", sleepHours)
            intent.putExtra("notes", notes)
            startActivity(intent)
        }
    }

    @SuppressLint("SetTextI18n")
    private fun updateDayLabel(dayText: TextView) {
        dayText.text = "Day: ${days[currentDayIndex]}"
    }
}
