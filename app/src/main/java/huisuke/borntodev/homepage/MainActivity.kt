package huisuke.borntodev.homepage

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    val items = ArrayList<String>()
    var adapter : ArrayAdapter<String>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        items.add("hi")
        items.add("jim")
        adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items)

        itemsListView.adapter = adapter
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun SendSubmit(view: View) {
        val textView :TextView = findViewById(R.id.NameID)

        textView.text = "HUISUKE"

    }
    fun SaveText(view: View){
        val msg = itemsEditText.text.toString()
        itemsEditText.text.clear()
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
        items.add(msg)
        adapter?.notifyDataSetChanged()

    }
    fun btn
}
