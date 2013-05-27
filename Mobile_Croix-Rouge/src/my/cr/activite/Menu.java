/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.cr.activite;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Greenlamp
 */
public class Menu extends ListActivity {

    /**
     * Called when the activity is first created.
     */
    String[] items = {"Consulter", "Recherche"};
    String login;
    String password;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        Bundle b = getIntent().getExtras();
        login = b.getString("login");
        password = b.getString("password");
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String selection = items[position];
        try {
            Class classe = Class.forName("my.cr.activite." + selection);
            Intent intent = new Intent(this, classe);
            intent.putExtra("login", login);
            intent.putExtra("password", password);
            startActivity(intent);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
