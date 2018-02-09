package activitytransition.sriyank.com.activitytransition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void slideTransition(View view) {

        startActivity(new Intent(MainActivity.this, SecondActivity.class));

        // ( for incoming SecondActivity, for outgoing MainActivity )
        overridePendingTransition(R.anim.activity_open_translate,R.anim.activity_close_scale);

    }


    public void pushTransition(View view) {

        startActivity(new Intent(MainActivity.this, SecondActivity.class));

        //push from bottom to top
        overridePendingTransition(R.anim.activity_push_up_in, R.anim.activity_push_up_out);

    }


}
