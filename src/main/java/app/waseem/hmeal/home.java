package app.waseem.hmeal;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class home extends AppCompatActivity {
ImageView imageView1,imageView2,imageView3,imageView4;
    ProgressDialog progressDialog;
    public static TextView titletolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        progressDialog = new ProgressDialog(this,R.style.AppTheme);
//        progressDialog.setMessage("Login ...!");
//        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
//
//        progressDialog.show();
        titletolbar= (TextView) findViewById(R.id.nameact);
        titletolbar.setText("Restaurants");
        getSupportFragmentManager().beginTransaction().replace(R.id.frameparpa,new Restorents()).addToBackStack("").commit();

        imageView1 = (ImageView) findViewById(R.id.imag1);
        imageView2 = (ImageView) findViewById(R.id.image2);
        imageView3 = (ImageView) findViewById(R.id.image3);
        imageView4 = (ImageView) findViewById(R.id.image4);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getSupportFragmentManager().beginTransaction().replace(R.id.frameparpa,new Restorents()).addToBackStack("").commit();

            }
        });
         imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frameparpa,new plan2()).addToBackStack("").commit();

            }
        });
         imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
         imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

}
