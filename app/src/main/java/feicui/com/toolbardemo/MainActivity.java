package feicui.com.toolbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar= (Toolbar) findViewById(R.id.toolBar);

        mToolbar.setLogo(R.mipmap.ic_launcher);
        mToolbar.setTitle("My Title");
        mToolbar.setSubtitle("My Sub");


        setSupportActionBar(mToolbar);
        mToolbar.setNavigationIcon(R.mipmap.ic_launcher);
        mToolbar.setOnMenuItemClickListener(onMenuItemClick);

    }
    private Toolbar.OnMenuItemClickListener onMenuItemClick=new Toolbar.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            String msg="";
            switch (item.getItemId()){
                case R.id.action_edit:
                    msg+="Click edit";
                    break;
                case R.id.action_share:
                    msg += "Click share";
                    break;
                case R.id.action_settings:
                    msg += "Click setting";
                    break;
            }
            if (!msg.equals("")){
                Toast.makeText(MainActivity.this,msg, Toast.LENGTH_SHORT).show();
            }
            return true;
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
